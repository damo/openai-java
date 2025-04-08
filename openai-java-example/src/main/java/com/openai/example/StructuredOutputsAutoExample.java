package com.openai.example;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.helpers.StructuredOutputsKt;
import com.openai.models.ChatModel;
import com.openai.models.chat.completions.ChatCompletionCreateParams;

import java.util.List;

public class StructuredOutputsAutoExample {

    public static class Laureate {
        public String name;

        public String dateOfBirth;

        public String majorAchievement;

        public int yearWon;

        @Override
        public String toString() {
            return "Laureate{" +
                    "name='" + name + '\'' +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", majorAchievement='" + majorAchievement + '\'' +
                    ", yearWon=" + yearWon +
                    '}';
        }
    }

    public static class Laureates {
        public List<Laureate> laureates;

        @Override
        public String toString() {
            return "Laureates=" + laureates;
        }
    }

    public static Laureates laureates;

    public static void main(String[] args) throws Exception {
        OpenAIClient client = OpenAIOkHttpClient.fromEnv();

        ChatCompletionCreateParams createParams = ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4O_MINI)
                .maxCompletionTokens(2048)
                // TODO: Put the `fromClass` function in `ResponseFormatJsonSchema.Companion`?
                .responseFormat(StructuredOutputsKt.fromClass(Laureates.class))
                .addUserMessage("Who won Nobel Prizes for physics?")
                .build();

        client.chat().completions().create(createParams).choices().stream()
                .flatMap(choice -> choice.message().content().stream())
                // TODO: Only one choice expected, but this still looks a bit odd.
                .forEach(content -> laureates =
                        StructuredOutputsKt.fromJson(content, Laureates.class));

        System.out.println(laureates);
    }
}

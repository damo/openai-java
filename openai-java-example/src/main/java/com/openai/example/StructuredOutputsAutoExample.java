package com.openai.example;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.helpers.StructuredOutputsBase;
import com.openai.helpers.StructuredOutputsKt;
import com.openai.models.ChatModel;
import com.openai.models.chat.completions.ChatCompletionCreateParams;
import java.util.List;

public class StructuredOutputsAutoExample {

    public static class Person {
        public String givenName;

        public String familyName;

        public String dateOfBirth;

        @Override
        public String toString() {
            return "Person{" + "givenName='"
                    + givenName + '\'' + ", familyName='"
                    + familyName + '\'' + ", dateOfBirth='"
                    + dateOfBirth + '\'' + '}';
        }
    }

    public static class Laureate {
        public Person person;

        public String majorAchievement;

        public int yearWon;

        public double prizeMoney;

        @Override
        public String toString() {
            return "Laureate{" + "person='"
                    + person + '\'' + ", majorAchievement='"
                    + majorAchievement + '\'' + ", yearWon="
                    + yearWon + ", prizeMoney="
                    + prizeMoney + '}';
        }
    }

    public static class Laureates extends StructuredOutputsBase {
        public List<Laureate> laureates;

        @Override
        public String toString() {
            return "Laureates{" + "className=" + getClassName() + ", laureates=" + laureates + '}';
        }
    }

    public static void main(String[] args) throws Exception {
        OpenAIClient client = OpenAIOkHttpClient.fromEnv();

        ChatCompletionCreateParams createParams = ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4O_MINI)
                .maxCompletionTokens(2048)
                // `fromClass1` uses Victools; `fromClass2` uses Jackson.
                .responseFormat(StructuredOutputsKt.fromClass1(Laureates.class))
                .addUserMessage("Who won Nobel Prizes for physics?")
                .build();

        client.chat().completions().create(createParams).choices().stream()
                .flatMap(choice -> choice.message().content().stream())
                .forEach(content -> System.out.println(StructuredOutputsKt.fromJson(content, Laureates.class)));
    }
}

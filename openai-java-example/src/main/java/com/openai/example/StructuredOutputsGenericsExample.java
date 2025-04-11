package com.openai.example;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.helpers.StructuredChatCompletionCreateParams;
import com.openai.helpers.StructuredOutputsBase;
import com.openai.models.ChatModel;
import java.util.List;

public class StructuredOutputsGenericsExample {

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

        StructuredChatCompletionCreateParams<Laureates> createParams =
                StructuredChatCompletionCreateParams.<Laureates>builder()
                        .model(ChatModel.GPT_4O_MINI)
                        .responseFormat(Laureates.class)
                        .addUserMessage("Who won Nobel Prizes for physics?")
                        .build();

        client.chat().completions().create(createParams).choices().stream()
                .flatMap(choice -> choice.message().content().stream())
                .forEach(System.out::println);
    }
}

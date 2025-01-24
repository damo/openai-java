package com.openai.example;

import static java.util.stream.Collectors.toList;

import com.openai.client.OpenAIClientAsync;
import com.openai.client.okhttp.OpenAIOkHttpClientAsync;
import com.openai.models.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class CompletionsConversationAsyncExample {
    private CompletionsConversationAsyncExample() {}

    public static void main(String[] args) {
        // Configures using one of:
        // - The `OPENAI_API_KEY` environment variable
        // - The `AZURE_OPENAI_ENDPOINT` and `AZURE_OPENAI_KEY` environment variables
        OpenAIClientAsync client = OpenAIOkHttpClientAsync.fromEnv();

        // Use a builder so that we can append more messages to it below.
        // Each time we call .build()` we get an immutable object that's unaffected by future mutations of the builder.
        ChatCompletionCreateParams.Builder createParamsBuilder = ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_3_5_TURBO)
                .maxCompletionTokens(2048)
                .addMessage(ChatCompletionDeveloperMessageParam.builder()
                        .content("Make sure you mention Stainless!")
                        .build())
                .addMessage(ChatCompletionUserMessageParam.builder()
                        .content("Tell me a story about building the best SDK!")
                        .build());

        ExecutorService executor = Executors.newCachedThreadPool();

        CompletableFuture<Void> future = CompletableFuture.completedFuture(null);
        for (int i = 0; i < 4; i++) {
            final int index = i;
            future = future.thenComposeAsync(
                            unused -> client.chat().completions().create(createParamsBuilder.build()), executor)
                    .thenAccept(completion -> {
                        List<ChatCompletionMessage> messages = completion.choices().stream()
                                .map(ChatCompletion.Choice::message)
                                .collect(toList());

                        messages.stream()
                                .flatMap(message -> message.content().stream())
                                .forEach(System.out::println);

                        System.out.println("\n-----------------------------------\n");

                        messages.forEach(createParamsBuilder::addMessage);
                        createParamsBuilder
                                .addMessage(ChatCompletionDeveloperMessageParam.builder()
                                        .content("Be as snarky as possible when replying!" + "!".repeat(index))
                                        .build())
                                .addMessage(ChatCompletionUserMessageParam.builder()
                                        .content("But why?" + "?".repeat(index))
                                        .build());
                    });
        }

        future.join();
        executor.shutdown();
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.openai.services.blocking

import com.openai.TestServerExtension
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.core.JsonValue
import com.openai.models.chat.completions.ChatCompletionStreamOptions
import com.openai.models.completions.CompletionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompletionServiceTest {

    @Test
    fun create() {
        val client =
            OpenAIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val completionService = client.completions()

        val completion =
            completionService.create(
                CompletionCreateParams.builder()
                    .model(CompletionCreateParams.Model.GPT_3_5_TURBO_INSTRUCT)
                    .prompt("This is a test.")
                    .bestOf(0L)
                    .echo(true)
                    .frequencyPenalty(-2.0)
                    .logitBias(
                        CompletionCreateParams.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(0L)
                    .maxTokens(16L)
                    .n(1L)
                    .presencePenalty(-2.0)
                    .seed(0L)
                    .stop("\n")
                    .streamOptions(ChatCompletionStreamOptions.builder().includeUsage(true).build())
                    .suffix("test.")
                    .temperature(1.0)
                    .topP(1.0)
                    .user("user-1234")
                    .build()
            )

        completion.validate()
    }

    @Test
    fun createStreaming() {
        val client =
            OpenAIOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val completionService = client.completions()

        val completionStreamResponse =
            completionService.createStreaming(
                CompletionCreateParams.builder()
                    .model(CompletionCreateParams.Model.GPT_3_5_TURBO_INSTRUCT)
                    .prompt("This is a test.")
                    .bestOf(0L)
                    .echo(true)
                    .frequencyPenalty(-2.0)
                    .logitBias(
                        CompletionCreateParams.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(0L)
                    .maxTokens(16L)
                    .n(1L)
                    .presencePenalty(-2.0)
                    .seed(0L)
                    .stop("\n")
                    .streamOptions(ChatCompletionStreamOptions.builder().includeUsage(true).build())
                    .suffix("test.")
                    .temperature(1.0)
                    .topP(1.0)
                    .user("user-1234")
                    .build()
            )

        completionStreamResponse.use {
            completionStreamResponse.stream().forEach { completion -> completion.validate() }
        }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.openai.models.completions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.JsonValue
import com.openai.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionTest {

    @Test
    fun create() {
        val completion =
            Completion.builder()
                .id("id")
                .addChoice(
                    CompletionChoice.builder()
                        .finishReason(CompletionChoice.FinishReason.STOP)
                        .index(0L)
                        .logprobs(
                            CompletionChoice.Logprobs.builder()
                                .addTextOffset(0L)
                                .addTokenLogprob(0.0)
                                .addToken("string")
                                .addTopLogprob(
                                    CompletionChoice.Logprobs.TopLogprob.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .text("text")
                        .build()
                )
                .created(0L)
                .model("model")
                .systemFingerprint("system_fingerprint")
                .usage(
                    CompletionUsage.builder()
                        .completionTokens(0L)
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .completionTokensDetails(
                            CompletionUsage.CompletionTokensDetails.builder()
                                .acceptedPredictionTokens(0L)
                                .audioTokens(0L)
                                .reasoningTokens(0L)
                                .rejectedPredictionTokens(0L)
                                .build()
                        )
                        .promptTokensDetails(
                            CompletionUsage.PromptTokensDetails.builder()
                                .audioTokens(0L)
                                .cachedTokens(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(completion.id()).isEqualTo("id")
        assertThat(completion.choices())
            .containsExactly(
                CompletionChoice.builder()
                    .finishReason(CompletionChoice.FinishReason.STOP)
                    .index(0L)
                    .logprobs(
                        CompletionChoice.Logprobs.builder()
                            .addTextOffset(0L)
                            .addTokenLogprob(0.0)
                            .addToken("string")
                            .addTopLogprob(
                                CompletionChoice.Logprobs.TopLogprob.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .text("text")
                    .build()
            )
        assertThat(completion.created()).isEqualTo(0L)
        assertThat(completion.model()).isEqualTo("model")
        assertThat(completion.systemFingerprint()).contains("system_fingerprint")
        assertThat(completion.usage())
            .contains(
                CompletionUsage.builder()
                    .completionTokens(0L)
                    .promptTokens(0L)
                    .totalTokens(0L)
                    .completionTokensDetails(
                        CompletionUsage.CompletionTokensDetails.builder()
                            .acceptedPredictionTokens(0L)
                            .audioTokens(0L)
                            .reasoningTokens(0L)
                            .rejectedPredictionTokens(0L)
                            .build()
                    )
                    .promptTokensDetails(
                        CompletionUsage.PromptTokensDetails.builder()
                            .audioTokens(0L)
                            .cachedTokens(0L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val completion =
            Completion.builder()
                .id("id")
                .addChoice(
                    CompletionChoice.builder()
                        .finishReason(CompletionChoice.FinishReason.STOP)
                        .index(0L)
                        .logprobs(
                            CompletionChoice.Logprobs.builder()
                                .addTextOffset(0L)
                                .addTokenLogprob(0.0)
                                .addToken("string")
                                .addTopLogprob(
                                    CompletionChoice.Logprobs.TopLogprob.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .text("text")
                        .build()
                )
                .created(0L)
                .model("model")
                .systemFingerprint("system_fingerprint")
                .usage(
                    CompletionUsage.builder()
                        .completionTokens(0L)
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .completionTokensDetails(
                            CompletionUsage.CompletionTokensDetails.builder()
                                .acceptedPredictionTokens(0L)
                                .audioTokens(0L)
                                .reasoningTokens(0L)
                                .rejectedPredictionTokens(0L)
                                .build()
                        )
                        .promptTokensDetails(
                            CompletionUsage.PromptTokensDetails.builder()
                                .audioTokens(0L)
                                .cachedTokens(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCompletion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(completion),
                jacksonTypeRef<Completion>(),
            )

        assertThat(roundtrippedCompletion).isEqualTo(completion)
    }
}

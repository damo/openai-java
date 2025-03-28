// File generated from our OpenAPI spec by Stainless.

package com.openai.models.chat.completions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionContentPartImageTest {

    @Test
    fun create() {
        val chatCompletionContentPartImage =
            ChatCompletionContentPartImage.builder()
                .imageUrl(
                    ChatCompletionContentPartImage.ImageUrl.builder()
                        .url("https://example.com")
                        .detail(ChatCompletionContentPartImage.ImageUrl.Detail.AUTO)
                        .build()
                )
                .build()

        assertThat(chatCompletionContentPartImage.imageUrl())
            .isEqualTo(
                ChatCompletionContentPartImage.ImageUrl.builder()
                    .url("https://example.com")
                    .detail(ChatCompletionContentPartImage.ImageUrl.Detail.AUTO)
                    .build()
            )
    }
}

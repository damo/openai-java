package com.openai.helpers

import com.openai.models.chat.completions.ChatCompletionMessage
import java.util.Optional

class StructuredChatCompletionMessage<T>(
    val responseFormat: Class<T>,
    val chatCompletionMessage: ChatCompletionMessage,
) {
    // ... delegate methods for all `chatCompletionMessage` methods
    // except for `content` (see below)

    val content by lazy { chatCompletionMessage.content().map { fromJson(it, responseFormat) } }

    fun content(): Optional<T> = content
}

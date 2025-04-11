package com.openai.helpers

import com.openai.models.chat.completions.ChatCompletion

class StructuredChatCompletion<T>(
    val responseFormat: Class<T>,
    val chatCompletion: ChatCompletion,
) {

    // ... delegate methods for all `chatCompletion` methods
    // except for `choices` (see below)

    val choices by lazy { chatCompletion.choices().map { Choice<T>(responseFormat, it) } }

    fun choices() = choices

    class Choice<T>(
        private val responseFormat: Class<T>,
        private val choice: ChatCompletion.Choice,
    ) {

        // ... delegate methods for all `choice` methods
        // except for `message` (see below)

        val message by lazy { StructuredChatCompletionMessage<T>(responseFormat, choice.message()) }

        fun message() = message
    }
}

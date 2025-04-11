package com.openai.helpers

import com.openai.core.checkRequired
import com.openai.models.ChatModel
import com.openai.models.chat.completions.ChatCompletionCreateParams

class StructuredChatCompletionCreateParams<T>
private constructor(val responseFormat: Class<T>, val params: ChatCompletionCreateParams) {

    companion object {
        @JvmStatic fun <T> builder() = Builder<T>()
    }

    class Builder<T> {
        private var responseFormat: Class<T>? = null
        private var paramsBuilder = ChatCompletionCreateParams.builder()

        // ... delegate methods for all `paramsBuilder` methods, except for `responseFormat` (see
        // below) and others needed in example code.

        fun model(model: ChatModel) = apply { paramsBuilder.model(model) }

        fun addUserMessage(text: String) = apply { paramsBuilder.addUserMessage(text) }

        fun responseFormat(responseFormat: Class<T>) = apply {
            this.responseFormat = responseFormat
            paramsBuilder.responseFormat(fromClass1(responseFormat))
        }

        fun build() =
            StructuredChatCompletionCreateParams<T>(
                checkRequired("responseFormat", responseFormat),
                paramsBuilder.build(),
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.openai.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.BaseDeserializer
import com.openai.core.BaseSerializer
import com.openai.core.Enum
import com.openai.core.ExcludeMissing
import com.openai.core.JsonField
import com.openai.core.JsonMissing
import com.openai.core.JsonValue
import com.openai.core.NoAutoDetect
import com.openai.core.getOrThrow
import com.openai.core.toUnmodifiable
import com.openai.errors.OpenAIInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ChatCompletionAssistantMessageParam.Builder::class)
@NoAutoDetect
class ChatCompletionAssistantMessageParam
private constructor(
    private val content: JsonField<Content>,
    private val refusal: JsonField<String>,
    private val role: JsonField<Role>,
    private val name: JsonField<String>,
    private val toolCalls: JsonField<List<ChatCompletionMessageToolCall>>,
    private val functionCall: JsonField<FunctionCall>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * The contents of the assistant message. Required unless `tool_calls` or `function_call` is
     * specified.
     */
    fun content(): Optional<Content> = Optional.ofNullable(content.getNullable("content"))

    /** The refusal message by the assistant. */
    fun refusal(): Optional<String> = Optional.ofNullable(refusal.getNullable("refusal"))

    /** The role of the messages author, in this case `assistant`. */
    fun role(): Role = role.getRequired("role")

    /**
     * An optional name for the participant. Provides the model information to differentiate between
     * participants of the same role.
     */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The tool calls generated by the model, such as function calls. */
    fun toolCalls(): Optional<List<ChatCompletionMessageToolCall>> =
        Optional.ofNullable(toolCalls.getNullable("tool_calls"))

    /**
     * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be
     * called, as generated by the model.
     */
    fun functionCall(): Optional<FunctionCall> =
        Optional.ofNullable(functionCall.getNullable("function_call"))

    /**
     * The contents of the assistant message. Required unless `tool_calls` or `function_call` is
     * specified.
     */
    @JsonProperty("content") @ExcludeMissing fun _content() = content

    /** The refusal message by the assistant. */
    @JsonProperty("refusal") @ExcludeMissing fun _refusal() = refusal

    /** The role of the messages author, in this case `assistant`. */
    @JsonProperty("role") @ExcludeMissing fun _role() = role

    /**
     * An optional name for the participant. Provides the model information to differentiate between
     * participants of the same role.
     */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The tool calls generated by the model, such as function calls. */
    @JsonProperty("tool_calls") @ExcludeMissing fun _toolCalls() = toolCalls

    /**
     * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be
     * called, as generated by the model.
     */
    @JsonProperty("function_call") @ExcludeMissing fun _functionCall() = functionCall

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ChatCompletionAssistantMessageParam = apply {
        if (!validated) {
            content()
            refusal()
            role()
            name()
            toolCalls().map { it.forEach { it.validate() } }
            functionCall().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatCompletionAssistantMessageParam &&
            this.content == other.content &&
            this.refusal == other.refusal &&
            this.role == other.role &&
            this.name == other.name &&
            this.toolCalls == other.toolCalls &&
            this.functionCall == other.functionCall &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    content,
                    refusal,
                    role,
                    name,
                    toolCalls,
                    functionCall,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ChatCompletionAssistantMessageParam{content=$content, refusal=$refusal, role=$role, name=$name, toolCalls=$toolCalls, functionCall=$functionCall, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var content: JsonField<Content> = JsonMissing.of()
        private var refusal: JsonField<String> = JsonMissing.of()
        private var role: JsonField<Role> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var toolCalls: JsonField<List<ChatCompletionMessageToolCall>> = JsonMissing.of()
        private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            chatCompletionAssistantMessageParam: ChatCompletionAssistantMessageParam
        ) = apply {
            this.content = chatCompletionAssistantMessageParam.content
            this.refusal = chatCompletionAssistantMessageParam.refusal
            this.role = chatCompletionAssistantMessageParam.role
            this.name = chatCompletionAssistantMessageParam.name
            this.toolCalls = chatCompletionAssistantMessageParam.toolCalls
            this.functionCall = chatCompletionAssistantMessageParam.functionCall
            additionalProperties(chatCompletionAssistantMessageParam.additionalProperties)
        }

        /**
         * The contents of the assistant message. Required unless `tool_calls` or `function_call` is
         * specified.
         */
        fun content(content: Content) = content(JsonField.of(content))

        /**
         * The contents of the assistant message. Required unless `tool_calls` or `function_call` is
         * specified.
         */
        @JsonProperty("content")
        @ExcludeMissing
        fun content(content: JsonField<Content>) = apply { this.content = content }

        /** The refusal message by the assistant. */
        fun refusal(refusal: String) = refusal(JsonField.of(refusal))

        /** The refusal message by the assistant. */
        @JsonProperty("refusal")
        @ExcludeMissing
        fun refusal(refusal: JsonField<String>) = apply { this.refusal = refusal }

        /** The role of the messages author, in this case `assistant`. */
        fun role(role: Role) = role(JsonField.of(role))

        /** The role of the messages author, in this case `assistant`. */
        @JsonProperty("role")
        @ExcludeMissing
        fun role(role: JsonField<Role>) = apply { this.role = role }

        /**
         * An optional name for the participant. Provides the model information to differentiate
         * between participants of the same role.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * An optional name for the participant. Provides the model information to differentiate
         * between participants of the same role.
         */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The tool calls generated by the model, such as function calls. */
        fun toolCalls(toolCalls: List<ChatCompletionMessageToolCall>) =
            toolCalls(JsonField.of(toolCalls))

        /** The tool calls generated by the model, such as function calls. */
        @JsonProperty("tool_calls")
        @ExcludeMissing
        fun toolCalls(toolCalls: JsonField<List<ChatCompletionMessageToolCall>>) = apply {
            this.toolCalls = toolCalls
        }

        /**
         * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should
         * be called, as generated by the model.
         */
        fun functionCall(functionCall: FunctionCall) = functionCall(JsonField.of(functionCall))

        /**
         * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should
         * be called, as generated by the model.
         */
        @JsonProperty("function_call")
        @ExcludeMissing
        fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
            this.functionCall = functionCall
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ChatCompletionAssistantMessageParam =
            ChatCompletionAssistantMessageParam(
                content,
                refusal,
                role,
                name,
                toolCalls.map { it.toUnmodifiable() },
                functionCall,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Role
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Role && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ASSISTANT = Role(JsonField.of("assistant"))

            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
        }

        enum class Known {
            ASSISTANT,
        }

        enum class Value {
            ASSISTANT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ASSISTANT -> Value.ASSISTANT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ASSISTANT -> Known.ASSISTANT
                else -> throw OpenAIInvalidDataException("Unknown Role: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = Content.Deserializer::class)
    @JsonSerialize(using = Content.Serializer::class)
    class Content
    private constructor(
        private val string: String? = null,
        private val chatCompletionRequestAssistantMessageContentParts:
            List<ChatCompletionRequestAssistantMessageContentPart>? =
            null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** The contents of the assistant message. */
        fun string(): Optional<String> = Optional.ofNullable(string)
        /**
         * An array of content parts with a defined type. Can be one or more of type `text`, or
         * exactly one of type `refusal`.
         */
        fun chatCompletionRequestAssistantMessageContentParts():
            Optional<List<ChatCompletionRequestAssistantMessageContentPart>> =
            Optional.ofNullable(chatCompletionRequestAssistantMessageContentParts)

        fun isString(): Boolean = string != null

        fun isChatCompletionRequestAssistantMessageContentParts(): Boolean =
            chatCompletionRequestAssistantMessageContentParts != null

        fun asString(): String = string.getOrThrow("string")

        fun asChatCompletionRequestAssistantMessageContentParts():
            List<ChatCompletionRequestAssistantMessageContentPart> =
            chatCompletionRequestAssistantMessageContentParts.getOrThrow(
                "chatCompletionRequestAssistantMessageContentParts"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                chatCompletionRequestAssistantMessageContentParts != null ->
                    visitor.visitChatCompletionRequestAssistantMessageContentParts(
                        chatCompletionRequestAssistantMessageContentParts
                    )
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Content = apply {
            if (!validated) {
                if (string == null && chatCompletionRequestAssistantMessageContentParts == null) {
                    throw OpenAIInvalidDataException("Unknown Content: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Content &&
                this.string == other.string &&
                this.chatCompletionRequestAssistantMessageContentParts ==
                    other.chatCompletionRequestAssistantMessageContentParts
        }

        override fun hashCode(): Int {
            return Objects.hash(string, chatCompletionRequestAssistantMessageContentParts)
        }

        override fun toString(): String {
            return when {
                string != null -> "Content{string=$string}"
                chatCompletionRequestAssistantMessageContentParts != null ->
                    "Content{chatCompletionRequestAssistantMessageContentParts=$chatCompletionRequestAssistantMessageContentParts}"
                _json != null -> "Content{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Content")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = Content(string = string)

            @JvmStatic
            fun ofChatCompletionRequestAssistantMessageContentParts(
                chatCompletionRequestAssistantMessageContentParts:
                    List<ChatCompletionRequestAssistantMessageContentPart>
            ) =
                Content(
                    chatCompletionRequestAssistantMessageContentParts =
                        chatCompletionRequestAssistantMessageContentParts
                )
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitChatCompletionRequestAssistantMessageContentParts(
                chatCompletionRequestAssistantMessageContentParts:
                    List<ChatCompletionRequestAssistantMessageContentPart>
            ): T

            fun unknown(json: JsonValue?): T {
                throw OpenAIInvalidDataException("Unknown Content: $json")
            }
        }

        class Deserializer : BaseDeserializer<Content>(Content::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Content {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Content(string = it, _json = json)
                }
                tryDeserialize(
                        node,
                        jacksonTypeRef<List<ChatCompletionRequestAssistantMessageContentPart>>()
                    )
                    ?.let {
                        return Content(
                            chatCompletionRequestAssistantMessageContentParts = it,
                            _json = json
                        )
                    }

                return Content(_json = json)
            }
        }

        class Serializer : BaseSerializer<Content>(Content::class) {

            override fun serialize(
                value: Content,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.chatCompletionRequestAssistantMessageContentParts != null ->
                        generator.writeObject(
                            value.chatCompletionRequestAssistantMessageContentParts
                        )
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Content")
                }
            }
        }

        @JsonDeserialize(
            using = ChatCompletionRequestAssistantMessageContentPart.Deserializer::class
        )
        @JsonSerialize(using = ChatCompletionRequestAssistantMessageContentPart.Serializer::class)
        class ChatCompletionRequestAssistantMessageContentPart
        private constructor(
            private val chatCompletionContentPartText: ChatCompletionContentPartText? = null,
            private val chatCompletionContentPartRefusal: ChatCompletionContentPartRefusal? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun chatCompletionContentPartText(): Optional<ChatCompletionContentPartText> =
                Optional.ofNullable(chatCompletionContentPartText)

            fun chatCompletionContentPartRefusal(): Optional<ChatCompletionContentPartRefusal> =
                Optional.ofNullable(chatCompletionContentPartRefusal)

            fun isChatCompletionContentPartText(): Boolean = chatCompletionContentPartText != null

            fun isChatCompletionContentPartRefusal(): Boolean =
                chatCompletionContentPartRefusal != null

            fun asChatCompletionContentPartText(): ChatCompletionContentPartText =
                chatCompletionContentPartText.getOrThrow("chatCompletionContentPartText")

            fun asChatCompletionContentPartRefusal(): ChatCompletionContentPartRefusal =
                chatCompletionContentPartRefusal.getOrThrow("chatCompletionContentPartRefusal")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    chatCompletionContentPartText != null ->
                        visitor.visitChatCompletionContentPartText(chatCompletionContentPartText)
                    chatCompletionContentPartRefusal != null ->
                        visitor.visitChatCompletionContentPartRefusal(
                            chatCompletionContentPartRefusal
                        )
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): ChatCompletionRequestAssistantMessageContentPart = apply {
                if (!validated) {
                    if (
                        chatCompletionContentPartText == null &&
                            chatCompletionContentPartRefusal == null
                    ) {
                        throw OpenAIInvalidDataException(
                            "Unknown ChatCompletionRequestAssistantMessageContentPart: $_json"
                        )
                    }
                    chatCompletionContentPartText?.validate()
                    chatCompletionContentPartRefusal?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChatCompletionRequestAssistantMessageContentPart &&
                    this.chatCompletionContentPartText == other.chatCompletionContentPartText &&
                    this.chatCompletionContentPartRefusal == other.chatCompletionContentPartRefusal
            }

            override fun hashCode(): Int {
                return Objects.hash(chatCompletionContentPartText, chatCompletionContentPartRefusal)
            }

            override fun toString(): String {
                return when {
                    chatCompletionContentPartText != null ->
                        "ChatCompletionRequestAssistantMessageContentPart{chatCompletionContentPartText=$chatCompletionContentPartText}"
                    chatCompletionContentPartRefusal != null ->
                        "ChatCompletionRequestAssistantMessageContentPart{chatCompletionContentPartRefusal=$chatCompletionContentPartRefusal}"
                    _json != null ->
                        "ChatCompletionRequestAssistantMessageContentPart{_unknown=$_json}"
                    else ->
                        throw IllegalStateException(
                            "Invalid ChatCompletionRequestAssistantMessageContentPart"
                        )
                }
            }

            companion object {

                @JvmStatic
                fun ofChatCompletionContentPartText(
                    chatCompletionContentPartText: ChatCompletionContentPartText
                ) =
                    ChatCompletionRequestAssistantMessageContentPart(
                        chatCompletionContentPartText = chatCompletionContentPartText
                    )

                @JvmStatic
                fun ofChatCompletionContentPartRefusal(
                    chatCompletionContentPartRefusal: ChatCompletionContentPartRefusal
                ) =
                    ChatCompletionRequestAssistantMessageContentPart(
                        chatCompletionContentPartRefusal = chatCompletionContentPartRefusal
                    )
            }

            interface Visitor<out T> {

                fun visitChatCompletionContentPartText(
                    chatCompletionContentPartText: ChatCompletionContentPartText
                ): T

                fun visitChatCompletionContentPartRefusal(
                    chatCompletionContentPartRefusal: ChatCompletionContentPartRefusal
                ): T

                fun unknown(json: JsonValue?): T {
                    throw OpenAIInvalidDataException(
                        "Unknown ChatCompletionRequestAssistantMessageContentPart: $json"
                    )
                }
            }

            class Deserializer :
                BaseDeserializer<ChatCompletionRequestAssistantMessageContentPart>(
                    ChatCompletionRequestAssistantMessageContentPart::class
                ) {

                override fun ObjectCodec.deserialize(
                    node: JsonNode
                ): ChatCompletionRequestAssistantMessageContentPart {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<ChatCompletionContentPartText>()) {
                            it.validate()
                        }
                        ?.let {
                            return ChatCompletionRequestAssistantMessageContentPart(
                                chatCompletionContentPartText = it,
                                _json = json
                            )
                        }
                    tryDeserialize(node, jacksonTypeRef<ChatCompletionContentPartRefusal>()) {
                            it.validate()
                        }
                        ?.let {
                            return ChatCompletionRequestAssistantMessageContentPart(
                                chatCompletionContentPartRefusal = it,
                                _json = json
                            )
                        }

                    return ChatCompletionRequestAssistantMessageContentPart(_json = json)
                }
            }

            class Serializer :
                BaseSerializer<ChatCompletionRequestAssistantMessageContentPart>(
                    ChatCompletionRequestAssistantMessageContentPart::class
                ) {

                override fun serialize(
                    value: ChatCompletionRequestAssistantMessageContentPart,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.chatCompletionContentPartText != null ->
                            generator.writeObject(value.chatCompletionContentPartText)
                        value.chatCompletionContentPartRefusal != null ->
                            generator.writeObject(value.chatCompletionContentPartRefusal)
                        value._json != null -> generator.writeObject(value._json)
                        else ->
                            throw IllegalStateException(
                                "Invalid ChatCompletionRequestAssistantMessageContentPart"
                            )
                    }
                }
            }
        }
    }

    /**
     * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be
     * called, as generated by the model.
     */
    @JsonDeserialize(builder = FunctionCall.Builder::class)
    @NoAutoDetect
    class FunctionCall
    private constructor(
        private val arguments: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The arguments to call the function with, as generated by the model in JSON format. Note
         * that the model does not always generate valid JSON, and may hallucinate parameters not
         * defined by your function schema. Validate the arguments in your code before calling your
         * function.
         */
        fun arguments(): String = arguments.getRequired("arguments")

        /** The name of the function to call. */
        fun name(): String = name.getRequired("name")

        /**
         * The arguments to call the function with, as generated by the model in JSON format. Note
         * that the model does not always generate valid JSON, and may hallucinate parameters not
         * defined by your function schema. Validate the arguments in your code before calling your
         * function.
         */
        @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

        /** The name of the function to call. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FunctionCall = apply {
            if (!validated) {
                arguments()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FunctionCall &&
                this.arguments == other.arguments &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        arguments,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var arguments: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(functionCall: FunctionCall) = apply {
                this.arguments = functionCall.arguments
                this.name = functionCall.name
                additionalProperties(functionCall.additionalProperties)
            }

            /**
             * The arguments to call the function with, as generated by the model in JSON format.
             * Note that the model does not always generate valid JSON, and may hallucinate
             * parameters not defined by your function schema. Validate the arguments in your code
             * before calling your function.
             */
            fun arguments(arguments: String) = arguments(JsonField.of(arguments))

            /**
             * The arguments to call the function with, as generated by the model in JSON format.
             * Note that the model does not always generate valid JSON, and may hallucinate
             * parameters not defined by your function schema. Validate the arguments in your code
             * before calling your function.
             */
            @JsonProperty("arguments")
            @ExcludeMissing
            fun arguments(arguments: JsonField<String>) = apply { this.arguments = arguments }

            /** The name of the function to call. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the function to call. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FunctionCall =
                FunctionCall(
                    arguments,
                    name,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}

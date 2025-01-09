// File generated from our OpenAPI spec by Stainless.

package com.openai.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.BaseDeserializer
import com.openai.core.BaseSerializer
import com.openai.core.JsonValue
import com.openai.core.getOrThrow
import com.openai.errors.OpenAIInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * References an image [File](https://platform.openai.com/docs/api-reference/files) in the content
 * of a message.
 */
@JsonDeserialize(using = MessageContent.Deserializer::class)
@JsonSerialize(using = MessageContent.Serializer::class)
class MessageContent
private constructor(
    private val imageFileContentBlock: ImageFileContentBlock? = null,
    private val imageUrlContentBlock: ImageUrlContentBlock? = null,
    private val textContentBlock: TextContentBlock? = null,
    private val refusalContentBlock: RefusalContentBlock? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * References an image [File](https://platform.openai.com/docs/api-reference/files) in the
     * content of a message.
     */
    fun imageFileContentBlock(): Optional<ImageFileContentBlock> =
        Optional.ofNullable(imageFileContentBlock)

    /** References an image URL in the content of a message. */
    fun imageUrlContentBlock(): Optional<ImageUrlContentBlock> =
        Optional.ofNullable(imageUrlContentBlock)

    /** The text content that is part of a message. */
    fun textContentBlock(): Optional<TextContentBlock> = Optional.ofNullable(textContentBlock)

    /** The refusal content generated by the assistant. */
    fun refusalContentBlock(): Optional<RefusalContentBlock> =
        Optional.ofNullable(refusalContentBlock)

    fun isImageFileContentBlock(): Boolean = imageFileContentBlock != null

    fun isImageUrlContentBlock(): Boolean = imageUrlContentBlock != null

    fun isTextContentBlock(): Boolean = textContentBlock != null

    fun isRefusalContentBlock(): Boolean = refusalContentBlock != null

    /**
     * References an image [File](https://platform.openai.com/docs/api-reference/files) in the
     * content of a message.
     */
    fun asImageFileContentBlock(): ImageFileContentBlock =
        imageFileContentBlock.getOrThrow("imageFileContentBlock")

    /** References an image URL in the content of a message. */
    fun asImageUrlContentBlock(): ImageUrlContentBlock =
        imageUrlContentBlock.getOrThrow("imageUrlContentBlock")

    /** The text content that is part of a message. */
    fun asTextContentBlock(): TextContentBlock = textContentBlock.getOrThrow("textContentBlock")

    /** The refusal content generated by the assistant. */
    fun asRefusalContentBlock(): RefusalContentBlock =
        refusalContentBlock.getOrThrow("refusalContentBlock")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            imageFileContentBlock != null ->
                visitor.visitImageFileContentBlock(imageFileContentBlock)
            imageUrlContentBlock != null -> visitor.visitImageUrlContentBlock(imageUrlContentBlock)
            textContentBlock != null -> visitor.visitTextContentBlock(textContentBlock)
            refusalContentBlock != null -> visitor.visitRefusalContentBlock(refusalContentBlock)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): MessageContent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitImageFileContentBlock(
                    imageFileContentBlock: ImageFileContentBlock
                ) {
                    imageFileContentBlock.validate()
                }

                override fun visitImageUrlContentBlock(imageUrlContentBlock: ImageUrlContentBlock) {
                    imageUrlContentBlock.validate()
                }

                override fun visitTextContentBlock(textContentBlock: TextContentBlock) {
                    textContentBlock.validate()
                }

                override fun visitRefusalContentBlock(refusalContentBlock: RefusalContentBlock) {
                    refusalContentBlock.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MessageContent && imageFileContentBlock == other.imageFileContentBlock && imageUrlContentBlock == other.imageUrlContentBlock && textContentBlock == other.textContentBlock && refusalContentBlock == other.refusalContentBlock /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(imageFileContentBlock, imageUrlContentBlock, textContentBlock, refusalContentBlock) /* spotless:on */

    override fun toString(): String =
        when {
            imageFileContentBlock != null ->
                "MessageContent{imageFileContentBlock=$imageFileContentBlock}"
            imageUrlContentBlock != null ->
                "MessageContent{imageUrlContentBlock=$imageUrlContentBlock}"
            textContentBlock != null -> "MessageContent{textContentBlock=$textContentBlock}"
            refusalContentBlock != null ->
                "MessageContent{refusalContentBlock=$refusalContentBlock}"
            _json != null -> "MessageContent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid MessageContent")
        }

    companion object {

        /**
         * References an image [File](https://platform.openai.com/docs/api-reference/files) in the
         * content of a message.
         */
        @JvmStatic
        fun ofImageFileContentBlock(imageFileContentBlock: ImageFileContentBlock) =
            MessageContent(imageFileContentBlock = imageFileContentBlock)

        /** References an image URL in the content of a message. */
        @JvmStatic
        fun ofImageUrlContentBlock(imageUrlContentBlock: ImageUrlContentBlock) =
            MessageContent(imageUrlContentBlock = imageUrlContentBlock)

        /** The text content that is part of a message. */
        @JvmStatic
        fun ofTextContentBlock(textContentBlock: TextContentBlock) =
            MessageContent(textContentBlock = textContentBlock)

        /** The refusal content generated by the assistant. */
        @JvmStatic
        fun ofRefusalContentBlock(refusalContentBlock: RefusalContentBlock) =
            MessageContent(refusalContentBlock = refusalContentBlock)
    }

    interface Visitor<out T> {

        fun visitImageFileContentBlock(imageFileContentBlock: ImageFileContentBlock): T

        fun visitImageUrlContentBlock(imageUrlContentBlock: ImageUrlContentBlock): T

        fun visitTextContentBlock(textContentBlock: TextContentBlock): T

        fun visitRefusalContentBlock(refusalContentBlock: RefusalContentBlock): T

        fun unknown(json: JsonValue?): T {
            throw OpenAIInvalidDataException("Unknown MessageContent: $json")
        }
    }

    class Deserializer : BaseDeserializer<MessageContent>(MessageContent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): MessageContent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "image_file" -> {
                    tryDeserialize(node, jacksonTypeRef<ImageFileContentBlock>()) { it.validate() }
                        ?.let {
                            return MessageContent(imageFileContentBlock = it, _json = json)
                        }
                }
                "image_url" -> {
                    tryDeserialize(node, jacksonTypeRef<ImageUrlContentBlock>()) { it.validate() }
                        ?.let {
                            return MessageContent(imageUrlContentBlock = it, _json = json)
                        }
                }
                "text" -> {
                    tryDeserialize(node, jacksonTypeRef<TextContentBlock>()) { it.validate() }
                        ?.let {
                            return MessageContent(textContentBlock = it, _json = json)
                        }
                }
                "refusal" -> {
                    tryDeserialize(node, jacksonTypeRef<RefusalContentBlock>()) { it.validate() }
                        ?.let {
                            return MessageContent(refusalContentBlock = it, _json = json)
                        }
                }
            }

            return MessageContent(_json = json)
        }
    }

    class Serializer : BaseSerializer<MessageContent>(MessageContent::class) {

        override fun serialize(
            value: MessageContent,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.imageFileContentBlock != null ->
                    generator.writeObject(value.imageFileContentBlock)
                value.imageUrlContentBlock != null ->
                    generator.writeObject(value.imageUrlContentBlock)
                value.textContentBlock != null -> generator.writeObject(value.textContentBlock)
                value.refusalContentBlock != null ->
                    generator.writeObject(value.refusalContentBlock)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid MessageContent")
            }
        }
    }
}

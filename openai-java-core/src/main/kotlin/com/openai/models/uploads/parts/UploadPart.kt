// File generated from our OpenAPI spec by Stainless.

package com.openai.models.uploads.parts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openai.core.ExcludeMissing
import com.openai.core.JsonField
import com.openai.core.JsonMissing
import com.openai.core.JsonValue
import com.openai.core.NoAutoDetect
import com.openai.core.checkRequired
import com.openai.core.immutableEmptyMap
import com.openai.core.toImmutable
import com.openai.errors.OpenAIInvalidDataException
import java.util.Objects

/** The upload Part represents a chunk of bytes we can add to an Upload object. */
@NoAutoDetect
class UploadPart
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("object") @ExcludeMissing private val object_: JsonValue = JsonMissing.of(),
    @JsonProperty("upload_id")
    @ExcludeMissing
    private val uploadId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The upload Part unique identifier, which can be referenced in API endpoints. */
    fun id(): String = id.getRequired("id")

    /** The Unix timestamp (in seconds) for when the Part was created. */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /** The object type, which is always `upload.part`. */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonValue = object_

    /** The ID of the Upload object that this Part was added to. */
    fun uploadId(): String = uploadId.getRequired("upload_id")

    /** The upload Part unique identifier, which can be referenced in API endpoints. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The Unix timestamp (in seconds) for when the Part was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /** The ID of the Upload object that this Part was added to. */
    @JsonProperty("upload_id") @ExcludeMissing fun _uploadId(): JsonField<String> = uploadId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UploadPart = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        _object_().let {
            if (it != JsonValue.from("upload.part")) {
                throw OpenAIInvalidDataException("'object_' is invalid, received $it")
            }
        }
        uploadId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UploadPart].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .uploadId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadPart]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<Long>? = null
        private var object_: JsonValue = JsonValue.from("upload.part")
        private var uploadId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uploadPart: UploadPart) = apply {
            id = uploadPart.id
            createdAt = uploadPart.createdAt
            object_ = uploadPart.object_
            uploadId = uploadPart.uploadId
            additionalProperties = uploadPart.additionalProperties.toMutableMap()
        }

        /** The upload Part unique identifier, which can be referenced in API endpoints. */
        fun id(id: String) = id(JsonField.of(id))

        /** The upload Part unique identifier, which can be referenced in API endpoints. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Unix timestamp (in seconds) for when the Part was created. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /** The Unix timestamp (in seconds) for when the Part was created. */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** The object type, which is always `upload.part`. */
        fun object_(object_: JsonValue) = apply { this.object_ = object_ }

        /** The ID of the Upload object that this Part was added to. */
        fun uploadId(uploadId: String) = uploadId(JsonField.of(uploadId))

        /** The ID of the Upload object that this Part was added to. */
        fun uploadId(uploadId: JsonField<String>) = apply { this.uploadId = uploadId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): UploadPart =
            UploadPart(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                object_,
                checkRequired("uploadId", uploadId),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UploadPart && id == other.id && createdAt == other.createdAt && object_ == other.object_ && uploadId == other.uploadId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, object_, uploadId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UploadPart{id=$id, createdAt=$createdAt, object_=$object_, uploadId=$uploadId, additionalProperties=$additionalProperties}"
}

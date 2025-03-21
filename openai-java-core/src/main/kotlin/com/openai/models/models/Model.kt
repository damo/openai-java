// File generated from our OpenAPI spec by Stainless.

package com.openai.models.models

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

/** Describes an OpenAI model offering that can be used with the API. */
@NoAutoDetect
class Model
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("object") @ExcludeMissing private val object_: JsonValue = JsonMissing.of(),
    @JsonProperty("owned_by")
    @ExcludeMissing
    private val ownedBy: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The model identifier, which can be referenced in the API endpoints. */
    fun id(): String = id.getRequired("id")

    /** The Unix timestamp (in seconds) when the model was created. */
    fun created(): Long = created.getRequired("created")

    /** The object type, which is always "model". */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonValue = object_

    /** The organization that owns the model. */
    fun ownedBy(): String = ownedBy.getRequired("owned_by")

    /** The model identifier, which can be referenced in the API endpoints. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The Unix timestamp (in seconds) when the model was created. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

    /** The organization that owns the model. */
    @JsonProperty("owned_by") @ExcludeMissing fun _ownedBy(): JsonField<String> = ownedBy

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Model = apply {
        if (validated) {
            return@apply
        }

        id()
        created()
        _object_().let {
            if (it != JsonValue.from("model")) {
                throw OpenAIInvalidDataException("'object_' is invalid, received $it")
            }
        }
        ownedBy()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Model].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .created()
         * .ownedBy()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Model]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var created: JsonField<Long>? = null
        private var object_: JsonValue = JsonValue.from("model")
        private var ownedBy: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(model: Model) = apply {
            id = model.id
            created = model.created
            object_ = model.object_
            ownedBy = model.ownedBy
            additionalProperties = model.additionalProperties.toMutableMap()
        }

        /** The model identifier, which can be referenced in the API endpoints. */
        fun id(id: String) = id(JsonField.of(id))

        /** The model identifier, which can be referenced in the API endpoints. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Unix timestamp (in seconds) when the model was created. */
        fun created(created: Long) = created(JsonField.of(created))

        /** The Unix timestamp (in seconds) when the model was created. */
        fun created(created: JsonField<Long>) = apply { this.created = created }

        /** The object type, which is always "model". */
        fun object_(object_: JsonValue) = apply { this.object_ = object_ }

        /** The organization that owns the model. */
        fun ownedBy(ownedBy: String) = ownedBy(JsonField.of(ownedBy))

        /** The organization that owns the model. */
        fun ownedBy(ownedBy: JsonField<String>) = apply { this.ownedBy = ownedBy }

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

        fun build(): Model =
            Model(
                checkRequired("id", id),
                checkRequired("created", created),
                object_,
                checkRequired("ownedBy", ownedBy),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Model && id == other.id && created == other.created && object_ == other.object_ && ownedBy == other.ownedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, created, object_, ownedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Model{id=$id, created=$created, object_=$object_, ownedBy=$ownedBy, additionalProperties=$additionalProperties}"
}

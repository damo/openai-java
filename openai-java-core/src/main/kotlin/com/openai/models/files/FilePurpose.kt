// File generated from our OpenAPI spec by Stainless.

package com.openai.models.files

import com.fasterxml.jackson.annotation.JsonCreator
import com.openai.core.Enum
import com.openai.core.JsonField
import com.openai.errors.OpenAIInvalidDataException

/**
 * The intended purpose of the uploaded file. One of: - `assistants`: Used in the Assistants API -
 * `batch`: Used in the Batch API - `fine-tune`: Used for fine-tuning - `vision`: Images used for
 * vision fine-tuning - `user_data`: Flexible file type for any purpose - `evals`: Used for eval
 * data sets
 */
class FilePurpose @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ASSISTANTS = of("assistants")

        @JvmField val BATCH = of("batch")

        @JvmField val FINE_TUNE = of("fine-tune")

        @JvmField val VISION = of("vision")

        @JvmField val USER_DATA = of("user_data")

        @JvmField val EVALS = of("evals")

        @JvmStatic fun of(value: String) = FilePurpose(JsonField.of(value))
    }

    /** An enum containing [FilePurpose]'s known values. */
    enum class Known {
        ASSISTANTS,
        BATCH,
        FINE_TUNE,
        VISION,
        USER_DATA,
        EVALS,
    }

    /**
     * An enum containing [FilePurpose]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [FilePurpose] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ASSISTANTS,
        BATCH,
        FINE_TUNE,
        VISION,
        USER_DATA,
        EVALS,
        /** An enum member indicating that [FilePurpose] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            ASSISTANTS -> Value.ASSISTANTS
            BATCH -> Value.BATCH
            FINE_TUNE -> Value.FINE_TUNE
            VISION -> Value.VISION
            USER_DATA -> Value.USER_DATA
            EVALS -> Value.EVALS
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws OpenAIInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            ASSISTANTS -> Known.ASSISTANTS
            BATCH -> Known.BATCH
            FINE_TUNE -> Known.FINE_TUNE
            VISION -> Known.VISION
            USER_DATA -> Known.USER_DATA
            EVALS -> Known.EVALS
            else -> throw OpenAIInvalidDataException("Unknown FilePurpose: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws OpenAIInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { OpenAIInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): FilePurpose = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OpenAIInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FilePurpose && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}

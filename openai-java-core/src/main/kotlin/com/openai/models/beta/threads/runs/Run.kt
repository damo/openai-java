// File generated from our OpenAPI spec by Stainless.

package com.openai.models.beta.threads.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openai.core.Enum
import com.openai.core.ExcludeMissing
import com.openai.core.JsonField
import com.openai.core.JsonMissing
import com.openai.core.JsonValue
import com.openai.core.NoAutoDetect
import com.openai.core.checkKnown
import com.openai.core.checkRequired
import com.openai.core.immutableEmptyMap
import com.openai.core.toImmutable
import com.openai.errors.OpenAIInvalidDataException
import com.openai.models.FunctionDefinition
import com.openai.models.Metadata
import com.openai.models.ResponseFormatJsonObject
import com.openai.models.ResponseFormatJsonSchema
import com.openai.models.ResponseFormatText
import com.openai.models.beta.assistants.AssistantTool
import com.openai.models.beta.assistants.CodeInterpreterTool
import com.openai.models.beta.assistants.FileSearchTool
import com.openai.models.beta.assistants.FunctionTool
import com.openai.models.beta.threads.AssistantResponseFormatOption
import com.openai.models.beta.threads.AssistantToolChoice
import com.openai.models.beta.threads.AssistantToolChoiceOption
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Represents an execution run on a
 * [thread](https://platform.openai.com/docs/api-reference/threads).
 */
@NoAutoDetect
class Run
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("assistant_id")
    @ExcludeMissing
    private val assistantId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cancelled_at")
    @ExcludeMissing
    private val cancelledAt: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("failed_at")
    @ExcludeMissing
    private val failedAt: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("incomplete_details")
    @ExcludeMissing
    private val incompleteDetails: JsonField<IncompleteDetails> = JsonMissing.of(),
    @JsonProperty("instructions")
    @ExcludeMissing
    private val instructions: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_error")
    @ExcludeMissing
    private val lastError: JsonField<LastError> = JsonMissing.of(),
    @JsonProperty("max_completion_tokens")
    @ExcludeMissing
    private val maxCompletionTokens: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("max_prompt_tokens")
    @ExcludeMissing
    private val maxPromptTokens: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("model") @ExcludeMissing private val model: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object") @ExcludeMissing private val object_: JsonValue = JsonMissing.of(),
    @JsonProperty("parallel_tool_calls")
    @ExcludeMissing
    private val parallelToolCalls: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("required_action")
    @ExcludeMissing
    private val requiredAction: JsonField<RequiredAction> = JsonMissing.of(),
    @JsonProperty("response_format")
    @ExcludeMissing
    private val responseFormat: JsonField<AssistantResponseFormatOption> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<RunStatus> = JsonMissing.of(),
    @JsonProperty("thread_id")
    @ExcludeMissing
    private val threadId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tool_choice")
    @ExcludeMissing
    private val toolChoice: JsonField<AssistantToolChoiceOption> = JsonMissing.of(),
    @JsonProperty("tools")
    @ExcludeMissing
    private val tools: JsonField<List<AssistantTool>> = JsonMissing.of(),
    @JsonProperty("truncation_strategy")
    @ExcludeMissing
    private val truncationStrategy: JsonField<TruncationStrategy> = JsonMissing.of(),
    @JsonProperty("usage") @ExcludeMissing private val usage: JsonField<Usage> = JsonMissing.of(),
    @JsonProperty("temperature")
    @ExcludeMissing
    private val temperature: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("top_p") @ExcludeMissing private val topP: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The identifier, which can be referenced in API endpoints. */
    fun id(): String = id.getRequired("id")

    /**
     * The ID of the [assistant](https://platform.openai.com/docs/api-reference/assistants) used for
     * execution of this run.
     */
    fun assistantId(): String = assistantId.getRequired("assistant_id")

    /** The Unix timestamp (in seconds) for when the run was cancelled. */
    fun cancelledAt(): Optional<Long> = Optional.ofNullable(cancelledAt.getNullable("cancelled_at"))

    /** The Unix timestamp (in seconds) for when the run was completed. */
    fun completedAt(): Optional<Long> = Optional.ofNullable(completedAt.getNullable("completed_at"))

    /** The Unix timestamp (in seconds) for when the run was created. */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /** The Unix timestamp (in seconds) for when the run will expire. */
    fun expiresAt(): Optional<Long> = Optional.ofNullable(expiresAt.getNullable("expires_at"))

    /** The Unix timestamp (in seconds) for when the run failed. */
    fun failedAt(): Optional<Long> = Optional.ofNullable(failedAt.getNullable("failed_at"))

    /** Details on why the run is incomplete. Will be `null` if the run is not incomplete. */
    fun incompleteDetails(): Optional<IncompleteDetails> =
        Optional.ofNullable(incompleteDetails.getNullable("incomplete_details"))

    /**
     * The instructions that the
     * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
     */
    fun instructions(): String = instructions.getRequired("instructions")

    /** The last error associated with this run. Will be `null` if there are no errors. */
    fun lastError(): Optional<LastError> = Optional.ofNullable(lastError.getNullable("last_error"))

    /**
     * The maximum number of completion tokens specified to have been used over the course of the
     * run.
     */
    fun maxCompletionTokens(): Optional<Long> =
        Optional.ofNullable(maxCompletionTokens.getNullable("max_completion_tokens"))

    /**
     * The maximum number of prompt tokens specified to have been used over the course of the run.
     */
    fun maxPromptTokens(): Optional<Long> =
        Optional.ofNullable(maxPromptTokens.getNullable("max_prompt_tokens"))

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing
     * additional information about the object in a structured format, and querying for objects via
     * API or the dashboard.
     *
     * Keys are strings with a maximum length of 64 characters. Values are strings with a maximum
     * length of 512 characters.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    /**
     * The model that the [assistant](https://platform.openai.com/docs/api-reference/assistants)
     * used for this run.
     */
    fun model(): String = model.getRequired("model")

    /** The object type, which is always `thread.run`. */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonValue = object_

    /**
     * Whether to enable
     * [parallel function calling](https://platform.openai.com/docs/guides/function-calling#configuring-parallel-function-calling)
     * during tool use.
     */
    fun parallelToolCalls(): Boolean = parallelToolCalls.getRequired("parallel_tool_calls")

    /**
     * Details on the action required to continue the run. Will be `null` if no action is required.
     */
    fun requiredAction(): Optional<RequiredAction> =
        Optional.ofNullable(requiredAction.getNullable("required_action"))

    /**
     * Specifies the format that the model must output. Compatible with
     * [GPT-4o](https://platform.openai.com/docs/models#gpt-4o), [GPT-4
     * Turbo](https://platform.openai.com/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo
     * models since `gpt-3.5-turbo-1106`.
     *
     * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs which
     * ensures the model will match your supplied JSON schema. Learn more in the
     * [Structured Outputs guide](https://platform.openai.com/docs/guides/structured-outputs).
     *
     * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the model
     * generates is valid JSON.
     *
     * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
     * yourself via a system or user message. Without this, the model may generate an unending
     * stream of whitespace until the generation reaches the token limit, resulting in a
     * long-running and seemingly "stuck" request. Also note that the message content may be
     * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
     * `max_tokens` or the conversation exceeded the max context length.
     */
    fun responseFormat(): Optional<AssistantResponseFormatOption> =
        Optional.ofNullable(responseFormat.getNullable("response_format"))

    /** The Unix timestamp (in seconds) for when the run was started. */
    fun startedAt(): Optional<Long> = Optional.ofNullable(startedAt.getNullable("started_at"))

    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`,
     * `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
     */
    fun status(): RunStatus = status.getRequired("status")

    /**
     * The ID of the [thread](https://platform.openai.com/docs/api-reference/threads) that was
     * executed on as a part of this run.
     */
    fun threadId(): String = threadId.getRequired("thread_id")

    /**
     * Controls which (if any) tool is called by the model. `none` means the model will not call any
     * tools and instead generates a message. `auto` is the default value and means the model can
     * pick between generating a message or calling one or more tools. `required` means the model
     * must call one or more tools before responding to the user. Specifying a particular tool like
     * `{"type": "file_search"}` or `{"type": "function", "function": {"name": "my_function"}}`
     * forces the model to call that tool.
     */
    fun toolChoice(): Optional<AssistantToolChoiceOption> =
        Optional.ofNullable(toolChoice.getNullable("tool_choice"))

    /**
     * The list of tools that the
     * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
     */
    fun tools(): List<AssistantTool> = tools.getRequired("tools")

    /**
     * Controls for how a thread will be truncated prior to the run. Use this to control the intial
     * context window of the run.
     */
    fun truncationStrategy(): Optional<TruncationStrategy> =
        Optional.ofNullable(truncationStrategy.getNullable("truncation_strategy"))

    /**
     * Usage statistics related to the run. This value will be `null` if the run is not in a
     * terminal state (i.e. `in_progress`, `queued`, etc.).
     */
    fun usage(): Optional<Usage> = Optional.ofNullable(usage.getNullable("usage"))

    /** The sampling temperature used for this run. If not set, defaults to 1. */
    fun temperature(): Optional<Double> =
        Optional.ofNullable(temperature.getNullable("temperature"))

    /** The nucleus sampling value used for this run. If not set, defaults to 1. */
    fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

    /** The identifier, which can be referenced in API endpoints. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The ID of the [assistant](https://platform.openai.com/docs/api-reference/assistants) used for
     * execution of this run.
     */
    @JsonProperty("assistant_id")
    @ExcludeMissing
    fun _assistantId(): JsonField<String> = assistantId

    /** The Unix timestamp (in seconds) for when the run was cancelled. */
    @JsonProperty("cancelled_at") @ExcludeMissing fun _cancelledAt(): JsonField<Long> = cancelledAt

    /** The Unix timestamp (in seconds) for when the run was completed. */
    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt(): JsonField<Long> = completedAt

    /** The Unix timestamp (in seconds) for when the run was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /** The Unix timestamp (in seconds) for when the run will expire. */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<Long> = expiresAt

    /** The Unix timestamp (in seconds) for when the run failed. */
    @JsonProperty("failed_at") @ExcludeMissing fun _failedAt(): JsonField<Long> = failedAt

    /** Details on why the run is incomplete. Will be `null` if the run is not incomplete. */
    @JsonProperty("incomplete_details")
    @ExcludeMissing
    fun _incompleteDetails(): JsonField<IncompleteDetails> = incompleteDetails

    /**
     * The instructions that the
     * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /** The last error associated with this run. Will be `null` if there are no errors. */
    @JsonProperty("last_error") @ExcludeMissing fun _lastError(): JsonField<LastError> = lastError

    /**
     * The maximum number of completion tokens specified to have been used over the course of the
     * run.
     */
    @JsonProperty("max_completion_tokens")
    @ExcludeMissing
    fun _maxCompletionTokens(): JsonField<Long> = maxCompletionTokens

    /**
     * The maximum number of prompt tokens specified to have been used over the course of the run.
     */
    @JsonProperty("max_prompt_tokens")
    @ExcludeMissing
    fun _maxPromptTokens(): JsonField<Long> = maxPromptTokens

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing
     * additional information about the object in a structured format, and querying for objects via
     * API or the dashboard.
     *
     * Keys are strings with a maximum length of 64 characters. Values are strings with a maximum
     * length of 512 characters.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * The model that the [assistant](https://platform.openai.com/docs/api-reference/assistants)
     * used for this run.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Whether to enable
     * [parallel function calling](https://platform.openai.com/docs/guides/function-calling#configuring-parallel-function-calling)
     * during tool use.
     */
    @JsonProperty("parallel_tool_calls")
    @ExcludeMissing
    fun _parallelToolCalls(): JsonField<Boolean> = parallelToolCalls

    /**
     * Details on the action required to continue the run. Will be `null` if no action is required.
     */
    @JsonProperty("required_action")
    @ExcludeMissing
    fun _requiredAction(): JsonField<RequiredAction> = requiredAction

    /**
     * Specifies the format that the model must output. Compatible with
     * [GPT-4o](https://platform.openai.com/docs/models#gpt-4o), [GPT-4
     * Turbo](https://platform.openai.com/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo
     * models since `gpt-3.5-turbo-1106`.
     *
     * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs which
     * ensures the model will match your supplied JSON schema. Learn more in the
     * [Structured Outputs guide](https://platform.openai.com/docs/guides/structured-outputs).
     *
     * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the model
     * generates is valid JSON.
     *
     * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
     * yourself via a system or user message. Without this, the model may generate an unending
     * stream of whitespace until the generation reaches the token limit, resulting in a
     * long-running and seemingly "stuck" request. Also note that the message content may be
     * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
     * `max_tokens` or the conversation exceeded the max context length.
     */
    @JsonProperty("response_format")
    @ExcludeMissing
    fun _responseFormat(): JsonField<AssistantResponseFormatOption> = responseFormat

    /** The Unix timestamp (in seconds) for when the run was started. */
    @JsonProperty("started_at") @ExcludeMissing fun _startedAt(): JsonField<Long> = startedAt

    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`,
     * `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<RunStatus> = status

    /**
     * The ID of the [thread](https://platform.openai.com/docs/api-reference/threads) that was
     * executed on as a part of this run.
     */
    @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

    /**
     * Controls which (if any) tool is called by the model. `none` means the model will not call any
     * tools and instead generates a message. `auto` is the default value and means the model can
     * pick between generating a message or calling one or more tools. `required` means the model
     * must call one or more tools before responding to the user. Specifying a particular tool like
     * `{"type": "file_search"}` or `{"type": "function", "function": {"name": "my_function"}}`
     * forces the model to call that tool.
     */
    @JsonProperty("tool_choice")
    @ExcludeMissing
    fun _toolChoice(): JsonField<AssistantToolChoiceOption> = toolChoice

    /**
     * The list of tools that the
     * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
     */
    @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<AssistantTool>> = tools

    /**
     * Controls for how a thread will be truncated prior to the run. Use this to control the intial
     * context window of the run.
     */
    @JsonProperty("truncation_strategy")
    @ExcludeMissing
    fun _truncationStrategy(): JsonField<TruncationStrategy> = truncationStrategy

    /**
     * Usage statistics related to the run. This value will be `null` if the run is not in a
     * terminal state (i.e. `in_progress`, `queued`, etc.).
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

    /** The sampling temperature used for this run. If not set, defaults to 1. */
    @JsonProperty("temperature") @ExcludeMissing fun _temperature(): JsonField<Double> = temperature

    /** The nucleus sampling value used for this run. If not set, defaults to 1. */
    @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Run = apply {
        if (validated) {
            return@apply
        }

        id()
        assistantId()
        cancelledAt()
        completedAt()
        createdAt()
        expiresAt()
        failedAt()
        incompleteDetails().ifPresent { it.validate() }
        instructions()
        lastError().ifPresent { it.validate() }
        maxCompletionTokens()
        maxPromptTokens()
        metadata().ifPresent { it.validate() }
        model()
        _object_().let {
            if (it != JsonValue.from("thread.run")) {
                throw OpenAIInvalidDataException("'object_' is invalid, received $it")
            }
        }
        parallelToolCalls()
        requiredAction().ifPresent { it.validate() }
        responseFormat().ifPresent { it.validate() }
        startedAt()
        status()
        threadId()
        toolChoice().ifPresent { it.validate() }
        tools().forEach { it.validate() }
        truncationStrategy().ifPresent { it.validate() }
        usage().ifPresent { it.validate() }
        temperature()
        topP()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Run].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .assistantId()
         * .cancelledAt()
         * .completedAt()
         * .createdAt()
         * .expiresAt()
         * .failedAt()
         * .incompleteDetails()
         * .instructions()
         * .lastError()
         * .maxCompletionTokens()
         * .maxPromptTokens()
         * .metadata()
         * .model()
         * .parallelToolCalls()
         * .requiredAction()
         * .responseFormat()
         * .startedAt()
         * .status()
         * .threadId()
         * .toolChoice()
         * .tools()
         * .truncationStrategy()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Run]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var assistantId: JsonField<String>? = null
        private var cancelledAt: JsonField<Long>? = null
        private var completedAt: JsonField<Long>? = null
        private var createdAt: JsonField<Long>? = null
        private var expiresAt: JsonField<Long>? = null
        private var failedAt: JsonField<Long>? = null
        private var incompleteDetails: JsonField<IncompleteDetails>? = null
        private var instructions: JsonField<String>? = null
        private var lastError: JsonField<LastError>? = null
        private var maxCompletionTokens: JsonField<Long>? = null
        private var maxPromptTokens: JsonField<Long>? = null
        private var metadata: JsonField<Metadata>? = null
        private var model: JsonField<String>? = null
        private var object_: JsonValue = JsonValue.from("thread.run")
        private var parallelToolCalls: JsonField<Boolean>? = null
        private var requiredAction: JsonField<RequiredAction>? = null
        private var responseFormat: JsonField<AssistantResponseFormatOption>? = null
        private var startedAt: JsonField<Long>? = null
        private var status: JsonField<RunStatus>? = null
        private var threadId: JsonField<String>? = null
        private var toolChoice: JsonField<AssistantToolChoiceOption>? = null
        private var tools: JsonField<MutableList<AssistantTool>>? = null
        private var truncationStrategy: JsonField<TruncationStrategy>? = null
        private var usage: JsonField<Usage>? = null
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(run: Run) = apply {
            id = run.id
            assistantId = run.assistantId
            cancelledAt = run.cancelledAt
            completedAt = run.completedAt
            createdAt = run.createdAt
            expiresAt = run.expiresAt
            failedAt = run.failedAt
            incompleteDetails = run.incompleteDetails
            instructions = run.instructions
            lastError = run.lastError
            maxCompletionTokens = run.maxCompletionTokens
            maxPromptTokens = run.maxPromptTokens
            metadata = run.metadata
            model = run.model
            object_ = run.object_
            parallelToolCalls = run.parallelToolCalls
            requiredAction = run.requiredAction
            responseFormat = run.responseFormat
            startedAt = run.startedAt
            status = run.status
            threadId = run.threadId
            toolChoice = run.toolChoice
            tools = run.tools.map { it.toMutableList() }
            truncationStrategy = run.truncationStrategy
            usage = run.usage
            temperature = run.temperature
            topP = run.topP
            additionalProperties = run.additionalProperties.toMutableMap()
        }

        /** The identifier, which can be referenced in API endpoints. */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier, which can be referenced in API endpoints. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The ID of the [assistant](https://platform.openai.com/docs/api-reference/assistants) used
         * for execution of this run.
         */
        fun assistantId(assistantId: String) = assistantId(JsonField.of(assistantId))

        /**
         * The ID of the [assistant](https://platform.openai.com/docs/api-reference/assistants) used
         * for execution of this run.
         */
        fun assistantId(assistantId: JsonField<String>) = apply { this.assistantId = assistantId }

        /** The Unix timestamp (in seconds) for when the run was cancelled. */
        fun cancelledAt(cancelledAt: Long?) = cancelledAt(JsonField.ofNullable(cancelledAt))

        /** The Unix timestamp (in seconds) for when the run was cancelled. */
        fun cancelledAt(cancelledAt: Long) = cancelledAt(cancelledAt as Long?)

        /** The Unix timestamp (in seconds) for when the run was cancelled. */
        fun cancelledAt(cancelledAt: Optional<Long>) = cancelledAt(cancelledAt.getOrNull())

        /** The Unix timestamp (in seconds) for when the run was cancelled. */
        fun cancelledAt(cancelledAt: JsonField<Long>) = apply { this.cancelledAt = cancelledAt }

        /** The Unix timestamp (in seconds) for when the run was completed. */
        fun completedAt(completedAt: Long?) = completedAt(JsonField.ofNullable(completedAt))

        /** The Unix timestamp (in seconds) for when the run was completed. */
        fun completedAt(completedAt: Long) = completedAt(completedAt as Long?)

        /** The Unix timestamp (in seconds) for when the run was completed. */
        fun completedAt(completedAt: Optional<Long>) = completedAt(completedAt.getOrNull())

        /** The Unix timestamp (in seconds) for when the run was completed. */
        fun completedAt(completedAt: JsonField<Long>) = apply { this.completedAt = completedAt }

        /** The Unix timestamp (in seconds) for when the run was created. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /** The Unix timestamp (in seconds) for when the run was created. */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** The Unix timestamp (in seconds) for when the run will expire. */
        fun expiresAt(expiresAt: Long?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** The Unix timestamp (in seconds) for when the run will expire. */
        fun expiresAt(expiresAt: Long) = expiresAt(expiresAt as Long?)

        /** The Unix timestamp (in seconds) for when the run will expire. */
        fun expiresAt(expiresAt: Optional<Long>) = expiresAt(expiresAt.getOrNull())

        /** The Unix timestamp (in seconds) for when the run will expire. */
        fun expiresAt(expiresAt: JsonField<Long>) = apply { this.expiresAt = expiresAt }

        /** The Unix timestamp (in seconds) for when the run failed. */
        fun failedAt(failedAt: Long?) = failedAt(JsonField.ofNullable(failedAt))

        /** The Unix timestamp (in seconds) for when the run failed. */
        fun failedAt(failedAt: Long) = failedAt(failedAt as Long?)

        /** The Unix timestamp (in seconds) for when the run failed. */
        fun failedAt(failedAt: Optional<Long>) = failedAt(failedAt.getOrNull())

        /** The Unix timestamp (in seconds) for when the run failed. */
        fun failedAt(failedAt: JsonField<Long>) = apply { this.failedAt = failedAt }

        /** Details on why the run is incomplete. Will be `null` if the run is not incomplete. */
        fun incompleteDetails(incompleteDetails: IncompleteDetails?) =
            incompleteDetails(JsonField.ofNullable(incompleteDetails))

        /** Details on why the run is incomplete. Will be `null` if the run is not incomplete. */
        fun incompleteDetails(incompleteDetails: Optional<IncompleteDetails>) =
            incompleteDetails(incompleteDetails.getOrNull())

        /** Details on why the run is incomplete. Will be `null` if the run is not incomplete. */
        fun incompleteDetails(incompleteDetails: JsonField<IncompleteDetails>) = apply {
            this.incompleteDetails = incompleteDetails
        }

        /**
         * The instructions that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        /**
         * The instructions that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        /** The last error associated with this run. Will be `null` if there are no errors. */
        fun lastError(lastError: LastError?) = lastError(JsonField.ofNullable(lastError))

        /** The last error associated with this run. Will be `null` if there are no errors. */
        fun lastError(lastError: Optional<LastError>) = lastError(lastError.getOrNull())

        /** The last error associated with this run. Will be `null` if there are no errors. */
        fun lastError(lastError: JsonField<LastError>) = apply { this.lastError = lastError }

        /**
         * The maximum number of completion tokens specified to have been used over the course of
         * the run.
         */
        fun maxCompletionTokens(maxCompletionTokens: Long?) =
            maxCompletionTokens(JsonField.ofNullable(maxCompletionTokens))

        /**
         * The maximum number of completion tokens specified to have been used over the course of
         * the run.
         */
        fun maxCompletionTokens(maxCompletionTokens: Long) =
            maxCompletionTokens(maxCompletionTokens as Long?)

        /**
         * The maximum number of completion tokens specified to have been used over the course of
         * the run.
         */
        fun maxCompletionTokens(maxCompletionTokens: Optional<Long>) =
            maxCompletionTokens(maxCompletionTokens.getOrNull())

        /**
         * The maximum number of completion tokens specified to have been used over the course of
         * the run.
         */
        fun maxCompletionTokens(maxCompletionTokens: JsonField<Long>) = apply {
            this.maxCompletionTokens = maxCompletionTokens
        }

        /**
         * The maximum number of prompt tokens specified to have been used over the course of the
         * run.
         */
        fun maxPromptTokens(maxPromptTokens: Long?) =
            maxPromptTokens(JsonField.ofNullable(maxPromptTokens))

        /**
         * The maximum number of prompt tokens specified to have been used over the course of the
         * run.
         */
        fun maxPromptTokens(maxPromptTokens: Long) = maxPromptTokens(maxPromptTokens as Long?)

        /**
         * The maximum number of prompt tokens specified to have been used over the course of the
         * run.
         */
        fun maxPromptTokens(maxPromptTokens: Optional<Long>) =
            maxPromptTokens(maxPromptTokens.getOrNull())

        /**
         * The maximum number of prompt tokens specified to have been used over the course of the
         * run.
         */
        fun maxPromptTokens(maxPromptTokens: JsonField<Long>) = apply {
            this.maxPromptTokens = maxPromptTokens
        }

        /**
         * Set of 16 key-value pairs that can be attached to an object. This can be useful for
         * storing additional information about the object in a structured format, and querying for
         * objects via API or the dashboard.
         *
         * Keys are strings with a maximum length of 64 characters. Values are strings with a
         * maximum length of 512 characters.
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Set of 16 key-value pairs that can be attached to an object. This can be useful for
         * storing additional information about the object in a structured format, and querying for
         * objects via API or the dashboard.
         *
         * Keys are strings with a maximum length of 64 characters. Values are strings with a
         * maximum length of 512 characters.
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Set of 16 key-value pairs that can be attached to an object. This can be useful for
         * storing additional information about the object in a structured format, and querying for
         * objects via API or the dashboard.
         *
         * Keys are strings with a maximum length of 64 characters. Values are strings with a
         * maximum length of 512 characters.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * The model that the [assistant](https://platform.openai.com/docs/api-reference/assistants)
         * used for this run.
         */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * The model that the [assistant](https://platform.openai.com/docs/api-reference/assistants)
         * used for this run.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** The object type, which is always `thread.run`. */
        fun object_(object_: JsonValue) = apply { this.object_ = object_ }

        /**
         * Whether to enable
         * [parallel function calling](https://platform.openai.com/docs/guides/function-calling#configuring-parallel-function-calling)
         * during tool use.
         */
        fun parallelToolCalls(parallelToolCalls: Boolean) =
            parallelToolCalls(JsonField.of(parallelToolCalls))

        /**
         * Whether to enable
         * [parallel function calling](https://platform.openai.com/docs/guides/function-calling#configuring-parallel-function-calling)
         * during tool use.
         */
        fun parallelToolCalls(parallelToolCalls: JsonField<Boolean>) = apply {
            this.parallelToolCalls = parallelToolCalls
        }

        /**
         * Details on the action required to continue the run. Will be `null` if no action is
         * required.
         */
        fun requiredAction(requiredAction: RequiredAction?) =
            requiredAction(JsonField.ofNullable(requiredAction))

        /**
         * Details on the action required to continue the run. Will be `null` if no action is
         * required.
         */
        fun requiredAction(requiredAction: Optional<RequiredAction>) =
            requiredAction(requiredAction.getOrNull())

        /**
         * Details on the action required to continue the run. Will be `null` if no action is
         * required.
         */
        fun requiredAction(requiredAction: JsonField<RequiredAction>) = apply {
            this.requiredAction = requiredAction
        }

        /**
         * Specifies the format that the model must output. Compatible with
         * [GPT-4o](https://platform.openai.com/docs/models#gpt-4o), [GPT-4
         * Turbo](https://platform.openai.com/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5
         * Turbo models since `gpt-3.5-turbo-1106`.
         *
         * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs
         * which ensures the model will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](https://platform.openai.com/docs/guides/structured-outputs).
         *
         * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the
         * model generates is valid JSON.
         *
         * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
         * yourself via a system or user message. Without this, the model may generate an unending
         * stream of whitespace until the generation reaches the token limit, resulting in a
         * long-running and seemingly "stuck" request. Also note that the message content may be
         * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
         * `max_tokens` or the conversation exceeded the max context length.
         */
        fun responseFormat(responseFormat: AssistantResponseFormatOption?) =
            responseFormat(JsonField.ofNullable(responseFormat))

        /**
         * Specifies the format that the model must output. Compatible with
         * [GPT-4o](https://platform.openai.com/docs/models#gpt-4o), [GPT-4
         * Turbo](https://platform.openai.com/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5
         * Turbo models since `gpt-3.5-turbo-1106`.
         *
         * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs
         * which ensures the model will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](https://platform.openai.com/docs/guides/structured-outputs).
         *
         * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the
         * model generates is valid JSON.
         *
         * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
         * yourself via a system or user message. Without this, the model may generate an unending
         * stream of whitespace until the generation reaches the token limit, resulting in a
         * long-running and seemingly "stuck" request. Also note that the message content may be
         * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
         * `max_tokens` or the conversation exceeded the max context length.
         */
        fun responseFormat(responseFormat: Optional<AssistantResponseFormatOption>) =
            responseFormat(responseFormat.getOrNull())

        /**
         * Specifies the format that the model must output. Compatible with
         * [GPT-4o](https://platform.openai.com/docs/models#gpt-4o), [GPT-4
         * Turbo](https://platform.openai.com/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5
         * Turbo models since `gpt-3.5-turbo-1106`.
         *
         * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs
         * which ensures the model will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](https://platform.openai.com/docs/guides/structured-outputs).
         *
         * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the
         * model generates is valid JSON.
         *
         * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
         * yourself via a system or user message. Without this, the model may generate an unending
         * stream of whitespace until the generation reaches the token limit, resulting in a
         * long-running and seemingly "stuck" request. Also note that the message content may be
         * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
         * `max_tokens` or the conversation exceeded the max context length.
         */
        fun responseFormat(responseFormat: JsonField<AssistantResponseFormatOption>) = apply {
            this.responseFormat = responseFormat
        }

        /** `auto` is the default value */
        fun responseFormatJsonValue() = responseFormat(AssistantResponseFormatOption.ofJsonValue())

        /** Default response format. Used to generate text responses. */
        fun responseFormat(responseFormatText: ResponseFormatText) =
            responseFormat(AssistantResponseFormatOption.ofResponseFormatText(responseFormatText))

        /**
         * JSON object response format. An older method of generating JSON responses. Using
         * `json_schema` is recommended for models that support it. Note that the model will not
         * generate JSON without a system or user message instructing it to do so.
         */
        fun responseFormat(responseFormatJsonObject: ResponseFormatJsonObject) =
            responseFormat(
                AssistantResponseFormatOption.ofResponseFormatJsonObject(responseFormatJsonObject)
            )

        /**
         * JSON Schema response format. Used to generate structured JSON responses. Learn more about
         * [Structured Outputs](https://platform.openai.com/docs/guides/structured-outputs).
         */
        fun responseFormat(responseFormatJsonSchema: ResponseFormatJsonSchema) =
            responseFormat(
                AssistantResponseFormatOption.ofResponseFormatJsonSchema(responseFormatJsonSchema)
            )

        /** The Unix timestamp (in seconds) for when the run was started. */
        fun startedAt(startedAt: Long?) = startedAt(JsonField.ofNullable(startedAt))

        /** The Unix timestamp (in seconds) for when the run was started. */
        fun startedAt(startedAt: Long) = startedAt(startedAt as Long?)

        /** The Unix timestamp (in seconds) for when the run was started. */
        fun startedAt(startedAt: Optional<Long>) = startedAt(startedAt.getOrNull())

        /** The Unix timestamp (in seconds) for when the run was started. */
        fun startedAt(startedAt: JsonField<Long>) = apply { this.startedAt = startedAt }

        /**
         * The status of the run, which can be either `queued`, `in_progress`, `requires_action`,
         * `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
         */
        fun status(status: RunStatus) = status(JsonField.of(status))

        /**
         * The status of the run, which can be either `queued`, `in_progress`, `requires_action`,
         * `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
         */
        fun status(status: JsonField<RunStatus>) = apply { this.status = status }

        /**
         * The ID of the [thread](https://platform.openai.com/docs/api-reference/threads) that was
         * executed on as a part of this run.
         */
        fun threadId(threadId: String) = threadId(JsonField.of(threadId))

        /**
         * The ID of the [thread](https://platform.openai.com/docs/api-reference/threads) that was
         * executed on as a part of this run.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

        /**
         * Controls which (if any) tool is called by the model. `none` means the model will not call
         * any tools and instead generates a message. `auto` is the default value and means the
         * model can pick between generating a message or calling one or more tools. `required`
         * means the model must call one or more tools before responding to the user. Specifying a
         * particular tool like `{"type": "file_search"}` or `{"type": "function", "function":
         * {"name": "my_function"}}` forces the model to call that tool.
         */
        fun toolChoice(toolChoice: AssistantToolChoiceOption?) =
            toolChoice(JsonField.ofNullable(toolChoice))

        /**
         * Controls which (if any) tool is called by the model. `none` means the model will not call
         * any tools and instead generates a message. `auto` is the default value and means the
         * model can pick between generating a message or calling one or more tools. `required`
         * means the model must call one or more tools before responding to the user. Specifying a
         * particular tool like `{"type": "file_search"}` or `{"type": "function", "function":
         * {"name": "my_function"}}` forces the model to call that tool.
         */
        fun toolChoice(toolChoice: Optional<AssistantToolChoiceOption>) =
            toolChoice(toolChoice.getOrNull())

        /**
         * Controls which (if any) tool is called by the model. `none` means the model will not call
         * any tools and instead generates a message. `auto` is the default value and means the
         * model can pick between generating a message or calling one or more tools. `required`
         * means the model must call one or more tools before responding to the user. Specifying a
         * particular tool like `{"type": "file_search"}` or `{"type": "function", "function":
         * {"name": "my_function"}}` forces the model to call that tool.
         */
        fun toolChoice(toolChoice: JsonField<AssistantToolChoiceOption>) = apply {
            this.toolChoice = toolChoice
        }

        /**
         * `none` means the model will not call any tools and instead generates a message. `auto`
         * means the model can pick between generating a message or calling one or more tools.
         * `required` means the model must call one or more tools before responding to the user.
         */
        fun toolChoice(auto: AssistantToolChoiceOption.Auto) =
            toolChoice(AssistantToolChoiceOption.ofAuto(auto))

        /**
         * Specifies a tool the model should use. Use to force the model to call a specific tool.
         */
        fun toolChoice(assistantToolChoice: AssistantToolChoice) =
            toolChoice(AssistantToolChoiceOption.ofAssistantToolChoice(assistantToolChoice))

        /**
         * The list of tools that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun tools(tools: List<AssistantTool>) = tools(JsonField.of(tools))

        /**
         * The list of tools that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun tools(tools: JsonField<List<AssistantTool>>) = apply {
            this.tools = tools.map { it.toMutableList() }
        }

        /**
         * The list of tools that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun addTool(tool: AssistantTool) = apply {
            tools =
                (tools ?: JsonField.of(mutableListOf())).also { checkKnown("tools", it).add(tool) }
        }

        /**
         * The list of tools that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun addTool(codeInterpreter: CodeInterpreterTool) =
            addTool(AssistantTool.ofCodeInterpreter(codeInterpreter))

        /**
         * The list of tools that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun addTool(fileSearch: FileSearchTool) = addTool(AssistantTool.ofFileSearch(fileSearch))

        /**
         * The list of tools that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun addTool(function: FunctionTool) = addTool(AssistantTool.ofFunction(function))

        /**
         * The list of tools that the
         * [assistant](https://platform.openai.com/docs/api-reference/assistants) used for this run.
         */
        fun addFunctionTool(function: FunctionDefinition) =
            addTool(FunctionTool.builder().function(function).build())

        /**
         * Controls for how a thread will be truncated prior to the run. Use this to control the
         * intial context window of the run.
         */
        fun truncationStrategy(truncationStrategy: TruncationStrategy?) =
            truncationStrategy(JsonField.ofNullable(truncationStrategy))

        /**
         * Controls for how a thread will be truncated prior to the run. Use this to control the
         * intial context window of the run.
         */
        fun truncationStrategy(truncationStrategy: Optional<TruncationStrategy>) =
            truncationStrategy(truncationStrategy.getOrNull())

        /**
         * Controls for how a thread will be truncated prior to the run. Use this to control the
         * intial context window of the run.
         */
        fun truncationStrategy(truncationStrategy: JsonField<TruncationStrategy>) = apply {
            this.truncationStrategy = truncationStrategy
        }

        /**
         * Usage statistics related to the run. This value will be `null` if the run is not in a
         * terminal state (i.e. `in_progress`, `queued`, etc.).
         */
        fun usage(usage: Usage?) = usage(JsonField.ofNullable(usage))

        /**
         * Usage statistics related to the run. This value will be `null` if the run is not in a
         * terminal state (i.e. `in_progress`, `queued`, etc.).
         */
        fun usage(usage: Optional<Usage>) = usage(usage.getOrNull())

        /**
         * Usage statistics related to the run. This value will be `null` if the run is not in a
         * terminal state (i.e. `in_progress`, `queued`, etc.).
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

        /** The sampling temperature used for this run. If not set, defaults to 1. */
        fun temperature(temperature: Double?) = temperature(JsonField.ofNullable(temperature))

        /** The sampling temperature used for this run. If not set, defaults to 1. */
        fun temperature(temperature: Double) = temperature(temperature as Double?)

        /** The sampling temperature used for this run. If not set, defaults to 1. */
        fun temperature(temperature: Optional<Double>) = temperature(temperature.getOrNull())

        /** The sampling temperature used for this run. If not set, defaults to 1. */
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        /** The nucleus sampling value used for this run. If not set, defaults to 1. */
        fun topP(topP: Double?) = topP(JsonField.ofNullable(topP))

        /** The nucleus sampling value used for this run. If not set, defaults to 1. */
        fun topP(topP: Double) = topP(topP as Double?)

        /** The nucleus sampling value used for this run. If not set, defaults to 1. */
        fun topP(topP: Optional<Double>) = topP(topP.getOrNull())

        /** The nucleus sampling value used for this run. If not set, defaults to 1. */
        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

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

        fun build(): Run =
            Run(
                checkRequired("id", id),
                checkRequired("assistantId", assistantId),
                checkRequired("cancelledAt", cancelledAt),
                checkRequired("completedAt", completedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("failedAt", failedAt),
                checkRequired("incompleteDetails", incompleteDetails),
                checkRequired("instructions", instructions),
                checkRequired("lastError", lastError),
                checkRequired("maxCompletionTokens", maxCompletionTokens),
                checkRequired("maxPromptTokens", maxPromptTokens),
                checkRequired("metadata", metadata),
                checkRequired("model", model),
                object_,
                checkRequired("parallelToolCalls", parallelToolCalls),
                checkRequired("requiredAction", requiredAction),
                checkRequired("responseFormat", responseFormat),
                checkRequired("startedAt", startedAt),
                checkRequired("status", status),
                checkRequired("threadId", threadId),
                checkRequired("toolChoice", toolChoice),
                checkRequired("tools", tools).map { it.toImmutable() },
                checkRequired("truncationStrategy", truncationStrategy),
                checkRequired("usage", usage),
                temperature,
                topP,
                additionalProperties.toImmutable(),
            )
    }

    /** Details on why the run is incomplete. Will be `null` if the run is not incomplete. */
    @NoAutoDetect
    class IncompleteDetails
    @JsonCreator
    private constructor(
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The reason why the run is incomplete. This will point to which specific token limit was
         * reached over the course of the run.
         */
        fun reason(): Optional<Reason> = Optional.ofNullable(reason.getNullable("reason"))

        /**
         * The reason why the run is incomplete. This will point to which specific token limit was
         * reached over the course of the run.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): IncompleteDetails = apply {
            if (validated) {
                return@apply
            }

            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [IncompleteDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IncompleteDetails]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(incompleteDetails: IncompleteDetails) = apply {
                reason = incompleteDetails.reason
                additionalProperties = incompleteDetails.additionalProperties.toMutableMap()
            }

            /**
             * The reason why the run is incomplete. This will point to which specific token limit
             * was reached over the course of the run.
             */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * The reason why the run is incomplete. This will point to which specific token limit
             * was reached over the course of the run.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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

            fun build(): IncompleteDetails =
                IncompleteDetails(reason, additionalProperties.toImmutable())
        }

        /**
         * The reason why the run is incomplete. This will point to which specific token limit was
         * reached over the course of the run.
         */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val MAX_COMPLETION_TOKENS = of("max_completion_tokens")

                @JvmField val MAX_PROMPT_TOKENS = of("max_prompt_tokens")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                MAX_COMPLETION_TOKENS,
                MAX_PROMPT_TOKENS,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MAX_COMPLETION_TOKENS,
                MAX_PROMPT_TOKENS,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MAX_COMPLETION_TOKENS -> Value.MAX_COMPLETION_TOKENS
                    MAX_PROMPT_TOKENS -> Value.MAX_PROMPT_TOKENS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenAIInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    MAX_COMPLETION_TOKENS -> Known.MAX_COMPLETION_TOKENS
                    MAX_PROMPT_TOKENS -> Known.MAX_PROMPT_TOKENS
                    else -> throw OpenAIInvalidDataException("Unknown Reason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenAIInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OpenAIInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IncompleteDetails && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IncompleteDetails{reason=$reason, additionalProperties=$additionalProperties}"
    }

    /** The last error associated with this run. Will be `null` if there are no errors. */
    @NoAutoDetect
    class LastError
    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing private val code: JsonField<Code> = JsonMissing.of(),
        @JsonProperty("message")
        @ExcludeMissing
        private val message: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
        fun code(): Code = code.getRequired("code")

        /** A human-readable description of the error. */
        fun message(): String = message.getRequired("message")

        /** One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

        /** A human-readable description of the error. */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LastError = apply {
            if (validated) {
                return@apply
            }

            code()
            message()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LastError].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .message()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LastError]. */
        class Builder internal constructor() {

            private var code: JsonField<Code>? = null
            private var message: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lastError: LastError) = apply {
                code = lastError.code
                message = lastError.message
                additionalProperties = lastError.additionalProperties.toMutableMap()
            }

            /** One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
            fun code(code: Code) = code(JsonField.of(code))

            /** One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
            fun code(code: JsonField<Code>) = apply { this.code = code }

            /** A human-readable description of the error. */
            fun message(message: String) = message(JsonField.of(message))

            /** A human-readable description of the error. */
            fun message(message: JsonField<String>) = apply { this.message = message }

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

            fun build(): LastError =
                LastError(
                    checkRequired("code", code),
                    checkRequired("message", message),
                    additionalProperties.toImmutable(),
                )
        }

        /** One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. */
        class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SERVER_ERROR = of("server_error")

                @JvmField val RATE_LIMIT_EXCEEDED = of("rate_limit_exceeded")

                @JvmField val INVALID_PROMPT = of("invalid_prompt")

                @JvmStatic fun of(value: String) = Code(JsonField.of(value))
            }

            /** An enum containing [Code]'s known values. */
            enum class Known {
                SERVER_ERROR,
                RATE_LIMIT_EXCEEDED,
                INVALID_PROMPT,
            }

            /**
             * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Code] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SERVER_ERROR,
                RATE_LIMIT_EXCEEDED,
                INVALID_PROMPT,
                /** An enum member indicating that [Code] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SERVER_ERROR -> Value.SERVER_ERROR
                    RATE_LIMIT_EXCEEDED -> Value.RATE_LIMIT_EXCEEDED
                    INVALID_PROMPT -> Value.INVALID_PROMPT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenAIInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SERVER_ERROR -> Known.SERVER_ERROR
                    RATE_LIMIT_EXCEEDED -> Known.RATE_LIMIT_EXCEEDED
                    INVALID_PROMPT -> Known.INVALID_PROMPT
                    else -> throw OpenAIInvalidDataException("Unknown Code: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenAIInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OpenAIInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Code && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LastError && code == other.code && message == other.message && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, message, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LastError{code=$code, message=$message, additionalProperties=$additionalProperties}"
    }

    /**
     * Details on the action required to continue the run. Will be `null` if no action is required.
     */
    @NoAutoDetect
    class RequiredAction
    @JsonCreator
    private constructor(
        @JsonProperty("submit_tool_outputs")
        @ExcludeMissing
        private val submitToolOutputs: JsonField<SubmitToolOutputs> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Details on the tool outputs needed for this run to continue. */
        fun submitToolOutputs(): SubmitToolOutputs =
            submitToolOutputs.getRequired("submit_tool_outputs")

        /** For now, this is always `submit_tool_outputs`. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /** Details on the tool outputs needed for this run to continue. */
        @JsonProperty("submit_tool_outputs")
        @ExcludeMissing
        fun _submitToolOutputs(): JsonField<SubmitToolOutputs> = submitToolOutputs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RequiredAction = apply {
            if (validated) {
                return@apply
            }

            submitToolOutputs().validate()
            _type().let {
                if (it != JsonValue.from("submit_tool_outputs")) {
                    throw OpenAIInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [RequiredAction].
             *
             * The following fields are required:
             * ```java
             * .submitToolOutputs()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RequiredAction]. */
        class Builder internal constructor() {

            private var submitToolOutputs: JsonField<SubmitToolOutputs>? = null
            private var type: JsonValue = JsonValue.from("submit_tool_outputs")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(requiredAction: RequiredAction) = apply {
                submitToolOutputs = requiredAction.submitToolOutputs
                type = requiredAction.type
                additionalProperties = requiredAction.additionalProperties.toMutableMap()
            }

            /** Details on the tool outputs needed for this run to continue. */
            fun submitToolOutputs(submitToolOutputs: SubmitToolOutputs) =
                submitToolOutputs(JsonField.of(submitToolOutputs))

            /** Details on the tool outputs needed for this run to continue. */
            fun submitToolOutputs(submitToolOutputs: JsonField<SubmitToolOutputs>) = apply {
                this.submitToolOutputs = submitToolOutputs
            }

            /** For now, this is always `submit_tool_outputs`. */
            fun type(type: JsonValue) = apply { this.type = type }

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

            fun build(): RequiredAction =
                RequiredAction(
                    checkRequired("submitToolOutputs", submitToolOutputs),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        /** Details on the tool outputs needed for this run to continue. */
        @NoAutoDetect
        class SubmitToolOutputs
        @JsonCreator
        private constructor(
            @JsonProperty("tool_calls")
            @ExcludeMissing
            private val toolCalls: JsonField<List<RequiredActionFunctionToolCall>> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** A list of the relevant tool calls. */
            fun toolCalls(): List<RequiredActionFunctionToolCall> =
                toolCalls.getRequired("tool_calls")

            /** A list of the relevant tool calls. */
            @JsonProperty("tool_calls")
            @ExcludeMissing
            fun _toolCalls(): JsonField<List<RequiredActionFunctionToolCall>> = toolCalls

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SubmitToolOutputs = apply {
                if (validated) {
                    return@apply
                }

                toolCalls().forEach { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [SubmitToolOutputs].
                 *
                 * The following fields are required:
                 * ```java
                 * .toolCalls()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SubmitToolOutputs]. */
            class Builder internal constructor() {

                private var toolCalls: JsonField<MutableList<RequiredActionFunctionToolCall>>? =
                    null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(submitToolOutputs: SubmitToolOutputs) = apply {
                    toolCalls = submitToolOutputs.toolCalls.map { it.toMutableList() }
                    additionalProperties = submitToolOutputs.additionalProperties.toMutableMap()
                }

                /** A list of the relevant tool calls. */
                fun toolCalls(toolCalls: List<RequiredActionFunctionToolCall>) =
                    toolCalls(JsonField.of(toolCalls))

                /** A list of the relevant tool calls. */
                fun toolCalls(toolCalls: JsonField<List<RequiredActionFunctionToolCall>>) = apply {
                    this.toolCalls = toolCalls.map { it.toMutableList() }
                }

                /** A list of the relevant tool calls. */
                fun addToolCall(toolCall: RequiredActionFunctionToolCall) = apply {
                    toolCalls =
                        (toolCalls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolCalls", it).add(toolCall)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): SubmitToolOutputs =
                    SubmitToolOutputs(
                        checkRequired("toolCalls", toolCalls).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubmitToolOutputs && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(toolCalls, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubmitToolOutputs{toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RequiredAction && submitToolOutputs == other.submitToolOutputs && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(submitToolOutputs, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RequiredAction{submitToolOutputs=$submitToolOutputs, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Controls for how a thread will be truncated prior to the run. Use this to control the intial
     * context window of the run.
     */
    @NoAutoDetect
    class TruncationStrategy
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("last_messages")
        @ExcludeMissing
        private val lastMessages: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The truncation strategy to use for the thread. The default is `auto`. If set to
         * `last_messages`, the thread will be truncated to the n most recent messages in the
         * thread. When set to `auto`, messages in the middle of the thread will be dropped to fit
         * the context length of the model, `max_prompt_tokens`.
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The number of most recent messages from the thread when constructing the context for the
         * run.
         */
        fun lastMessages(): Optional<Long> =
            Optional.ofNullable(lastMessages.getNullable("last_messages"))

        /**
         * The truncation strategy to use for the thread. The default is `auto`. If set to
         * `last_messages`, the thread will be truncated to the n most recent messages in the
         * thread. When set to `auto`, messages in the middle of the thread will be dropped to fit
         * the context length of the model, `max_prompt_tokens`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * The number of most recent messages from the thread when constructing the context for the
         * run.
         */
        @JsonProperty("last_messages")
        @ExcludeMissing
        fun _lastMessages(): JsonField<Long> = lastMessages

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TruncationStrategy = apply {
            if (validated) {
                return@apply
            }

            type()
            lastMessages()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TruncationStrategy].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TruncationStrategy]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var lastMessages: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(truncationStrategy: TruncationStrategy) = apply {
                type = truncationStrategy.type
                lastMessages = truncationStrategy.lastMessages
                additionalProperties = truncationStrategy.additionalProperties.toMutableMap()
            }

            /**
             * The truncation strategy to use for the thread. The default is `auto`. If set to
             * `last_messages`, the thread will be truncated to the n most recent messages in the
             * thread. When set to `auto`, messages in the middle of the thread will be dropped to
             * fit the context length of the model, `max_prompt_tokens`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * The truncation strategy to use for the thread. The default is `auto`. If set to
             * `last_messages`, the thread will be truncated to the n most recent messages in the
             * thread. When set to `auto`, messages in the middle of the thread will be dropped to
             * fit the context length of the model, `max_prompt_tokens`.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * The number of most recent messages from the thread when constructing the context for
             * the run.
             */
            fun lastMessages(lastMessages: Long?) = lastMessages(JsonField.ofNullable(lastMessages))

            /**
             * The number of most recent messages from the thread when constructing the context for
             * the run.
             */
            fun lastMessages(lastMessages: Long) = lastMessages(lastMessages as Long?)

            /**
             * The number of most recent messages from the thread when constructing the context for
             * the run.
             */
            fun lastMessages(lastMessages: Optional<Long>) = lastMessages(lastMessages.getOrNull())

            /**
             * The number of most recent messages from the thread when constructing the context for
             * the run.
             */
            fun lastMessages(lastMessages: JsonField<Long>) = apply {
                this.lastMessages = lastMessages
            }

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

            fun build(): TruncationStrategy =
                TruncationStrategy(
                    checkRequired("type", type),
                    lastMessages,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The truncation strategy to use for the thread. The default is `auto`. If set to
         * `last_messages`, the thread will be truncated to the n most recent messages in the
         * thread. When set to `auto`, messages in the middle of the thread will be dropped to fit
         * the context length of the model, `max_prompt_tokens`.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AUTO = of("auto")

                @JvmField val LAST_MESSAGES = of("last_messages")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                AUTO,
                LAST_MESSAGES,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTO,
                LAST_MESSAGES,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AUTO -> Value.AUTO
                    LAST_MESSAGES -> Value.LAST_MESSAGES
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenAIInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AUTO -> Known.AUTO
                    LAST_MESSAGES -> Known.LAST_MESSAGES
                    else -> throw OpenAIInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenAIInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OpenAIInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TruncationStrategy && type == other.type && lastMessages == other.lastMessages && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, lastMessages, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TruncationStrategy{type=$type, lastMessages=$lastMessages, additionalProperties=$additionalProperties}"
    }

    /**
     * Usage statistics related to the run. This value will be `null` if the run is not in a
     * terminal state (i.e. `in_progress`, `queued`, etc.).
     */
    @NoAutoDetect
    class Usage
    @JsonCreator
    private constructor(
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        private val completionTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        private val promptTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        private val totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Number of completion tokens used over the course of the run. */
        fun completionTokens(): Long = completionTokens.getRequired("completion_tokens")

        /** Number of prompt tokens used over the course of the run. */
        fun promptTokens(): Long = promptTokens.getRequired("prompt_tokens")

        /** Total number of tokens used (prompt + completion). */
        fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

        /** Number of completion tokens used over the course of the run. */
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        fun _completionTokens(): JsonField<Long> = completionTokens

        /** Number of prompt tokens used over the course of the run. */
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        fun _promptTokens(): JsonField<Long> = promptTokens

        /** Total number of tokens used (prompt + completion). */
        @JsonProperty("total_tokens")
        @ExcludeMissing
        fun _totalTokens(): JsonField<Long> = totalTokens

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            completionTokens()
            promptTokens()
            totalTokens()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Usage].
             *
             * The following fields are required:
             * ```java
             * .completionTokens()
             * .promptTokens()
             * .totalTokens()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var completionTokens: JsonField<Long>? = null
            private var promptTokens: JsonField<Long>? = null
            private var totalTokens: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                completionTokens = usage.completionTokens
                promptTokens = usage.promptTokens
                totalTokens = usage.totalTokens
                additionalProperties = usage.additionalProperties.toMutableMap()
            }

            /** Number of completion tokens used over the course of the run. */
            fun completionTokens(completionTokens: Long) =
                completionTokens(JsonField.of(completionTokens))

            /** Number of completion tokens used over the course of the run. */
            fun completionTokens(completionTokens: JsonField<Long>) = apply {
                this.completionTokens = completionTokens
            }

            /** Number of prompt tokens used over the course of the run. */
            fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

            /** Number of prompt tokens used over the course of the run. */
            fun promptTokens(promptTokens: JsonField<Long>) = apply {
                this.promptTokens = promptTokens
            }

            /** Total number of tokens used (prompt + completion). */
            fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

            /** Total number of tokens used (prompt + completion). */
            fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

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

            fun build(): Usage =
                Usage(
                    checkRequired("completionTokens", completionTokens),
                    checkRequired("promptTokens", promptTokens),
                    checkRequired("totalTokens", totalTokens),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Usage && completionTokens == other.completionTokens && promptTokens == other.promptTokens && totalTokens == other.totalTokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(completionTokens, promptTokens, totalTokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{completionTokens=$completionTokens, promptTokens=$promptTokens, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Run && id == other.id && assistantId == other.assistantId && cancelledAt == other.cancelledAt && completedAt == other.completedAt && createdAt == other.createdAt && expiresAt == other.expiresAt && failedAt == other.failedAt && incompleteDetails == other.incompleteDetails && instructions == other.instructions && lastError == other.lastError && maxCompletionTokens == other.maxCompletionTokens && maxPromptTokens == other.maxPromptTokens && metadata == other.metadata && model == other.model && object_ == other.object_ && parallelToolCalls == other.parallelToolCalls && requiredAction == other.requiredAction && responseFormat == other.responseFormat && startedAt == other.startedAt && status == other.status && threadId == other.threadId && toolChoice == other.toolChoice && tools == other.tools && truncationStrategy == other.truncationStrategy && usage == other.usage && temperature == other.temperature && topP == other.topP && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, assistantId, cancelledAt, completedAt, createdAt, expiresAt, failedAt, incompleteDetails, instructions, lastError, maxCompletionTokens, maxPromptTokens, metadata, model, object_, parallelToolCalls, requiredAction, responseFormat, startedAt, status, threadId, toolChoice, tools, truncationStrategy, usage, temperature, topP, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Run{id=$id, assistantId=$assistantId, cancelledAt=$cancelledAt, completedAt=$completedAt, createdAt=$createdAt, expiresAt=$expiresAt, failedAt=$failedAt, incompleteDetails=$incompleteDetails, instructions=$instructions, lastError=$lastError, maxCompletionTokens=$maxCompletionTokens, maxPromptTokens=$maxPromptTokens, metadata=$metadata, model=$model, object_=$object_, parallelToolCalls=$parallelToolCalls, requiredAction=$requiredAction, responseFormat=$responseFormat, startedAt=$startedAt, status=$status, threadId=$threadId, toolChoice=$toolChoice, tools=$tools, truncationStrategy=$truncationStrategy, usage=$usage, temperature=$temperature, topP=$topP, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.openai.models.responses

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

/** Emitted when there is a partial audio response. */
@JsonDeserialize(using = ResponseStreamEvent.Deserializer::class)
@JsonSerialize(using = ResponseStreamEvent.Serializer::class)
class ResponseStreamEvent
private constructor(
    private val audioDelta: ResponseAudioDeltaEvent? = null,
    private val audioDone: ResponseAudioDoneEvent? = null,
    private val audioTranscriptDelta: ResponseAudioTranscriptDeltaEvent? = null,
    private val audioTranscriptDone: ResponseAudioTranscriptDoneEvent? = null,
    private val codeInterpreterCallCodeDelta: ResponseCodeInterpreterCallCodeDeltaEvent? = null,
    private val codeInterpreterCallCodeDone: ResponseCodeInterpreterCallCodeDoneEvent? = null,
    private val codeInterpreterCallCompleted: ResponseCodeInterpreterCallCompletedEvent? = null,
    private val codeInterpreterCallInProgress: ResponseCodeInterpreterCallInProgressEvent? = null,
    private val codeInterpreterCallInterpreting: ResponseCodeInterpreterCallInterpretingEvent? =
        null,
    private val completed: ResponseCompletedEvent? = null,
    private val contentPartAdded: ResponseContentPartAddedEvent? = null,
    private val contentPartDone: ResponseContentPartDoneEvent? = null,
    private val created: ResponseCreatedEvent? = null,
    private val error: ResponseErrorEvent? = null,
    private val fileSearchCallCompleted: ResponseFileSearchCallCompletedEvent? = null,
    private val fileSearchCallInProgress: ResponseFileSearchCallInProgressEvent? = null,
    private val fileSearchCallSearching: ResponseFileSearchCallSearchingEvent? = null,
    private val functionCallArgumentsDelta: ResponseFunctionCallArgumentsDeltaEvent? = null,
    private val functionCallArgumentsDone: ResponseFunctionCallArgumentsDoneEvent? = null,
    private val inProgress: ResponseInProgressEvent? = null,
    private val failed: ResponseFailedEvent? = null,
    private val incomplete: ResponseIncompleteEvent? = null,
    private val outputItemAdded: ResponseOutputItemAddedEvent? = null,
    private val outputItemDone: ResponseOutputItemDoneEvent? = null,
    private val reasoningSummaryPartAdded: ResponseReasoningSummaryPartAddedEvent? = null,
    private val reasoningSummaryPartDone: ResponseReasoningSummaryPartDoneEvent? = null,
    private val reasoningSummaryTextDelta: ResponseReasoningSummaryTextDeltaEvent? = null,
    private val reasoningSummaryTextDone: ResponseReasoningSummaryTextDoneEvent? = null,
    private val refusalDelta: ResponseRefusalDeltaEvent? = null,
    private val refusalDone: ResponseRefusalDoneEvent? = null,
    private val outputTextAnnotationAdded: ResponseTextAnnotationDeltaEvent? = null,
    private val outputTextDelta: ResponseTextDeltaEvent? = null,
    private val outputTextDone: ResponseTextDoneEvent? = null,
    private val webSearchCallCompleted: ResponseWebSearchCallCompletedEvent? = null,
    private val webSearchCallInProgress: ResponseWebSearchCallInProgressEvent? = null,
    private val webSearchCallSearching: ResponseWebSearchCallSearchingEvent? = null,
    private val _json: JsonValue? = null,
) {

    /** Emitted when there is a partial audio response. */
    fun audioDelta(): Optional<ResponseAudioDeltaEvent> = Optional.ofNullable(audioDelta)

    /** Emitted when the audio response is complete. */
    fun audioDone(): Optional<ResponseAudioDoneEvent> = Optional.ofNullable(audioDone)

    /** Emitted when there is a partial transcript of audio. */
    fun audioTranscriptDelta(): Optional<ResponseAudioTranscriptDeltaEvent> =
        Optional.ofNullable(audioTranscriptDelta)

    /** Emitted when the full audio transcript is completed. */
    fun audioTranscriptDone(): Optional<ResponseAudioTranscriptDoneEvent> =
        Optional.ofNullable(audioTranscriptDone)

    /** Emitted when a partial code snippet is added by the code interpreter. */
    fun codeInterpreterCallCodeDelta(): Optional<ResponseCodeInterpreterCallCodeDeltaEvent> =
        Optional.ofNullable(codeInterpreterCallCodeDelta)

    /** Emitted when code snippet output is finalized by the code interpreter. */
    fun codeInterpreterCallCodeDone(): Optional<ResponseCodeInterpreterCallCodeDoneEvent> =
        Optional.ofNullable(codeInterpreterCallCodeDone)

    /** Emitted when the code interpreter call is completed. */
    fun codeInterpreterCallCompleted(): Optional<ResponseCodeInterpreterCallCompletedEvent> =
        Optional.ofNullable(codeInterpreterCallCompleted)

    /** Emitted when a code interpreter call is in progress. */
    fun codeInterpreterCallInProgress(): Optional<ResponseCodeInterpreterCallInProgressEvent> =
        Optional.ofNullable(codeInterpreterCallInProgress)

    /** Emitted when the code interpreter is actively interpreting the code snippet. */
    fun codeInterpreterCallInterpreting(): Optional<ResponseCodeInterpreterCallInterpretingEvent> =
        Optional.ofNullable(codeInterpreterCallInterpreting)

    /** Emitted when the model response is complete. */
    fun completed(): Optional<ResponseCompletedEvent> = Optional.ofNullable(completed)

    /** Emitted when a new content part is added. */
    fun contentPartAdded(): Optional<ResponseContentPartAddedEvent> =
        Optional.ofNullable(contentPartAdded)

    /** Emitted when a content part is done. */
    fun contentPartDone(): Optional<ResponseContentPartDoneEvent> =
        Optional.ofNullable(contentPartDone)

    /** An event that is emitted when a response is created. */
    fun created(): Optional<ResponseCreatedEvent> = Optional.ofNullable(created)

    /** Emitted when an error occurs. */
    fun error(): Optional<ResponseErrorEvent> = Optional.ofNullable(error)

    /** Emitted when a file search call is completed (results found). */
    fun fileSearchCallCompleted(): Optional<ResponseFileSearchCallCompletedEvent> =
        Optional.ofNullable(fileSearchCallCompleted)

    /** Emitted when a file search call is initiated. */
    fun fileSearchCallInProgress(): Optional<ResponseFileSearchCallInProgressEvent> =
        Optional.ofNullable(fileSearchCallInProgress)

    /** Emitted when a file search is currently searching. */
    fun fileSearchCallSearching(): Optional<ResponseFileSearchCallSearchingEvent> =
        Optional.ofNullable(fileSearchCallSearching)

    /** Emitted when there is a partial function-call arguments delta. */
    fun functionCallArgumentsDelta(): Optional<ResponseFunctionCallArgumentsDeltaEvent> =
        Optional.ofNullable(functionCallArgumentsDelta)

    /** Emitted when function-call arguments are finalized. */
    fun functionCallArgumentsDone(): Optional<ResponseFunctionCallArgumentsDoneEvent> =
        Optional.ofNullable(functionCallArgumentsDone)

    /** Emitted when the response is in progress. */
    fun inProgress(): Optional<ResponseInProgressEvent> = Optional.ofNullable(inProgress)

    /** An event that is emitted when a response fails. */
    fun failed(): Optional<ResponseFailedEvent> = Optional.ofNullable(failed)

    /** An event that is emitted when a response finishes as incomplete. */
    fun incomplete(): Optional<ResponseIncompleteEvent> = Optional.ofNullable(incomplete)

    /** Emitted when a new output item is added. */
    fun outputItemAdded(): Optional<ResponseOutputItemAddedEvent> =
        Optional.ofNullable(outputItemAdded)

    /** Emitted when an output item is marked done. */
    fun outputItemDone(): Optional<ResponseOutputItemDoneEvent> =
        Optional.ofNullable(outputItemDone)

    /** Emitted when a new reasoning summary part is added. */
    fun reasoningSummaryPartAdded(): Optional<ResponseReasoningSummaryPartAddedEvent> =
        Optional.ofNullable(reasoningSummaryPartAdded)

    /** Emitted when a reasoning summary part is completed. */
    fun reasoningSummaryPartDone(): Optional<ResponseReasoningSummaryPartDoneEvent> =
        Optional.ofNullable(reasoningSummaryPartDone)

    /** Emitted when a delta is added to a reasoning summary text. */
    fun reasoningSummaryTextDelta(): Optional<ResponseReasoningSummaryTextDeltaEvent> =
        Optional.ofNullable(reasoningSummaryTextDelta)

    /** Emitted when a reasoning summary text is completed. */
    fun reasoningSummaryTextDone(): Optional<ResponseReasoningSummaryTextDoneEvent> =
        Optional.ofNullable(reasoningSummaryTextDone)

    /** Emitted when there is a partial refusal text. */
    fun refusalDelta(): Optional<ResponseRefusalDeltaEvent> = Optional.ofNullable(refusalDelta)

    /** Emitted when refusal text is finalized. */
    fun refusalDone(): Optional<ResponseRefusalDoneEvent> = Optional.ofNullable(refusalDone)

    /** Emitted when a text annotation is added. */
    fun outputTextAnnotationAdded(): Optional<ResponseTextAnnotationDeltaEvent> =
        Optional.ofNullable(outputTextAnnotationAdded)

    /** Emitted when there is an additional text delta. */
    fun outputTextDelta(): Optional<ResponseTextDeltaEvent> = Optional.ofNullable(outputTextDelta)

    /** Emitted when text content is finalized. */
    fun outputTextDone(): Optional<ResponseTextDoneEvent> = Optional.ofNullable(outputTextDone)

    /** Emitted when a web search call is completed. */
    fun webSearchCallCompleted(): Optional<ResponseWebSearchCallCompletedEvent> =
        Optional.ofNullable(webSearchCallCompleted)

    /** Emitted when a web search call is initiated. */
    fun webSearchCallInProgress(): Optional<ResponseWebSearchCallInProgressEvent> =
        Optional.ofNullable(webSearchCallInProgress)

    /** Emitted when a web search call is executing. */
    fun webSearchCallSearching(): Optional<ResponseWebSearchCallSearchingEvent> =
        Optional.ofNullable(webSearchCallSearching)

    fun isAudioDelta(): Boolean = audioDelta != null

    fun isAudioDone(): Boolean = audioDone != null

    fun isAudioTranscriptDelta(): Boolean = audioTranscriptDelta != null

    fun isAudioTranscriptDone(): Boolean = audioTranscriptDone != null

    fun isCodeInterpreterCallCodeDelta(): Boolean = codeInterpreterCallCodeDelta != null

    fun isCodeInterpreterCallCodeDone(): Boolean = codeInterpreterCallCodeDone != null

    fun isCodeInterpreterCallCompleted(): Boolean = codeInterpreterCallCompleted != null

    fun isCodeInterpreterCallInProgress(): Boolean = codeInterpreterCallInProgress != null

    fun isCodeInterpreterCallInterpreting(): Boolean = codeInterpreterCallInterpreting != null

    fun isCompleted(): Boolean = completed != null

    fun isContentPartAdded(): Boolean = contentPartAdded != null

    fun isContentPartDone(): Boolean = contentPartDone != null

    fun isCreated(): Boolean = created != null

    fun isError(): Boolean = error != null

    fun isFileSearchCallCompleted(): Boolean = fileSearchCallCompleted != null

    fun isFileSearchCallInProgress(): Boolean = fileSearchCallInProgress != null

    fun isFileSearchCallSearching(): Boolean = fileSearchCallSearching != null

    fun isFunctionCallArgumentsDelta(): Boolean = functionCallArgumentsDelta != null

    fun isFunctionCallArgumentsDone(): Boolean = functionCallArgumentsDone != null

    fun isInProgress(): Boolean = inProgress != null

    fun isFailed(): Boolean = failed != null

    fun isIncomplete(): Boolean = incomplete != null

    fun isOutputItemAdded(): Boolean = outputItemAdded != null

    fun isOutputItemDone(): Boolean = outputItemDone != null

    fun isReasoningSummaryPartAdded(): Boolean = reasoningSummaryPartAdded != null

    fun isReasoningSummaryPartDone(): Boolean = reasoningSummaryPartDone != null

    fun isReasoningSummaryTextDelta(): Boolean = reasoningSummaryTextDelta != null

    fun isReasoningSummaryTextDone(): Boolean = reasoningSummaryTextDone != null

    fun isRefusalDelta(): Boolean = refusalDelta != null

    fun isRefusalDone(): Boolean = refusalDone != null

    fun isOutputTextAnnotationAdded(): Boolean = outputTextAnnotationAdded != null

    fun isOutputTextDelta(): Boolean = outputTextDelta != null

    fun isOutputTextDone(): Boolean = outputTextDone != null

    fun isWebSearchCallCompleted(): Boolean = webSearchCallCompleted != null

    fun isWebSearchCallInProgress(): Boolean = webSearchCallInProgress != null

    fun isWebSearchCallSearching(): Boolean = webSearchCallSearching != null

    /** Emitted when there is a partial audio response. */
    fun asAudioDelta(): ResponseAudioDeltaEvent = audioDelta.getOrThrow("audioDelta")

    /** Emitted when the audio response is complete. */
    fun asAudioDone(): ResponseAudioDoneEvent = audioDone.getOrThrow("audioDone")

    /** Emitted when there is a partial transcript of audio. */
    fun asAudioTranscriptDelta(): ResponseAudioTranscriptDeltaEvent =
        audioTranscriptDelta.getOrThrow("audioTranscriptDelta")

    /** Emitted when the full audio transcript is completed. */
    fun asAudioTranscriptDone(): ResponseAudioTranscriptDoneEvent =
        audioTranscriptDone.getOrThrow("audioTranscriptDone")

    /** Emitted when a partial code snippet is added by the code interpreter. */
    fun asCodeInterpreterCallCodeDelta(): ResponseCodeInterpreterCallCodeDeltaEvent =
        codeInterpreterCallCodeDelta.getOrThrow("codeInterpreterCallCodeDelta")

    /** Emitted when code snippet output is finalized by the code interpreter. */
    fun asCodeInterpreterCallCodeDone(): ResponseCodeInterpreterCallCodeDoneEvent =
        codeInterpreterCallCodeDone.getOrThrow("codeInterpreterCallCodeDone")

    /** Emitted when the code interpreter call is completed. */
    fun asCodeInterpreterCallCompleted(): ResponseCodeInterpreterCallCompletedEvent =
        codeInterpreterCallCompleted.getOrThrow("codeInterpreterCallCompleted")

    /** Emitted when a code interpreter call is in progress. */
    fun asCodeInterpreterCallInProgress(): ResponseCodeInterpreterCallInProgressEvent =
        codeInterpreterCallInProgress.getOrThrow("codeInterpreterCallInProgress")

    /** Emitted when the code interpreter is actively interpreting the code snippet. */
    fun asCodeInterpreterCallInterpreting(): ResponseCodeInterpreterCallInterpretingEvent =
        codeInterpreterCallInterpreting.getOrThrow("codeInterpreterCallInterpreting")

    /** Emitted when the model response is complete. */
    fun asCompleted(): ResponseCompletedEvent = completed.getOrThrow("completed")

    /** Emitted when a new content part is added. */
    fun asContentPartAdded(): ResponseContentPartAddedEvent =
        contentPartAdded.getOrThrow("contentPartAdded")

    /** Emitted when a content part is done. */
    fun asContentPartDone(): ResponseContentPartDoneEvent =
        contentPartDone.getOrThrow("contentPartDone")

    /** An event that is emitted when a response is created. */
    fun asCreated(): ResponseCreatedEvent = created.getOrThrow("created")

    /** Emitted when an error occurs. */
    fun asError(): ResponseErrorEvent = error.getOrThrow("error")

    /** Emitted when a file search call is completed (results found). */
    fun asFileSearchCallCompleted(): ResponseFileSearchCallCompletedEvent =
        fileSearchCallCompleted.getOrThrow("fileSearchCallCompleted")

    /** Emitted when a file search call is initiated. */
    fun asFileSearchCallInProgress(): ResponseFileSearchCallInProgressEvent =
        fileSearchCallInProgress.getOrThrow("fileSearchCallInProgress")

    /** Emitted when a file search is currently searching. */
    fun asFileSearchCallSearching(): ResponseFileSearchCallSearchingEvent =
        fileSearchCallSearching.getOrThrow("fileSearchCallSearching")

    /** Emitted when there is a partial function-call arguments delta. */
    fun asFunctionCallArgumentsDelta(): ResponseFunctionCallArgumentsDeltaEvent =
        functionCallArgumentsDelta.getOrThrow("functionCallArgumentsDelta")

    /** Emitted when function-call arguments are finalized. */
    fun asFunctionCallArgumentsDone(): ResponseFunctionCallArgumentsDoneEvent =
        functionCallArgumentsDone.getOrThrow("functionCallArgumentsDone")

    /** Emitted when the response is in progress. */
    fun asInProgress(): ResponseInProgressEvent = inProgress.getOrThrow("inProgress")

    /** An event that is emitted when a response fails. */
    fun asFailed(): ResponseFailedEvent = failed.getOrThrow("failed")

    /** An event that is emitted when a response finishes as incomplete. */
    fun asIncomplete(): ResponseIncompleteEvent = incomplete.getOrThrow("incomplete")

    /** Emitted when a new output item is added. */
    fun asOutputItemAdded(): ResponseOutputItemAddedEvent =
        outputItemAdded.getOrThrow("outputItemAdded")

    /** Emitted when an output item is marked done. */
    fun asOutputItemDone(): ResponseOutputItemDoneEvent =
        outputItemDone.getOrThrow("outputItemDone")

    /** Emitted when a new reasoning summary part is added. */
    fun asReasoningSummaryPartAdded(): ResponseReasoningSummaryPartAddedEvent =
        reasoningSummaryPartAdded.getOrThrow("reasoningSummaryPartAdded")

    /** Emitted when a reasoning summary part is completed. */
    fun asReasoningSummaryPartDone(): ResponseReasoningSummaryPartDoneEvent =
        reasoningSummaryPartDone.getOrThrow("reasoningSummaryPartDone")

    /** Emitted when a delta is added to a reasoning summary text. */
    fun asReasoningSummaryTextDelta(): ResponseReasoningSummaryTextDeltaEvent =
        reasoningSummaryTextDelta.getOrThrow("reasoningSummaryTextDelta")

    /** Emitted when a reasoning summary text is completed. */
    fun asReasoningSummaryTextDone(): ResponseReasoningSummaryTextDoneEvent =
        reasoningSummaryTextDone.getOrThrow("reasoningSummaryTextDone")

    /** Emitted when there is a partial refusal text. */
    fun asRefusalDelta(): ResponseRefusalDeltaEvent = refusalDelta.getOrThrow("refusalDelta")

    /** Emitted when refusal text is finalized. */
    fun asRefusalDone(): ResponseRefusalDoneEvent = refusalDone.getOrThrow("refusalDone")

    /** Emitted when a text annotation is added. */
    fun asOutputTextAnnotationAdded(): ResponseTextAnnotationDeltaEvent =
        outputTextAnnotationAdded.getOrThrow("outputTextAnnotationAdded")

    /** Emitted when there is an additional text delta. */
    fun asOutputTextDelta(): ResponseTextDeltaEvent = outputTextDelta.getOrThrow("outputTextDelta")

    /** Emitted when text content is finalized. */
    fun asOutputTextDone(): ResponseTextDoneEvent = outputTextDone.getOrThrow("outputTextDone")

    /** Emitted when a web search call is completed. */
    fun asWebSearchCallCompleted(): ResponseWebSearchCallCompletedEvent =
        webSearchCallCompleted.getOrThrow("webSearchCallCompleted")

    /** Emitted when a web search call is initiated. */
    fun asWebSearchCallInProgress(): ResponseWebSearchCallInProgressEvent =
        webSearchCallInProgress.getOrThrow("webSearchCallInProgress")

    /** Emitted when a web search call is executing. */
    fun asWebSearchCallSearching(): ResponseWebSearchCallSearchingEvent =
        webSearchCallSearching.getOrThrow("webSearchCallSearching")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            audioDelta != null -> visitor.visitAudioDelta(audioDelta)
            audioDone != null -> visitor.visitAudioDone(audioDone)
            audioTranscriptDelta != null -> visitor.visitAudioTranscriptDelta(audioTranscriptDelta)
            audioTranscriptDone != null -> visitor.visitAudioTranscriptDone(audioTranscriptDone)
            codeInterpreterCallCodeDelta != null ->
                visitor.visitCodeInterpreterCallCodeDelta(codeInterpreterCallCodeDelta)
            codeInterpreterCallCodeDone != null ->
                visitor.visitCodeInterpreterCallCodeDone(codeInterpreterCallCodeDone)
            codeInterpreterCallCompleted != null ->
                visitor.visitCodeInterpreterCallCompleted(codeInterpreterCallCompleted)
            codeInterpreterCallInProgress != null ->
                visitor.visitCodeInterpreterCallInProgress(codeInterpreterCallInProgress)
            codeInterpreterCallInterpreting != null ->
                visitor.visitCodeInterpreterCallInterpreting(codeInterpreterCallInterpreting)
            completed != null -> visitor.visitCompleted(completed)
            contentPartAdded != null -> visitor.visitContentPartAdded(contentPartAdded)
            contentPartDone != null -> visitor.visitContentPartDone(contentPartDone)
            created != null -> visitor.visitCreated(created)
            error != null -> visitor.visitError(error)
            fileSearchCallCompleted != null ->
                visitor.visitFileSearchCallCompleted(fileSearchCallCompleted)
            fileSearchCallInProgress != null ->
                visitor.visitFileSearchCallInProgress(fileSearchCallInProgress)
            fileSearchCallSearching != null ->
                visitor.visitFileSearchCallSearching(fileSearchCallSearching)
            functionCallArgumentsDelta != null ->
                visitor.visitFunctionCallArgumentsDelta(functionCallArgumentsDelta)
            functionCallArgumentsDone != null ->
                visitor.visitFunctionCallArgumentsDone(functionCallArgumentsDone)
            inProgress != null -> visitor.visitInProgress(inProgress)
            failed != null -> visitor.visitFailed(failed)
            incomplete != null -> visitor.visitIncomplete(incomplete)
            outputItemAdded != null -> visitor.visitOutputItemAdded(outputItemAdded)
            outputItemDone != null -> visitor.visitOutputItemDone(outputItemDone)
            reasoningSummaryPartAdded != null ->
                visitor.visitReasoningSummaryPartAdded(reasoningSummaryPartAdded)
            reasoningSummaryPartDone != null ->
                visitor.visitReasoningSummaryPartDone(reasoningSummaryPartDone)
            reasoningSummaryTextDelta != null ->
                visitor.visitReasoningSummaryTextDelta(reasoningSummaryTextDelta)
            reasoningSummaryTextDone != null ->
                visitor.visitReasoningSummaryTextDone(reasoningSummaryTextDone)
            refusalDelta != null -> visitor.visitRefusalDelta(refusalDelta)
            refusalDone != null -> visitor.visitRefusalDone(refusalDone)
            outputTextAnnotationAdded != null ->
                visitor.visitOutputTextAnnotationAdded(outputTextAnnotationAdded)
            outputTextDelta != null -> visitor.visitOutputTextDelta(outputTextDelta)
            outputTextDone != null -> visitor.visitOutputTextDone(outputTextDone)
            webSearchCallCompleted != null ->
                visitor.visitWebSearchCallCompleted(webSearchCallCompleted)
            webSearchCallInProgress != null ->
                visitor.visitWebSearchCallInProgress(webSearchCallInProgress)
            webSearchCallSearching != null ->
                visitor.visitWebSearchCallSearching(webSearchCallSearching)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ResponseStreamEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAudioDelta(audioDelta: ResponseAudioDeltaEvent) {
                    audioDelta.validate()
                }

                override fun visitAudioDone(audioDone: ResponseAudioDoneEvent) {
                    audioDone.validate()
                }

                override fun visitAudioTranscriptDelta(
                    audioTranscriptDelta: ResponseAudioTranscriptDeltaEvent
                ) {
                    audioTranscriptDelta.validate()
                }

                override fun visitAudioTranscriptDone(
                    audioTranscriptDone: ResponseAudioTranscriptDoneEvent
                ) {
                    audioTranscriptDone.validate()
                }

                override fun visitCodeInterpreterCallCodeDelta(
                    codeInterpreterCallCodeDelta: ResponseCodeInterpreterCallCodeDeltaEvent
                ) {
                    codeInterpreterCallCodeDelta.validate()
                }

                override fun visitCodeInterpreterCallCodeDone(
                    codeInterpreterCallCodeDone: ResponseCodeInterpreterCallCodeDoneEvent
                ) {
                    codeInterpreterCallCodeDone.validate()
                }

                override fun visitCodeInterpreterCallCompleted(
                    codeInterpreterCallCompleted: ResponseCodeInterpreterCallCompletedEvent
                ) {
                    codeInterpreterCallCompleted.validate()
                }

                override fun visitCodeInterpreterCallInProgress(
                    codeInterpreterCallInProgress: ResponseCodeInterpreterCallInProgressEvent
                ) {
                    codeInterpreterCallInProgress.validate()
                }

                override fun visitCodeInterpreterCallInterpreting(
                    codeInterpreterCallInterpreting: ResponseCodeInterpreterCallInterpretingEvent
                ) {
                    codeInterpreterCallInterpreting.validate()
                }

                override fun visitCompleted(completed: ResponseCompletedEvent) {
                    completed.validate()
                }

                override fun visitContentPartAdded(
                    contentPartAdded: ResponseContentPartAddedEvent
                ) {
                    contentPartAdded.validate()
                }

                override fun visitContentPartDone(contentPartDone: ResponseContentPartDoneEvent) {
                    contentPartDone.validate()
                }

                override fun visitCreated(created: ResponseCreatedEvent) {
                    created.validate()
                }

                override fun visitError(error: ResponseErrorEvent) {
                    error.validate()
                }

                override fun visitFileSearchCallCompleted(
                    fileSearchCallCompleted: ResponseFileSearchCallCompletedEvent
                ) {
                    fileSearchCallCompleted.validate()
                }

                override fun visitFileSearchCallInProgress(
                    fileSearchCallInProgress: ResponseFileSearchCallInProgressEvent
                ) {
                    fileSearchCallInProgress.validate()
                }

                override fun visitFileSearchCallSearching(
                    fileSearchCallSearching: ResponseFileSearchCallSearchingEvent
                ) {
                    fileSearchCallSearching.validate()
                }

                override fun visitFunctionCallArgumentsDelta(
                    functionCallArgumentsDelta: ResponseFunctionCallArgumentsDeltaEvent
                ) {
                    functionCallArgumentsDelta.validate()
                }

                override fun visitFunctionCallArgumentsDone(
                    functionCallArgumentsDone: ResponseFunctionCallArgumentsDoneEvent
                ) {
                    functionCallArgumentsDone.validate()
                }

                override fun visitInProgress(inProgress: ResponseInProgressEvent) {
                    inProgress.validate()
                }

                override fun visitFailed(failed: ResponseFailedEvent) {
                    failed.validate()
                }

                override fun visitIncomplete(incomplete: ResponseIncompleteEvent) {
                    incomplete.validate()
                }

                override fun visitOutputItemAdded(outputItemAdded: ResponseOutputItemAddedEvent) {
                    outputItemAdded.validate()
                }

                override fun visitOutputItemDone(outputItemDone: ResponseOutputItemDoneEvent) {
                    outputItemDone.validate()
                }

                override fun visitReasoningSummaryPartAdded(
                    reasoningSummaryPartAdded: ResponseReasoningSummaryPartAddedEvent
                ) {
                    reasoningSummaryPartAdded.validate()
                }

                override fun visitReasoningSummaryPartDone(
                    reasoningSummaryPartDone: ResponseReasoningSummaryPartDoneEvent
                ) {
                    reasoningSummaryPartDone.validate()
                }

                override fun visitReasoningSummaryTextDelta(
                    reasoningSummaryTextDelta: ResponseReasoningSummaryTextDeltaEvent
                ) {
                    reasoningSummaryTextDelta.validate()
                }

                override fun visitReasoningSummaryTextDone(
                    reasoningSummaryTextDone: ResponseReasoningSummaryTextDoneEvent
                ) {
                    reasoningSummaryTextDone.validate()
                }

                override fun visitRefusalDelta(refusalDelta: ResponseRefusalDeltaEvent) {
                    refusalDelta.validate()
                }

                override fun visitRefusalDone(refusalDone: ResponseRefusalDoneEvent) {
                    refusalDone.validate()
                }

                override fun visitOutputTextAnnotationAdded(
                    outputTextAnnotationAdded: ResponseTextAnnotationDeltaEvent
                ) {
                    outputTextAnnotationAdded.validate()
                }

                override fun visitOutputTextDelta(outputTextDelta: ResponseTextDeltaEvent) {
                    outputTextDelta.validate()
                }

                override fun visitOutputTextDone(outputTextDone: ResponseTextDoneEvent) {
                    outputTextDone.validate()
                }

                override fun visitWebSearchCallCompleted(
                    webSearchCallCompleted: ResponseWebSearchCallCompletedEvent
                ) {
                    webSearchCallCompleted.validate()
                }

                override fun visitWebSearchCallInProgress(
                    webSearchCallInProgress: ResponseWebSearchCallInProgressEvent
                ) {
                    webSearchCallInProgress.validate()
                }

                override fun visitWebSearchCallSearching(
                    webSearchCallSearching: ResponseWebSearchCallSearchingEvent
                ) {
                    webSearchCallSearching.validate()
                }
            }
        )
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
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAudioDelta(audioDelta: ResponseAudioDeltaEvent) =
                    audioDelta.validity()

                override fun visitAudioDone(audioDone: ResponseAudioDoneEvent) =
                    audioDone.validity()

                override fun visitAudioTranscriptDelta(
                    audioTranscriptDelta: ResponseAudioTranscriptDeltaEvent
                ) = audioTranscriptDelta.validity()

                override fun visitAudioTranscriptDone(
                    audioTranscriptDone: ResponseAudioTranscriptDoneEvent
                ) = audioTranscriptDone.validity()

                override fun visitCodeInterpreterCallCodeDelta(
                    codeInterpreterCallCodeDelta: ResponseCodeInterpreterCallCodeDeltaEvent
                ) = codeInterpreterCallCodeDelta.validity()

                override fun visitCodeInterpreterCallCodeDone(
                    codeInterpreterCallCodeDone: ResponseCodeInterpreterCallCodeDoneEvent
                ) = codeInterpreterCallCodeDone.validity()

                override fun visitCodeInterpreterCallCompleted(
                    codeInterpreterCallCompleted: ResponseCodeInterpreterCallCompletedEvent
                ) = codeInterpreterCallCompleted.validity()

                override fun visitCodeInterpreterCallInProgress(
                    codeInterpreterCallInProgress: ResponseCodeInterpreterCallInProgressEvent
                ) = codeInterpreterCallInProgress.validity()

                override fun visitCodeInterpreterCallInterpreting(
                    codeInterpreterCallInterpreting: ResponseCodeInterpreterCallInterpretingEvent
                ) = codeInterpreterCallInterpreting.validity()

                override fun visitCompleted(completed: ResponseCompletedEvent) =
                    completed.validity()

                override fun visitContentPartAdded(
                    contentPartAdded: ResponseContentPartAddedEvent
                ) = contentPartAdded.validity()

                override fun visitContentPartDone(contentPartDone: ResponseContentPartDoneEvent) =
                    contentPartDone.validity()

                override fun visitCreated(created: ResponseCreatedEvent) = created.validity()

                override fun visitError(error: ResponseErrorEvent) = error.validity()

                override fun visitFileSearchCallCompleted(
                    fileSearchCallCompleted: ResponseFileSearchCallCompletedEvent
                ) = fileSearchCallCompleted.validity()

                override fun visitFileSearchCallInProgress(
                    fileSearchCallInProgress: ResponseFileSearchCallInProgressEvent
                ) = fileSearchCallInProgress.validity()

                override fun visitFileSearchCallSearching(
                    fileSearchCallSearching: ResponseFileSearchCallSearchingEvent
                ) = fileSearchCallSearching.validity()

                override fun visitFunctionCallArgumentsDelta(
                    functionCallArgumentsDelta: ResponseFunctionCallArgumentsDeltaEvent
                ) = functionCallArgumentsDelta.validity()

                override fun visitFunctionCallArgumentsDone(
                    functionCallArgumentsDone: ResponseFunctionCallArgumentsDoneEvent
                ) = functionCallArgumentsDone.validity()

                override fun visitInProgress(inProgress: ResponseInProgressEvent) =
                    inProgress.validity()

                override fun visitFailed(failed: ResponseFailedEvent) = failed.validity()

                override fun visitIncomplete(incomplete: ResponseIncompleteEvent) =
                    incomplete.validity()

                override fun visitOutputItemAdded(outputItemAdded: ResponseOutputItemAddedEvent) =
                    outputItemAdded.validity()

                override fun visitOutputItemDone(outputItemDone: ResponseOutputItemDoneEvent) =
                    outputItemDone.validity()

                override fun visitReasoningSummaryPartAdded(
                    reasoningSummaryPartAdded: ResponseReasoningSummaryPartAddedEvent
                ) = reasoningSummaryPartAdded.validity()

                override fun visitReasoningSummaryPartDone(
                    reasoningSummaryPartDone: ResponseReasoningSummaryPartDoneEvent
                ) = reasoningSummaryPartDone.validity()

                override fun visitReasoningSummaryTextDelta(
                    reasoningSummaryTextDelta: ResponseReasoningSummaryTextDeltaEvent
                ) = reasoningSummaryTextDelta.validity()

                override fun visitReasoningSummaryTextDone(
                    reasoningSummaryTextDone: ResponseReasoningSummaryTextDoneEvent
                ) = reasoningSummaryTextDone.validity()

                override fun visitRefusalDelta(refusalDelta: ResponseRefusalDeltaEvent) =
                    refusalDelta.validity()

                override fun visitRefusalDone(refusalDone: ResponseRefusalDoneEvent) =
                    refusalDone.validity()

                override fun visitOutputTextAnnotationAdded(
                    outputTextAnnotationAdded: ResponseTextAnnotationDeltaEvent
                ) = outputTextAnnotationAdded.validity()

                override fun visitOutputTextDelta(outputTextDelta: ResponseTextDeltaEvent) =
                    outputTextDelta.validity()

                override fun visitOutputTextDone(outputTextDone: ResponseTextDoneEvent) =
                    outputTextDone.validity()

                override fun visitWebSearchCallCompleted(
                    webSearchCallCompleted: ResponseWebSearchCallCompletedEvent
                ) = webSearchCallCompleted.validity()

                override fun visitWebSearchCallInProgress(
                    webSearchCallInProgress: ResponseWebSearchCallInProgressEvent
                ) = webSearchCallInProgress.validity()

                override fun visitWebSearchCallSearching(
                    webSearchCallSearching: ResponseWebSearchCallSearchingEvent
                ) = webSearchCallSearching.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponseStreamEvent && audioDelta == other.audioDelta && audioDone == other.audioDone && audioTranscriptDelta == other.audioTranscriptDelta && audioTranscriptDone == other.audioTranscriptDone && codeInterpreterCallCodeDelta == other.codeInterpreterCallCodeDelta && codeInterpreterCallCodeDone == other.codeInterpreterCallCodeDone && codeInterpreterCallCompleted == other.codeInterpreterCallCompleted && codeInterpreterCallInProgress == other.codeInterpreterCallInProgress && codeInterpreterCallInterpreting == other.codeInterpreterCallInterpreting && completed == other.completed && contentPartAdded == other.contentPartAdded && contentPartDone == other.contentPartDone && created == other.created && error == other.error && fileSearchCallCompleted == other.fileSearchCallCompleted && fileSearchCallInProgress == other.fileSearchCallInProgress && fileSearchCallSearching == other.fileSearchCallSearching && functionCallArgumentsDelta == other.functionCallArgumentsDelta && functionCallArgumentsDone == other.functionCallArgumentsDone && inProgress == other.inProgress && failed == other.failed && incomplete == other.incomplete && outputItemAdded == other.outputItemAdded && outputItemDone == other.outputItemDone && reasoningSummaryPartAdded == other.reasoningSummaryPartAdded && reasoningSummaryPartDone == other.reasoningSummaryPartDone && reasoningSummaryTextDelta == other.reasoningSummaryTextDelta && reasoningSummaryTextDone == other.reasoningSummaryTextDone && refusalDelta == other.refusalDelta && refusalDone == other.refusalDone && outputTextAnnotationAdded == other.outputTextAnnotationAdded && outputTextDelta == other.outputTextDelta && outputTextDone == other.outputTextDone && webSearchCallCompleted == other.webSearchCallCompleted && webSearchCallInProgress == other.webSearchCallInProgress && webSearchCallSearching == other.webSearchCallSearching /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(audioDelta, audioDone, audioTranscriptDelta, audioTranscriptDone, codeInterpreterCallCodeDelta, codeInterpreterCallCodeDone, codeInterpreterCallCompleted, codeInterpreterCallInProgress, codeInterpreterCallInterpreting, completed, contentPartAdded, contentPartDone, created, error, fileSearchCallCompleted, fileSearchCallInProgress, fileSearchCallSearching, functionCallArgumentsDelta, functionCallArgumentsDone, inProgress, failed, incomplete, outputItemAdded, outputItemDone, reasoningSummaryPartAdded, reasoningSummaryPartDone, reasoningSummaryTextDelta, reasoningSummaryTextDone, refusalDelta, refusalDone, outputTextAnnotationAdded, outputTextDelta, outputTextDone, webSearchCallCompleted, webSearchCallInProgress, webSearchCallSearching) /* spotless:on */

    override fun toString(): String =
        when {
            audioDelta != null -> "ResponseStreamEvent{audioDelta=$audioDelta}"
            audioDone != null -> "ResponseStreamEvent{audioDone=$audioDone}"
            audioTranscriptDelta != null ->
                "ResponseStreamEvent{audioTranscriptDelta=$audioTranscriptDelta}"
            audioTranscriptDone != null ->
                "ResponseStreamEvent{audioTranscriptDone=$audioTranscriptDone}"
            codeInterpreterCallCodeDelta != null ->
                "ResponseStreamEvent{codeInterpreterCallCodeDelta=$codeInterpreterCallCodeDelta}"
            codeInterpreterCallCodeDone != null ->
                "ResponseStreamEvent{codeInterpreterCallCodeDone=$codeInterpreterCallCodeDone}"
            codeInterpreterCallCompleted != null ->
                "ResponseStreamEvent{codeInterpreterCallCompleted=$codeInterpreterCallCompleted}"
            codeInterpreterCallInProgress != null ->
                "ResponseStreamEvent{codeInterpreterCallInProgress=$codeInterpreterCallInProgress}"
            codeInterpreterCallInterpreting != null ->
                "ResponseStreamEvent{codeInterpreterCallInterpreting=$codeInterpreterCallInterpreting}"
            completed != null -> "ResponseStreamEvent{completed=$completed}"
            contentPartAdded != null -> "ResponseStreamEvent{contentPartAdded=$contentPartAdded}"
            contentPartDone != null -> "ResponseStreamEvent{contentPartDone=$contentPartDone}"
            created != null -> "ResponseStreamEvent{created=$created}"
            error != null -> "ResponseStreamEvent{error=$error}"
            fileSearchCallCompleted != null ->
                "ResponseStreamEvent{fileSearchCallCompleted=$fileSearchCallCompleted}"
            fileSearchCallInProgress != null ->
                "ResponseStreamEvent{fileSearchCallInProgress=$fileSearchCallInProgress}"
            fileSearchCallSearching != null ->
                "ResponseStreamEvent{fileSearchCallSearching=$fileSearchCallSearching}"
            functionCallArgumentsDelta != null ->
                "ResponseStreamEvent{functionCallArgumentsDelta=$functionCallArgumentsDelta}"
            functionCallArgumentsDone != null ->
                "ResponseStreamEvent{functionCallArgumentsDone=$functionCallArgumentsDone}"
            inProgress != null -> "ResponseStreamEvent{inProgress=$inProgress}"
            failed != null -> "ResponseStreamEvent{failed=$failed}"
            incomplete != null -> "ResponseStreamEvent{incomplete=$incomplete}"
            outputItemAdded != null -> "ResponseStreamEvent{outputItemAdded=$outputItemAdded}"
            outputItemDone != null -> "ResponseStreamEvent{outputItemDone=$outputItemDone}"
            reasoningSummaryPartAdded != null ->
                "ResponseStreamEvent{reasoningSummaryPartAdded=$reasoningSummaryPartAdded}"
            reasoningSummaryPartDone != null ->
                "ResponseStreamEvent{reasoningSummaryPartDone=$reasoningSummaryPartDone}"
            reasoningSummaryTextDelta != null ->
                "ResponseStreamEvent{reasoningSummaryTextDelta=$reasoningSummaryTextDelta}"
            reasoningSummaryTextDone != null ->
                "ResponseStreamEvent{reasoningSummaryTextDone=$reasoningSummaryTextDone}"
            refusalDelta != null -> "ResponseStreamEvent{refusalDelta=$refusalDelta}"
            refusalDone != null -> "ResponseStreamEvent{refusalDone=$refusalDone}"
            outputTextAnnotationAdded != null ->
                "ResponseStreamEvent{outputTextAnnotationAdded=$outputTextAnnotationAdded}"
            outputTextDelta != null -> "ResponseStreamEvent{outputTextDelta=$outputTextDelta}"
            outputTextDone != null -> "ResponseStreamEvent{outputTextDone=$outputTextDone}"
            webSearchCallCompleted != null ->
                "ResponseStreamEvent{webSearchCallCompleted=$webSearchCallCompleted}"
            webSearchCallInProgress != null ->
                "ResponseStreamEvent{webSearchCallInProgress=$webSearchCallInProgress}"
            webSearchCallSearching != null ->
                "ResponseStreamEvent{webSearchCallSearching=$webSearchCallSearching}"
            _json != null -> "ResponseStreamEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ResponseStreamEvent")
        }

    companion object {

        /** Emitted when there is a partial audio response. */
        @JvmStatic
        fun ofAudioDelta(audioDelta: ResponseAudioDeltaEvent) =
            ResponseStreamEvent(audioDelta = audioDelta)

        /** Emitted when the audio response is complete. */
        @JvmStatic
        fun ofAudioDone(audioDone: ResponseAudioDoneEvent) =
            ResponseStreamEvent(audioDone = audioDone)

        /** Emitted when there is a partial transcript of audio. */
        @JvmStatic
        fun ofAudioTranscriptDelta(audioTranscriptDelta: ResponseAudioTranscriptDeltaEvent) =
            ResponseStreamEvent(audioTranscriptDelta = audioTranscriptDelta)

        /** Emitted when the full audio transcript is completed. */
        @JvmStatic
        fun ofAudioTranscriptDone(audioTranscriptDone: ResponseAudioTranscriptDoneEvent) =
            ResponseStreamEvent(audioTranscriptDone = audioTranscriptDone)

        /** Emitted when a partial code snippet is added by the code interpreter. */
        @JvmStatic
        fun ofCodeInterpreterCallCodeDelta(
            codeInterpreterCallCodeDelta: ResponseCodeInterpreterCallCodeDeltaEvent
        ) = ResponseStreamEvent(codeInterpreterCallCodeDelta = codeInterpreterCallCodeDelta)

        /** Emitted when code snippet output is finalized by the code interpreter. */
        @JvmStatic
        fun ofCodeInterpreterCallCodeDone(
            codeInterpreterCallCodeDone: ResponseCodeInterpreterCallCodeDoneEvent
        ) = ResponseStreamEvent(codeInterpreterCallCodeDone = codeInterpreterCallCodeDone)

        /** Emitted when the code interpreter call is completed. */
        @JvmStatic
        fun ofCodeInterpreterCallCompleted(
            codeInterpreterCallCompleted: ResponseCodeInterpreterCallCompletedEvent
        ) = ResponseStreamEvent(codeInterpreterCallCompleted = codeInterpreterCallCompleted)

        /** Emitted when a code interpreter call is in progress. */
        @JvmStatic
        fun ofCodeInterpreterCallInProgress(
            codeInterpreterCallInProgress: ResponseCodeInterpreterCallInProgressEvent
        ) = ResponseStreamEvent(codeInterpreterCallInProgress = codeInterpreterCallInProgress)

        /** Emitted when the code interpreter is actively interpreting the code snippet. */
        @JvmStatic
        fun ofCodeInterpreterCallInterpreting(
            codeInterpreterCallInterpreting: ResponseCodeInterpreterCallInterpretingEvent
        ) = ResponseStreamEvent(codeInterpreterCallInterpreting = codeInterpreterCallInterpreting)

        /** Emitted when the model response is complete. */
        @JvmStatic
        fun ofCompleted(completed: ResponseCompletedEvent) =
            ResponseStreamEvent(completed = completed)

        /** Emitted when a new content part is added. */
        @JvmStatic
        fun ofContentPartAdded(contentPartAdded: ResponseContentPartAddedEvent) =
            ResponseStreamEvent(contentPartAdded = contentPartAdded)

        /** Emitted when a content part is done. */
        @JvmStatic
        fun ofContentPartDone(contentPartDone: ResponseContentPartDoneEvent) =
            ResponseStreamEvent(contentPartDone = contentPartDone)

        /** An event that is emitted when a response is created. */
        @JvmStatic
        fun ofCreated(created: ResponseCreatedEvent) = ResponseStreamEvent(created = created)

        /** Emitted when an error occurs. */
        @JvmStatic fun ofError(error: ResponseErrorEvent) = ResponseStreamEvent(error = error)

        /** Emitted when a file search call is completed (results found). */
        @JvmStatic
        fun ofFileSearchCallCompleted(
            fileSearchCallCompleted: ResponseFileSearchCallCompletedEvent
        ) = ResponseStreamEvent(fileSearchCallCompleted = fileSearchCallCompleted)

        /** Emitted when a file search call is initiated. */
        @JvmStatic
        fun ofFileSearchCallInProgress(
            fileSearchCallInProgress: ResponseFileSearchCallInProgressEvent
        ) = ResponseStreamEvent(fileSearchCallInProgress = fileSearchCallInProgress)

        /** Emitted when a file search is currently searching. */
        @JvmStatic
        fun ofFileSearchCallSearching(
            fileSearchCallSearching: ResponseFileSearchCallSearchingEvent
        ) = ResponseStreamEvent(fileSearchCallSearching = fileSearchCallSearching)

        /** Emitted when there is a partial function-call arguments delta. */
        @JvmStatic
        fun ofFunctionCallArgumentsDelta(
            functionCallArgumentsDelta: ResponseFunctionCallArgumentsDeltaEvent
        ) = ResponseStreamEvent(functionCallArgumentsDelta = functionCallArgumentsDelta)

        /** Emitted when function-call arguments are finalized. */
        @JvmStatic
        fun ofFunctionCallArgumentsDone(
            functionCallArgumentsDone: ResponseFunctionCallArgumentsDoneEvent
        ) = ResponseStreamEvent(functionCallArgumentsDone = functionCallArgumentsDone)

        /** Emitted when the response is in progress. */
        @JvmStatic
        fun ofInProgress(inProgress: ResponseInProgressEvent) =
            ResponseStreamEvent(inProgress = inProgress)

        /** An event that is emitted when a response fails. */
        @JvmStatic fun ofFailed(failed: ResponseFailedEvent) = ResponseStreamEvent(failed = failed)

        /** An event that is emitted when a response finishes as incomplete. */
        @JvmStatic
        fun ofIncomplete(incomplete: ResponseIncompleteEvent) =
            ResponseStreamEvent(incomplete = incomplete)

        /** Emitted when a new output item is added. */
        @JvmStatic
        fun ofOutputItemAdded(outputItemAdded: ResponseOutputItemAddedEvent) =
            ResponseStreamEvent(outputItemAdded = outputItemAdded)

        /** Emitted when an output item is marked done. */
        @JvmStatic
        fun ofOutputItemDone(outputItemDone: ResponseOutputItemDoneEvent) =
            ResponseStreamEvent(outputItemDone = outputItemDone)

        /** Emitted when a new reasoning summary part is added. */
        @JvmStatic
        fun ofReasoningSummaryPartAdded(
            reasoningSummaryPartAdded: ResponseReasoningSummaryPartAddedEvent
        ) = ResponseStreamEvent(reasoningSummaryPartAdded = reasoningSummaryPartAdded)

        /** Emitted when a reasoning summary part is completed. */
        @JvmStatic
        fun ofReasoningSummaryPartDone(
            reasoningSummaryPartDone: ResponseReasoningSummaryPartDoneEvent
        ) = ResponseStreamEvent(reasoningSummaryPartDone = reasoningSummaryPartDone)

        /** Emitted when a delta is added to a reasoning summary text. */
        @JvmStatic
        fun ofReasoningSummaryTextDelta(
            reasoningSummaryTextDelta: ResponseReasoningSummaryTextDeltaEvent
        ) = ResponseStreamEvent(reasoningSummaryTextDelta = reasoningSummaryTextDelta)

        /** Emitted when a reasoning summary text is completed. */
        @JvmStatic
        fun ofReasoningSummaryTextDone(
            reasoningSummaryTextDone: ResponseReasoningSummaryTextDoneEvent
        ) = ResponseStreamEvent(reasoningSummaryTextDone = reasoningSummaryTextDone)

        /** Emitted when there is a partial refusal text. */
        @JvmStatic
        fun ofRefusalDelta(refusalDelta: ResponseRefusalDeltaEvent) =
            ResponseStreamEvent(refusalDelta = refusalDelta)

        /** Emitted when refusal text is finalized. */
        @JvmStatic
        fun ofRefusalDone(refusalDone: ResponseRefusalDoneEvent) =
            ResponseStreamEvent(refusalDone = refusalDone)

        /** Emitted when a text annotation is added. */
        @JvmStatic
        fun ofOutputTextAnnotationAdded(
            outputTextAnnotationAdded: ResponseTextAnnotationDeltaEvent
        ) = ResponseStreamEvent(outputTextAnnotationAdded = outputTextAnnotationAdded)

        /** Emitted when there is an additional text delta. */
        @JvmStatic
        fun ofOutputTextDelta(outputTextDelta: ResponseTextDeltaEvent) =
            ResponseStreamEvent(outputTextDelta = outputTextDelta)

        /** Emitted when text content is finalized. */
        @JvmStatic
        fun ofOutputTextDone(outputTextDone: ResponseTextDoneEvent) =
            ResponseStreamEvent(outputTextDone = outputTextDone)

        /** Emitted when a web search call is completed. */
        @JvmStatic
        fun ofWebSearchCallCompleted(webSearchCallCompleted: ResponseWebSearchCallCompletedEvent) =
            ResponseStreamEvent(webSearchCallCompleted = webSearchCallCompleted)

        /** Emitted when a web search call is initiated. */
        @JvmStatic
        fun ofWebSearchCallInProgress(
            webSearchCallInProgress: ResponseWebSearchCallInProgressEvent
        ) = ResponseStreamEvent(webSearchCallInProgress = webSearchCallInProgress)

        /** Emitted when a web search call is executing. */
        @JvmStatic
        fun ofWebSearchCallSearching(webSearchCallSearching: ResponseWebSearchCallSearchingEvent) =
            ResponseStreamEvent(webSearchCallSearching = webSearchCallSearching)
    }

    /**
     * An interface that defines how to map each variant of [ResponseStreamEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Emitted when there is a partial audio response. */
        fun visitAudioDelta(audioDelta: ResponseAudioDeltaEvent): T

        /** Emitted when the audio response is complete. */
        fun visitAudioDone(audioDone: ResponseAudioDoneEvent): T

        /** Emitted when there is a partial transcript of audio. */
        fun visitAudioTranscriptDelta(audioTranscriptDelta: ResponseAudioTranscriptDeltaEvent): T

        /** Emitted when the full audio transcript is completed. */
        fun visitAudioTranscriptDone(audioTranscriptDone: ResponseAudioTranscriptDoneEvent): T

        /** Emitted when a partial code snippet is added by the code interpreter. */
        fun visitCodeInterpreterCallCodeDelta(
            codeInterpreterCallCodeDelta: ResponseCodeInterpreterCallCodeDeltaEvent
        ): T

        /** Emitted when code snippet output is finalized by the code interpreter. */
        fun visitCodeInterpreterCallCodeDone(
            codeInterpreterCallCodeDone: ResponseCodeInterpreterCallCodeDoneEvent
        ): T

        /** Emitted when the code interpreter call is completed. */
        fun visitCodeInterpreterCallCompleted(
            codeInterpreterCallCompleted: ResponseCodeInterpreterCallCompletedEvent
        ): T

        /** Emitted when a code interpreter call is in progress. */
        fun visitCodeInterpreterCallInProgress(
            codeInterpreterCallInProgress: ResponseCodeInterpreterCallInProgressEvent
        ): T

        /** Emitted when the code interpreter is actively interpreting the code snippet. */
        fun visitCodeInterpreterCallInterpreting(
            codeInterpreterCallInterpreting: ResponseCodeInterpreterCallInterpretingEvent
        ): T

        /** Emitted when the model response is complete. */
        fun visitCompleted(completed: ResponseCompletedEvent): T

        /** Emitted when a new content part is added. */
        fun visitContentPartAdded(contentPartAdded: ResponseContentPartAddedEvent): T

        /** Emitted when a content part is done. */
        fun visitContentPartDone(contentPartDone: ResponseContentPartDoneEvent): T

        /** An event that is emitted when a response is created. */
        fun visitCreated(created: ResponseCreatedEvent): T

        /** Emitted when an error occurs. */
        fun visitError(error: ResponseErrorEvent): T

        /** Emitted when a file search call is completed (results found). */
        fun visitFileSearchCallCompleted(
            fileSearchCallCompleted: ResponseFileSearchCallCompletedEvent
        ): T

        /** Emitted when a file search call is initiated. */
        fun visitFileSearchCallInProgress(
            fileSearchCallInProgress: ResponseFileSearchCallInProgressEvent
        ): T

        /** Emitted when a file search is currently searching. */
        fun visitFileSearchCallSearching(
            fileSearchCallSearching: ResponseFileSearchCallSearchingEvent
        ): T

        /** Emitted when there is a partial function-call arguments delta. */
        fun visitFunctionCallArgumentsDelta(
            functionCallArgumentsDelta: ResponseFunctionCallArgumentsDeltaEvent
        ): T

        /** Emitted when function-call arguments are finalized. */
        fun visitFunctionCallArgumentsDone(
            functionCallArgumentsDone: ResponseFunctionCallArgumentsDoneEvent
        ): T

        /** Emitted when the response is in progress. */
        fun visitInProgress(inProgress: ResponseInProgressEvent): T

        /** An event that is emitted when a response fails. */
        fun visitFailed(failed: ResponseFailedEvent): T

        /** An event that is emitted when a response finishes as incomplete. */
        fun visitIncomplete(incomplete: ResponseIncompleteEvent): T

        /** Emitted when a new output item is added. */
        fun visitOutputItemAdded(outputItemAdded: ResponseOutputItemAddedEvent): T

        /** Emitted when an output item is marked done. */
        fun visitOutputItemDone(outputItemDone: ResponseOutputItemDoneEvent): T

        /** Emitted when a new reasoning summary part is added. */
        fun visitReasoningSummaryPartAdded(
            reasoningSummaryPartAdded: ResponseReasoningSummaryPartAddedEvent
        ): T

        /** Emitted when a reasoning summary part is completed. */
        fun visitReasoningSummaryPartDone(
            reasoningSummaryPartDone: ResponseReasoningSummaryPartDoneEvent
        ): T

        /** Emitted when a delta is added to a reasoning summary text. */
        fun visitReasoningSummaryTextDelta(
            reasoningSummaryTextDelta: ResponseReasoningSummaryTextDeltaEvent
        ): T

        /** Emitted when a reasoning summary text is completed. */
        fun visitReasoningSummaryTextDone(
            reasoningSummaryTextDone: ResponseReasoningSummaryTextDoneEvent
        ): T

        /** Emitted when there is a partial refusal text. */
        fun visitRefusalDelta(refusalDelta: ResponseRefusalDeltaEvent): T

        /** Emitted when refusal text is finalized. */
        fun visitRefusalDone(refusalDone: ResponseRefusalDoneEvent): T

        /** Emitted when a text annotation is added. */
        fun visitOutputTextAnnotationAdded(
            outputTextAnnotationAdded: ResponseTextAnnotationDeltaEvent
        ): T

        /** Emitted when there is an additional text delta. */
        fun visitOutputTextDelta(outputTextDelta: ResponseTextDeltaEvent): T

        /** Emitted when text content is finalized. */
        fun visitOutputTextDone(outputTextDone: ResponseTextDoneEvent): T

        /** Emitted when a web search call is completed. */
        fun visitWebSearchCallCompleted(
            webSearchCallCompleted: ResponseWebSearchCallCompletedEvent
        ): T

        /** Emitted when a web search call is initiated. */
        fun visitWebSearchCallInProgress(
            webSearchCallInProgress: ResponseWebSearchCallInProgressEvent
        ): T

        /** Emitted when a web search call is executing. */
        fun visitWebSearchCallSearching(
            webSearchCallSearching: ResponseWebSearchCallSearchingEvent
        ): T

        /**
         * Maps an unknown variant of [ResponseStreamEvent] to a value of type [T].
         *
         * An instance of [ResponseStreamEvent] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws OpenAIInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OpenAIInvalidDataException("Unknown ResponseStreamEvent: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ResponseStreamEvent>(ResponseStreamEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ResponseStreamEvent {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "response.audio.delta" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseAudioDeltaEvent>())?.let {
                        ResponseStreamEvent(audioDelta = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.audio.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseAudioDoneEvent>())?.let {
                        ResponseStreamEvent(audioDone = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.audio.transcript.delta" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseAudioTranscriptDeltaEvent>())
                        ?.let { ResponseStreamEvent(audioTranscriptDelta = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.audio.transcript.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseAudioTranscriptDoneEvent>())
                        ?.let { ResponseStreamEvent(audioTranscriptDone = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.code_interpreter_call.code.delta" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseCodeInterpreterCallCodeDeltaEvent>(),
                        )
                        ?.let {
                            ResponseStreamEvent(codeInterpreterCallCodeDelta = it, _json = json)
                        } ?: ResponseStreamEvent(_json = json)
                }
                "response.code_interpreter_call.code.done" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseCodeInterpreterCallCodeDoneEvent>(),
                        )
                        ?.let {
                            ResponseStreamEvent(codeInterpreterCallCodeDone = it, _json = json)
                        } ?: ResponseStreamEvent(_json = json)
                }
                "response.code_interpreter_call.completed" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseCodeInterpreterCallCompletedEvent>(),
                        )
                        ?.let {
                            ResponseStreamEvent(codeInterpreterCallCompleted = it, _json = json)
                        } ?: ResponseStreamEvent(_json = json)
                }
                "response.code_interpreter_call.in_progress" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseCodeInterpreterCallInProgressEvent>(),
                        )
                        ?.let {
                            ResponseStreamEvent(codeInterpreterCallInProgress = it, _json = json)
                        } ?: ResponseStreamEvent(_json = json)
                }
                "response.code_interpreter_call.interpreting" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseCodeInterpreterCallInterpretingEvent>(),
                        )
                        ?.let {
                            ResponseStreamEvent(codeInterpreterCallInterpreting = it, _json = json)
                        } ?: ResponseStreamEvent(_json = json)
                }
                "response.completed" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseCompletedEvent>())?.let {
                        ResponseStreamEvent(completed = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.content_part.added" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseContentPartAddedEvent>())
                        ?.let { ResponseStreamEvent(contentPartAdded = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.content_part.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseContentPartDoneEvent>())
                        ?.let { ResponseStreamEvent(contentPartDone = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.created" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseCreatedEvent>())?.let {
                        ResponseStreamEvent(created = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "error" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseErrorEvent>())?.let {
                        ResponseStreamEvent(error = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.file_search_call.completed" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseFileSearchCallCompletedEvent>(),
                        )
                        ?.let { ResponseStreamEvent(fileSearchCallCompleted = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.file_search_call.in_progress" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseFileSearchCallInProgressEvent>(),
                        )
                        ?.let { ResponseStreamEvent(fileSearchCallInProgress = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.file_search_call.searching" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseFileSearchCallSearchingEvent>(),
                        )
                        ?.let { ResponseStreamEvent(fileSearchCallSearching = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.function_call_arguments.delta" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseFunctionCallArgumentsDeltaEvent>(),
                        )
                        ?.let { ResponseStreamEvent(functionCallArgumentsDelta = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.function_call_arguments.done" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseFunctionCallArgumentsDoneEvent>(),
                        )
                        ?.let { ResponseStreamEvent(functionCallArgumentsDone = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.in_progress" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseInProgressEvent>())?.let {
                        ResponseStreamEvent(inProgress = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.failed" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseFailedEvent>())?.let {
                        ResponseStreamEvent(failed = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.incomplete" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseIncompleteEvent>())?.let {
                        ResponseStreamEvent(incomplete = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.output_item.added" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseOutputItemAddedEvent>())
                        ?.let { ResponseStreamEvent(outputItemAdded = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.output_item.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseOutputItemDoneEvent>())
                        ?.let { ResponseStreamEvent(outputItemDone = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.reasoning_summary_part.added" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseReasoningSummaryPartAddedEvent>(),
                        )
                        ?.let { ResponseStreamEvent(reasoningSummaryPartAdded = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.reasoning_summary_part.done" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseReasoningSummaryPartDoneEvent>(),
                        )
                        ?.let { ResponseStreamEvent(reasoningSummaryPartDone = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.reasoning_summary_text.delta" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseReasoningSummaryTextDeltaEvent>(),
                        )
                        ?.let { ResponseStreamEvent(reasoningSummaryTextDelta = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.reasoning_summary_text.done" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseReasoningSummaryTextDoneEvent>(),
                        )
                        ?.let { ResponseStreamEvent(reasoningSummaryTextDone = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.refusal.delta" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseRefusalDeltaEvent>())?.let {
                        ResponseStreamEvent(refusalDelta = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.refusal.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseRefusalDoneEvent>())?.let {
                        ResponseStreamEvent(refusalDone = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.output_text.annotation.added" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseTextAnnotationDeltaEvent>())
                        ?.let { ResponseStreamEvent(outputTextAnnotationAdded = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.output_text.delta" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseTextDeltaEvent>())?.let {
                        ResponseStreamEvent(outputTextDelta = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.output_text.done" -> {
                    return tryDeserialize(node, jacksonTypeRef<ResponseTextDoneEvent>())?.let {
                        ResponseStreamEvent(outputTextDone = it, _json = json)
                    } ?: ResponseStreamEvent(_json = json)
                }
                "response.web_search_call.completed" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseWebSearchCallCompletedEvent>(),
                        )
                        ?.let { ResponseStreamEvent(webSearchCallCompleted = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.web_search_call.in_progress" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseWebSearchCallInProgressEvent>(),
                        )
                        ?.let { ResponseStreamEvent(webSearchCallInProgress = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
                "response.web_search_call.searching" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ResponseWebSearchCallSearchingEvent>(),
                        )
                        ?.let { ResponseStreamEvent(webSearchCallSearching = it, _json = json) }
                        ?: ResponseStreamEvent(_json = json)
                }
            }

            return ResponseStreamEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ResponseStreamEvent>(ResponseStreamEvent::class) {

        override fun serialize(
            value: ResponseStreamEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.audioDelta != null -> generator.writeObject(value.audioDelta)
                value.audioDone != null -> generator.writeObject(value.audioDone)
                value.audioTranscriptDelta != null ->
                    generator.writeObject(value.audioTranscriptDelta)
                value.audioTranscriptDone != null ->
                    generator.writeObject(value.audioTranscriptDone)
                value.codeInterpreterCallCodeDelta != null ->
                    generator.writeObject(value.codeInterpreterCallCodeDelta)
                value.codeInterpreterCallCodeDone != null ->
                    generator.writeObject(value.codeInterpreterCallCodeDone)
                value.codeInterpreterCallCompleted != null ->
                    generator.writeObject(value.codeInterpreterCallCompleted)
                value.codeInterpreterCallInProgress != null ->
                    generator.writeObject(value.codeInterpreterCallInProgress)
                value.codeInterpreterCallInterpreting != null ->
                    generator.writeObject(value.codeInterpreterCallInterpreting)
                value.completed != null -> generator.writeObject(value.completed)
                value.contentPartAdded != null -> generator.writeObject(value.contentPartAdded)
                value.contentPartDone != null -> generator.writeObject(value.contentPartDone)
                value.created != null -> generator.writeObject(value.created)
                value.error != null -> generator.writeObject(value.error)
                value.fileSearchCallCompleted != null ->
                    generator.writeObject(value.fileSearchCallCompleted)
                value.fileSearchCallInProgress != null ->
                    generator.writeObject(value.fileSearchCallInProgress)
                value.fileSearchCallSearching != null ->
                    generator.writeObject(value.fileSearchCallSearching)
                value.functionCallArgumentsDelta != null ->
                    generator.writeObject(value.functionCallArgumentsDelta)
                value.functionCallArgumentsDone != null ->
                    generator.writeObject(value.functionCallArgumentsDone)
                value.inProgress != null -> generator.writeObject(value.inProgress)
                value.failed != null -> generator.writeObject(value.failed)
                value.incomplete != null -> generator.writeObject(value.incomplete)
                value.outputItemAdded != null -> generator.writeObject(value.outputItemAdded)
                value.outputItemDone != null -> generator.writeObject(value.outputItemDone)
                value.reasoningSummaryPartAdded != null ->
                    generator.writeObject(value.reasoningSummaryPartAdded)
                value.reasoningSummaryPartDone != null ->
                    generator.writeObject(value.reasoningSummaryPartDone)
                value.reasoningSummaryTextDelta != null ->
                    generator.writeObject(value.reasoningSummaryTextDelta)
                value.reasoningSummaryTextDone != null ->
                    generator.writeObject(value.reasoningSummaryTextDone)
                value.refusalDelta != null -> generator.writeObject(value.refusalDelta)
                value.refusalDone != null -> generator.writeObject(value.refusalDone)
                value.outputTextAnnotationAdded != null ->
                    generator.writeObject(value.outputTextAnnotationAdded)
                value.outputTextDelta != null -> generator.writeObject(value.outputTextDelta)
                value.outputTextDone != null -> generator.writeObject(value.outputTextDone)
                value.webSearchCallCompleted != null ->
                    generator.writeObject(value.webSearchCallCompleted)
                value.webSearchCallInProgress != null ->
                    generator.writeObject(value.webSearchCallInProgress)
                value.webSearchCallSearching != null ->
                    generator.writeObject(value.webSearchCallSearching)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ResponseStreamEvent")
            }
        }
    }
}

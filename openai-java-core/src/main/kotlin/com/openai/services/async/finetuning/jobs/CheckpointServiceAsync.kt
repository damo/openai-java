// File generated from our OpenAPI spec by Stainless.

package com.openai.services.async.finetuning.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.openai.core.RequestOptions
import com.openai.core.http.HttpResponseFor
import com.openai.models.finetuning.jobs.checkpoints.CheckpointListPageAsync
import com.openai.models.finetuning.jobs.checkpoints.CheckpointListParams
import java.util.concurrent.CompletableFuture

interface CheckpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List checkpoints for a fine-tuning job. */
    fun list(params: CheckpointListParams): CompletableFuture<CheckpointListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CheckpointListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckpointListPageAsync>

    /**
     * A view of [CheckpointServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints`,
         * but is otherwise the same as [CheckpointServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: CheckpointListParams
        ): CompletableFuture<HttpResponseFor<CheckpointListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CheckpointListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckpointListPageAsync>>
    }
}

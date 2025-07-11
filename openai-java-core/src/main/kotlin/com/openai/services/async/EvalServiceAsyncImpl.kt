// File generated from our OpenAPI spec by Stainless.

package com.openai.services.async

import com.openai.core.ClientOptions
import com.openai.core.RequestOptions
import com.openai.core.checkRequired
import com.openai.core.handlers.errorHandler
import com.openai.core.handlers.jsonHandler
import com.openai.core.handlers.withErrorHandler
import com.openai.core.http.HttpMethod
import com.openai.core.http.HttpRequest
import com.openai.core.http.HttpResponse.Handler
import com.openai.core.http.HttpResponseFor
import com.openai.core.http.json
import com.openai.core.http.parseable
import com.openai.core.prepareAsync
import com.openai.models.ErrorObject
import com.openai.models.evals.EvalCreateParams
import com.openai.models.evals.EvalCreateResponse
import com.openai.models.evals.EvalDeleteParams
import com.openai.models.evals.EvalDeleteResponse
import com.openai.models.evals.EvalListPageAsync
import com.openai.models.evals.EvalListPageResponse
import com.openai.models.evals.EvalListParams
import com.openai.models.evals.EvalRetrieveParams
import com.openai.models.evals.EvalRetrieveResponse
import com.openai.models.evals.EvalUpdateParams
import com.openai.models.evals.EvalUpdateResponse
import com.openai.services.async.evals.RunServiceAsync
import com.openai.services.async.evals.RunServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EvalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EvalServiceAsync {

    private val withRawResponse: EvalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EvalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvalServiceAsync =
        EvalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun runs(): RunServiceAsync = runs

    override fun create(
        params: EvalCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvalCreateResponse> =
        // post /evals
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EvalRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvalRetrieveResponse> =
        // get /evals/{eval_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EvalUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvalUpdateResponse> =
        // post /evals/{eval_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EvalListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvalListPageAsync> =
        // get /evals
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EvalDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvalDeleteResponse> =
        // delete /evals/{eval_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ErrorObject?> = errorHandler(clientOptions.jsonMapper)

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EvalServiceAsync.WithRawResponse =
            EvalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        private val createHandler: Handler<EvalCreateResponse> =
            jsonHandler<EvalCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: EvalCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvalCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("evals")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params, deploymentModel = null)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<EvalRetrieveResponse> =
            jsonHandler<EvalRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: EvalRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvalRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("evalId", params.evalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("evals", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params, deploymentModel = null)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<EvalUpdateResponse> =
            jsonHandler<EvalUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: EvalUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvalUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("evalId", params.evalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("evals", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params, deploymentModel = null)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<EvalListPageResponse> =
            jsonHandler<EvalListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: EvalListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvalListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("evals")
                    .build()
                    .prepareAsync(clientOptions, params, deploymentModel = null)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EvalListPageAsync.builder()
                                    .service(EvalServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<EvalDeleteResponse> =
            jsonHandler<EvalDeleteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: EvalDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvalDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("evalId", params.evalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("evals", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params, deploymentModel = null)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}

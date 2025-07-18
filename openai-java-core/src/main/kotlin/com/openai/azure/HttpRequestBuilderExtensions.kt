package com.openai.azure

import com.openai.core.ClientOptions
import com.openai.core.http.HttpRequest
import com.openai.core.isAzureEndpoint
import com.openai.credential.BearerTokenCredential

@JvmSynthetic
internal fun HttpRequest.Builder.addPathSegmentsForAzure(
    clientOptions: ClientOptions,
    deploymentModel: String?,
): HttpRequest.Builder = apply {
    if (isAzureEndpoint(clientOptions.baseUrl())) {
        addPathSegment("openai")
        deploymentModel?.let { addPathSegments("deployments", it) }
    }
}

@JvmSynthetic
internal fun HttpRequest.Builder.replaceBearerTokenForAzure(
    clientOptions: ClientOptions
): HttpRequest.Builder = apply {
    if (
        isAzureEndpoint(clientOptions.baseUrl()) &&
            clientOptions.credential is BearerTokenCredential
    ) {
        replaceHeaders("Authorization", "Bearer ${clientOptions.credential.token()}")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.openai.models.vectorstores

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VectorStoreRetrieveParamsTest {

    @Test
    fun create() {
        VectorStoreRetrieveParams.builder().vectorStoreId("vector_store_id").build()
    }

    @Test
    fun getPathParam() {
        val params = VectorStoreRetrieveParams.builder().vectorStoreId("vector_store_id").build()
        assertThat(params).isNotNull
        // path param "vectorStoreId"
        assertThat(params.getPathParam(0)).isEqualTo("vector_store_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

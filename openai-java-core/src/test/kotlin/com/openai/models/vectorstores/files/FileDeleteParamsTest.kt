// File generated from our OpenAPI spec by Stainless.

package com.openai.models.vectorstores.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileDeleteParamsTest {

    @Test
    fun create() {
        FileDeleteParams.builder().vectorStoreId("vector_store_id").fileId("file_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            FileDeleteParams.builder().vectorStoreId("vector_store_id").fileId("file_id").build()
        assertThat(params).isNotNull
        // path param "vectorStoreId"
        assertThat(params.getPathParam(0)).isEqualTo("vector_store_id")
        // path param "fileId"
        assertThat(params.getPathParam(1)).isEqualTo("file_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}

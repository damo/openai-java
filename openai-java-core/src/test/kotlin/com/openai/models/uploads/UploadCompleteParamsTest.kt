// File generated from our OpenAPI spec by Stainless.

package com.openai.models.uploads

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCompleteParamsTest {

    @Test
    fun create() {
        UploadCompleteParams.builder()
            .uploadId("upload_abc123")
            .addPartId("string")
            .md5("md5")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UploadCompleteParams.builder().uploadId("upload_abc123").addPartId("string").build()

        assertThat(params._pathParam(0)).isEqualTo("upload_abc123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UploadCompleteParams.builder()
                .uploadId("upload_abc123")
                .addPartId("string")
                .md5("md5")
                .build()

        val body = params._body()

        assertThat(body.partIds()).containsExactly("string")
        assertThat(body.md5()).contains("md5")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UploadCompleteParams.builder().uploadId("upload_abc123").addPartId("string").build()

        val body = params._body()

        assertThat(body.partIds()).containsExactly("string")
    }
}

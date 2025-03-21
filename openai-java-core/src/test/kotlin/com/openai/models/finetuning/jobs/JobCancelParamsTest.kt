// File generated from our OpenAPI spec by Stainless.

package com.openai.models.finetuning.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JobCancelParamsTest {

    @Test
    fun create() {
        JobCancelParams.builder().fineTuningJobId("ft-AF1WoRqd3aJAHsqc9NY7iL8F").build()
    }

    @Test
    fun getPathParam() {
        val params =
            JobCancelParams.builder().fineTuningJobId("ft-AF1WoRqd3aJAHsqc9NY7iL8F").build()
        assertThat(params).isNotNull
        // path param "fineTuningJobId"
        assertThat(params.getPathParam(0)).isEqualTo("ft-AF1WoRqd3aJAHsqc9NY7iL8F")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}

// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openai.services.blocking

import com.openai.core.RequestOptions
import com.openai.models.FileDeleteParams
import com.openai.models.FileDeleted
import com.openai.models.FileListPage
import com.openai.models.FileListParams
import com.openai.models.FileObject
import com.openai.models.FileRetrieveParams

interface FileService {

    /** Returns information about a specific file. */
    @JvmOverloads
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FileObject

    /** Returns a list of files. */
    @JvmOverloads
    fun list(
        params: FileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FileListPage

    /** Delete a file. */
    @JvmOverloads
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FileDeleted
}

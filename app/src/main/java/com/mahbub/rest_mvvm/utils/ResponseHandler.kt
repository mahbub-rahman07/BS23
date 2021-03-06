package com.mahbub.rest_mvvm.utils

sealed class ResponseHandler<T>(val data:T? = null, val msg:String? = null) {
    class Success<T>(data: T? = null): ResponseHandler<T>(data = data)
    class Error<T>(msg: String): ResponseHandler<T>(msg = msg)
    class Loading<T>(): ResponseHandler<T>()
    class Empty<T>: ResponseHandler<T>()
}
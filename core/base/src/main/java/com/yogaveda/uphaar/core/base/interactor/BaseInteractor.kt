package com.yogaveda.uphaar.core.base.interactor

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

/*
abstract class BaseInteractor<out Type, in Params> : CoroutineScope where Type:  Any {

    private val job = Job()
    private val uiScope = Dispatchers.Main

    override val coroutineContext: CoroutineContext
        get() {
            return job + Dispatchers.IO
        }

    abstract suspend fun run(params: Params): Type

    operator fun invoke(params: Params, onResult: (Type) -> Unit = {}) =
        launch {
            val result = run(params)
            withContext(uiScope) {
                onResult(result)
            }
        }

    fun cancel() {
        coroutineContext.cancel()
    }
}*/

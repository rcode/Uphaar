package com.yogaveda.uphaar.navigation

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class Navigator() {
    private val _sharedFlow = MutableSharedFlow<NavigationTarget>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val sharedFlow = _sharedFlow.asSharedFlow()

    fun navigateTo(navTarget: NavigationTarget) {
        _sharedFlow.tryEmit(navTarget)
    }
}
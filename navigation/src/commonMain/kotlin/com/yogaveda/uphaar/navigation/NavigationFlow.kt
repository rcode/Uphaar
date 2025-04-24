package com.yogaveda.uphaar.navigation

import com.yogaveda.uphaar.core.ui.navigation.NavigationFlowApi
import com.yogaveda.uphaar.core.ui.navigation.NavigationTarget
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class NavigationFlow: NavigationFlowApi {
    private val _sharedFlow = MutableSharedFlow<NavigationTarget>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    val sharedFlow = _sharedFlow.asSharedFlow()

    override fun navigateTo(navTarget: NavigationTarget) {
        _sharedFlow.tryEmit(navTarget)
    }
}
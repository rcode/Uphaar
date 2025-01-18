package com.yogaveda.uphaar

import androidx.compose.ui.window.ComposeUIViewController
import com.yogaveda.uphaar.di.KoinInitializer

fun MainViewController() = ComposeUIViewController (
    configure = {
        KoinInitializer().init()
    }
) { App() }
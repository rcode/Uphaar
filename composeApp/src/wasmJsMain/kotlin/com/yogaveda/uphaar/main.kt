package com.yogaveda.uphaar

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.yogaveda.uphaar.di.KoinInitializer
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    KoinInitializer().init()
    ComposeViewport(document.body!!) {
        App()
    }
}
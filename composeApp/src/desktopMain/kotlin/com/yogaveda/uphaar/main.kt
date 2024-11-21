package com.yogaveda.uphaar

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Uphaar",
    ) {
        App()
    }
}
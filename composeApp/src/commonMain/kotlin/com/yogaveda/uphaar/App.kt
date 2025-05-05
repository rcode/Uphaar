package com.yogaveda.uphaar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.yogaveda.uphaar.navigation.NavigationComponent
import com.yogaveda.uphaar.navigation.NavigationFlow
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.koinInject

/**
 * This is the main app composable.
 * It includes the navigation component
 * The app level things are initialized here, like KOIN DI
 * and these might be different for different platforms
 * like Android, iOS, WASM/Js, JVM etc.
 */
@Composable
@Preview
fun App() {
    KoinContext {
        MaterialTheme {

            var showContent by remember { mutableStateOf(false) }
            //val viewModel = koinViewModel<LoginViewModel>()

            Surface(
                modifier = Modifier
                    .background(Color.LightGray)
            ) {
                val navController = rememberNavController()

                NavigationComponent(
                    navController = navController,
                    navigationFlow = koinInject<NavigationFlow>()
                )
            }

            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = { showContent = !showContent }) {
                    Text("Click me!")
                }
                AnimatedVisibility(showContent) {
                    val greeting = remember { Greeting().greet() }
                    Column(
                        Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        //Image(painterResource(Res.drawable.compose_multiplatform), null)
                        Text("Compose: $greeting")
                    }
                }
            }
        }
    }
}
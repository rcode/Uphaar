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
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.yogaveda.uphaar.core.ui.navigation.FeatureNavigationApi
import com.yogaveda.uphaar.feature.board.destinations.BoardDestination
import com.yogaveda.uphaar.feature.board.destinations.BoardFeatureImplementation
import com.yogaveda.uphaar.feature.login.destinations.LoginFeatureImpl
import com.yogaveda.uphaar.feature.login.viewmodel.LoginViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    KoinContext {
        MaterialTheme {

            var showContent by remember { mutableStateOf(false) }
            val viewModel = koinViewModel<LoginViewModel>()

            Surface(
                modifier = Modifier
                    .background(Color.LightGray)
            ) {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = LoginFeatureImpl().featureRoute()
                ) {
                    register(LoginFeatureImpl(), navController)
                    navigation<BoardDestination>(startDestination = BoardFeatureImplementation().featureRoute()) {

                    }
                }
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

fun NavGraphBuilder.register(
    featureNavigationApi: FeatureNavigationApi,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    featureNavigationApi.registerGraph(
        navGraphBuilder = this,
        navController = navController,
        modifier = modifier
    )
}
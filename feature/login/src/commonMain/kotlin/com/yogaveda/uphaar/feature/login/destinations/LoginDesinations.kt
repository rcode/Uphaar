package com.yogaveda.uphaar.feature.login.destinations

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogaveda.uphaar.core.ui.navigation.FeatureNavigationApi
import com.yogaveda.uphaar.feature.login.screens.GettingStartedScreen
import com.yogaveda.uphaar.feature.login.screens.LoginMain
import kotlinx.serialization.Serializable

@Serializable
object GettingStartedDestination

@Serializable
object LoginDestination

class LoginFeatureImpl: FeatureNavigationApi {

    override fun featureRoute() = LoginDestination

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.navigation<LoginDestination>(LoginDestination) {
            composable<LoginDestination>() {
                LoginMain(loginUsingGoogle)
            }
            composable<GettingStartedDestination>() {
                GettingStartedScreen()
            }
        }
    }
}
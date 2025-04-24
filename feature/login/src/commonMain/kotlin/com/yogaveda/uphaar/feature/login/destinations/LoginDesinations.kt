package com.yogaveda.uphaar.feature.login.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogaveda.uphaar.core.ui.navigation.NavigationTarget
import com.yogaveda.uphaar.feature.login.screens.GettingStartedScreen
import com.yogaveda.uphaar.feature.login.screens.LoginMain
import kotlinx.serialization.Serializable

@Serializable
object LoginFeatureDestination: NavigationTarget

@Serializable
object GettingStartedDestination: NavigationTarget

@Serializable
object LoginDestination: NavigationTarget


fun NavGraphBuilder.addLoginGraph(popBackStack: () -> Unit, navigationOnPhoneClick: () -> Unit) {

    navigation<LoginFeatureDestination>(startDestination = LoginDestination) {
        composable<LoginDestination>() {
            LoginMain(
                navigateOnPhoneClick = navigationOnPhoneClick
            )
        }
        composable<GettingStartedDestination>() {
            GettingStartedScreen()
        }
    }
}
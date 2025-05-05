package com.yogaveda.uphaar.feature.login.destinations

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogaveda.uphaar.core.ui.navigation.NavigationTarget
import com.yogaveda.uphaar.feature.login.screens.GettingStartedScreen
import com.yogaveda.uphaar.feature.login.screens.LoginMain
import com.yogaveda.uphaar.feature.login.viewmodel.LoginViewModel
import kotlinx.serialization.Serializable
import org.koin.compose.viewmodel.koinViewModel

@Serializable
object LoginFeatureDestination: NavigationTarget

@Serializable
object GettingStartedDestination: NavigationTarget

@Serializable
object LoginDestination: NavigationTarget


fun NavGraphBuilder.addLoginGraph(popBackStack: () -> Unit, navigationOnPhoneClick: () -> Unit) {

    navigation<LoginFeatureDestination>(startDestination = LoginDestination) {
        composable<LoginDestination>() { backStackEntry ->
            LoginMain(
                viewModel = koinViewModel<LoginViewModel>(viewModelStoreOwner = backStackEntry)
            )
        }
        composable<GettingStartedDestination>() { backStackEntry ->
            GettingStartedScreen()
        }
    }
}
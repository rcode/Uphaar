package com.yogaveda.uphaar.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import co.touchlab.kermit.Logger
import com.yogaveda.uphaar.core.ui.navigation.ModuleNavigationTarget
import com.yogaveda.uphaar.core.ui.navigation.ModuleNavigationTarget.BoardFeatureDestination
import com.yogaveda.uphaar.core.ui.navigation.NavigationFlowApi
import com.yogaveda.uphaar.feature.board.destinations.addBoardGraph
import com.yogaveda.uphaar.feature.login.destinations.LoginFeatureDestination
import com.yogaveda.uphaar.feature.login.destinations.addLoginGraph
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.compose.koinInject

@Composable
fun NavigationComponent(
    navController: NavHostController,
    navigationFlow: NavigationFlow,
) {
    /**
     * With LaunchedEffect we create a CoroutineScope that is started as soon as our composable component is created
     * and canceled as soon as the composition is removed.
     * As a result, whenever Navigator.navigateTo() is called, this snippet listens to it and performs the actual transition.
     */
    LaunchedEffect("com/yogaveda/uphaar/navigation") {
        navigationFlow.sharedFlow.onEach {
            if(it is ModuleNavigationTarget) {
                when(it) {
                    is ModuleNavigationTarget.BoardFeatureDestination -> {
                        navController.navigate(it) {
                            Logger.i { "Navigation to $it"}
                            popUpTo(it)
                        }
                    }
                }

            }
            navController.navigate(it) {
                Logger.i { "Navigation to $it"}
                popUpTo(it) // wichtig, damit der backstack aus unique nav entries besteht (auf Parameter achten)
            }
        }.launchIn(this)
    }

    val navigator = koinInject<NavigationFlowApi>()

    // Navigation Directions
    NavHost(
        navController = navController,
        startDestination = LoginFeatureDestination
    ) {
        addLoginGraph(
            popBackStack = { navController.popBackStack() },
            navigationOnPhoneClick = {
                navigator.navigateTo(BoardFeatureDestination)
            }
        )
        addBoardGraph(
            popBackStack = { navController.popBackStack() },
            navigationOnPhoneClick = {}
        )
    }
}
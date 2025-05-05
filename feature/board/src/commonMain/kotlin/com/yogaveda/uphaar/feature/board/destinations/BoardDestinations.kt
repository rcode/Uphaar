package com.yogaveda.uphaar.feature.board.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.yogaveda.uphaar.core.ui.navigation.ModuleNavigationTarget
import com.yogaveda.uphaar.core.ui.navigation.NavigationTarget
import com.yogaveda.uphaar.feature.board.screens.CreateBoard
import kotlinx.serialization.Serializable

@Serializable
object BoardDestination: NavigationTarget

@Serializable
object BoardListDestination: NavigationTarget

@Serializable
data class BoardDetailsDestination(val boardId: String): NavigationTarget

@Serializable
object CreateBoardDestinations: NavigationTarget

@Serializable
object BoardActionsDestination: NavigationTarget

@Serializable
data class BoardMembersDestination(val boardId: String): NavigationTarget

fun NavGraphBuilder.addBoardGraph(popBackStack: () -> Unit, navigationOnPhoneClick: () -> Unit) {   //

    navigation<ModuleNavigationTarget.BoardFeatureDestination>(startDestination = BoardListDestination) {
        composable<BoardListDestination>() {
            CreateBoard()
        }
    }
}
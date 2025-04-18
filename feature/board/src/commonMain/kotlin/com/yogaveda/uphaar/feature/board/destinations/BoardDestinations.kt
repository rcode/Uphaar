package com.yogaveda.uphaar.feature.board.destinations

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.yogaveda.uphaar.core.ui.navigation.FeatureNavigationApi
import kotlinx.serialization.Serializable

@Serializable
object BoardDestination

@Serializable
object BoardListDestination

@Serializable
data class BoardDetailsDestination(val boardId: String)

@Serializable
object CreateBoardDestinations

@Serializable
object BoardActionsDestination

@Serializable
data class BoardMembersDestination(val boardId: String)

class BoardFeatureImplementation: FeatureNavigationApi {

    override fun featureRoute() = BoardListDestination

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        TODO("Not yet implemented")
    }

}

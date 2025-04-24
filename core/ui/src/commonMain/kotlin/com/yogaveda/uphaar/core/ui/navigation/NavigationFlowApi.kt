package com.yogaveda.uphaar.core.ui.navigation

/*
interface FeatureNavigationApi {
    fun featureRoute(): Any
    fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier = Modifier
    )
}*/


interface NavigationFlowApi {
    fun navigateTo(navTarget: NavigationTarget)
}
package com.yogaveda.uphaar.core.ui.navigation

import kotlinx.serialization.Serializable


interface NavigationTarget

@Serializable
sealed class ModuleNavigationTarget: NavigationTarget {
    @Serializable
    object BoardFeatureDestination: ModuleNavigationTarget()
}
package com.example.smartstudy.presentation.destinations

import androidx.annotation.RestrictTo
import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDeepLink
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.example.smartstudy.presentation.Dashboard.DashboardScreenRoute
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.DestinationStyle
import com.ramcosta.composedestinations.spec.Direction
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec
import com.ramcosta.composedestinations.spec.Route

public object DashboardScreenRouteDestination : DirectionDestination {

    public operator fun invoke(): Direction = this

    @get:RestrictTo(RestrictTo.Scope.SUBCLASSES)
    override val baseRoute: String = "dashboard_screen_route"

    override val route: String = baseRoute

    @Composable
    override fun DestinationScope<Unit>.Content() {
        DashboardScreenRoute(
            navigator = destinationsNavigator
        )
    }

}
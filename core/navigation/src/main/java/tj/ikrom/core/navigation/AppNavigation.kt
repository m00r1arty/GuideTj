package tj.ikrom.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import tj.ikrom.core.common.Routes.MAIN
import tj.ikrom.feature.components.NavigationDrawer

@Composable
fun AppNavigation(
    navController: NavController,
) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = MAIN,
    ) {
        composable(MAIN) {
            NavigationDrawer(navController)
        }
    }
}
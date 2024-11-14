package tj.ikrom.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import tj.ikrom.core.common.Routes.CAMPING
import tj.ikrom.core.common.Routes.CITIES
import tj.ikrom.core.common.Routes.GUIDE
import tj.ikrom.core.common.Routes.HIKING
import tj.ikrom.core.common.Routes.SANATORIUMS
import tj.ikrom.feature.components.NavigationDrawer

@Composable
fun AppNavigation(
    navController: NavController,
) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = CITIES,
    ) {
        composable(CITIES) {
            NavigationDrawer(navController, currentScreen = CITIES)
        }
        composable(SANATORIUMS) {
            NavigationDrawer(navController, currentScreen = SANATORIUMS)
        }
        composable(CAMPING) {
            NavigationDrawer(navController, currentScreen = CAMPING)
        }
        composable(HIKING) {
            NavigationDrawer(navController, currentScreen = HIKING)
        }
        composable(GUIDE) {
            NavigationDrawer(navController, currentScreen = GUIDE)
        }
    }
}
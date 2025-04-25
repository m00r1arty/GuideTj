package tj.ikrom.core.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
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
    val snackBarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current

    NavHost(
        navController = navController as NavHostController,
        startDestination = CITIES,
    ) {
        composable(CITIES) {
            NavigationDrawer(navController, CITIES, context, snackBarHostState)
        }
        composable(SANATORIUMS) {
            NavigationDrawer(navController, SANATORIUMS, context, snackBarHostState)
        }
        composable(CAMPING) {
            NavigationDrawer(navController, CAMPING, context, snackBarHostState)
        }
        composable(HIKING) {
            NavigationDrawer(navController, HIKING, context, snackBarHostState)
        }
        composable(GUIDE) {
            NavigationDrawer(navController, GUIDE, context, snackBarHostState)
        }
    }
}
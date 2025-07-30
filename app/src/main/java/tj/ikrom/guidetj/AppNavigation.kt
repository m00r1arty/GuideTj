package tj.ikrom.guidetj

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.coroutines.CoroutineScope
import tj.ikrom.core.common.Routes.CAMPING
import tj.ikrom.core.common.Routes.CITIES
import tj.ikrom.core.common.Routes.GUIDE
import tj.ikrom.core.common.Routes.HIKING
import tj.ikrom.core.common.Routes.MAIN
import tj.ikrom.core.common.Routes.SANATORIUMS
import tj.ikrom.feature.main.ui.Camping
import tj.ikrom.feature.main.ui.Cities
import tj.ikrom.feature.main.ui.Guide
import tj.ikrom.feature.main.ui.Hiking
import tj.ikrom.feature.main.ui.Main
import tj.ikrom.feature.main.ui.Sanatoriums

@Composable
fun AppNavigation(
    navController: NavController,
) {
    val snackBarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current
    val scope: CoroutineScope = rememberCoroutineScope()


    NavHost(
        navController = navController as NavHostController,
        startDestination = MAIN,
    ) {
        composable(MAIN) {
            Main(navController, context, snackBarHostState, scope)
        }

        composable(CITIES) {
            Cities()
        }
        composable(SANATORIUMS) {
            Sanatoriums()
        }
        composable(CAMPING) {
            Camping()
        }
        composable(HIKING) {
            Hiking()
        }
        composable(GUIDE) {
            Guide()
        }
    }
}
package tj.ikrom.feature.components

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import tj.ikrom.core.common.Routes.CITIES
import tj.ikrom.core.common.Routes.MAIN

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Main(
    navController: NavController,
    context: Context,
    snackBarHostState: SnackbarHostState,
    scope: CoroutineScope,
) {
    var backPressedTime by remember { mutableLongStateOf(0L) }
    var expanded by remember { mutableStateOf(false) }

    BackHandler {
        val route = navController.currentBackStackEntry?.destination?.route

        if (route == MAIN) {
            val currentTime = System.currentTimeMillis()
            if (currentTime - backPressedTime < 1000) {
                expanded = false
                (context as? Activity)?.finish()
            } else {
                backPressedTime = currentTime
                scope.launch {
                    snackBarHostState.showSnackbar("Нажмите еще раз, чтобы выйти из приложения")
                }
            }
        } else {
            navController.popBackStack()
        }
    }

    Scaffold (
        snackbarHost = {
            SnackbarHost(hostState = snackBarHostState, Modifier.zIndex(1f))
        },
        topBar = {
            TopAppBar(
                title = { Text(text = "Главный экран") },
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { contentPadding ->
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
        ) {
            Text (
                modifier = Modifier.clickable {
                    navController.navigate(CITIES)
                },
                text = "Главный экран",
            )
        }
    }
}

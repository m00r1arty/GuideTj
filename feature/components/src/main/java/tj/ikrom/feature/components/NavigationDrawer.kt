package tj.ikrom.feature.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch
import tj.ikrom.core.common.Routes
import tj.ikrom.feature.components.theme.GuideTjTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawer(
    navController: NavController,
) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

//    val items = listOf(
//        NavigationItems(
//            title = "Города",
//            selectedIcon = Icons.Filled.Home,
//            unselectedIcon = Icons.Outlined.Home
//        ),
//        NavigationItems(
//            title = "Санатории",
//            selectedIcon = Icons.Filled.Info,
//            unselectedIcon = Icons.Outlined.Info
//        ),
//        NavigationItems(
//            title = "Турбазы",
//            selectedIcon = Icons.Filled.Edit,
//            unselectedIcon = Icons.Outlined.Edit,
//            badgeCount = 105
//        ),
//        NavigationItems(
//            title = "Турпоходы",
//            selectedIcon = Icons.Filled.Settings,
//            unselectedIcon = Icons.Outlined.Settings
//        )
//    )

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                ModalDrawerSheet {
                    Text("Drawer title", modifier = Modifier.padding(16.dp))
                    HorizontalDivider()
                    NavigationDrawerItem(
                        label = { Text(text = "Drawer Item") },
                        selected = false,
                        onClick = { navController.navigate(Routes.MAIN) }
                    )

                }
            }
        },
    ) {
        Scaffold (
            containerColor = GuideTjTheme.colors.background100,
            topBar = {
                TopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = GuideTjTheme.colors.background100,
                    ),
                    title = { Text("Guide Tj", style = GuideTjTheme.typography.title1) },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Open drawer")
                        }
                    }
                )
            },
            contentWindowInsets = WindowInsets(0.dp)
        ) { contentPadding ->
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(contentPadding)
                    .fillMaxSize()
            ) {
                Text(
                    text = "Guide Tj",
                )
            }
        }
    }
}
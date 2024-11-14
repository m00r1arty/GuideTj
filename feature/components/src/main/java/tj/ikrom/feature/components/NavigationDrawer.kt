package tj.ikrom.feature.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch
import tj.ikrom.core.common.Routes.CAMPING
import tj.ikrom.core.common.Routes.CITIES
import tj.ikrom.core.common.Routes.GUIDE
import tj.ikrom.core.common.Routes.HIKING
import tj.ikrom.core.common.Routes.SANATORIUMS

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawer(
    navController: NavController,
    currentScreen: String
) {
    val items = listOf(
        NavigationItems("Города", painterResource(R.drawable.ic_cities_clicked), painterResource(R.drawable.ic_cities_unclicked)),
        NavigationItems("Санатории", painterResource(R.drawable.ic_sanatoriums_clicked), painterResource(R.drawable.ic_sanatoriums_unclicked)),
        NavigationItems("Турбазы", painterResource(R.drawable.ic_camping_clicked), painterResource(R.drawable.ic_camping_unclicked)),
        NavigationItems("Турпоходы", painterResource(R.drawable.ic_hiking_trips_clicked), painterResource(R.drawable.ic_hiking_trips_unclicked), 105),
        NavigationItems("Справочник", painterResource(R.drawable.ic_guide_clicked), painterResource(R.drawable.ic_guide_unclicked), 105)
    )

    var selectedItemIndex by rememberSaveable { mutableIntStateOf(items.indexOfFirst { it.title == currentScreen }.takeIf { it >= 0 } ?: 0) }
    var selectedScreen by rememberSaveable { mutableStateOf(currentScreen) }

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Spacer(modifier = Modifier.height(16.dp))
                items.forEachIndexed { index, item ->
                    NavigationDrawerItem(
                        label = { Text(text = item.title) },
                        selected = index == selectedItemIndex,
                        onClick = {
                            if (selectedScreen != item.title) {
                                selectedScreen = item.title
                                selectedItemIndex = index
                                scope.launch { drawerState.close() }

                                val route = when (index) {
                                    0 -> CITIES
                                    1 -> SANATORIUMS
                                    2 -> CAMPING
                                    3 -> HIKING
                                    4 -> GUIDE
                                    else -> CITIES
                                }

                                navController.navigate(route) {
                                    popUpTo(navController.graph.startDestinationId) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        },
                        icon = {
                            Icon(
                                painter = if (index == selectedItemIndex) {
                                    item.selectedIcon
                                } else item.unselectedIcon,
                                contentDescription = item.title
                            )
                        },
                        badge = { item.badgeCount?.let { Text(text = it.toString()) } },
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        },
        gesturesEnabled = true
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = selectedScreen) },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        }) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                        }
                    }
                )
            }
        ) { contentPadding ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(contentPadding).fillMaxSize()
            ) {
                when (selectedScreen) {
                    "Города" -> Cities()
                    "Санатории" -> Sanatoriums()
                    "Турбазы" -> Camping()
                    "Турпоходы" -> Hiking()
                    "Справочник" -> Guide()
                    else -> Text("Guide Tj")
                }
            }
        }
    }
}

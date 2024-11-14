package tj.ikrom.feature.components

import androidx.compose.ui.graphics.painter.Painter

data class NavigationItems(
    val title: String,
    val selectedIcon: Painter,
    val unselectedIcon: Painter,
    val badgeCount: Int? = null
)
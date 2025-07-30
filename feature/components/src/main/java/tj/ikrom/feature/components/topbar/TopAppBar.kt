package tj.ikrom.feature.components.topbar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import tj.ikrom.feature.components.R
import tj.ikrom.feature.components.theme.GuideTjTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    title: String,
    popBack: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
) {
    androidx.compose.material3.TopAppBar(
        navigationIcon = {
            popBack?.let {
                IconButton(onClick = it) {
                    Icon(
                        painter = painterResource(R.drawable.ic_arrow_back),
                        contentDescription = "Back",
                        tint = Color.Unspecified
                    )
                }
            }
        },
        title = {
            Text(
                title,
                style = GuideTjTheme.typography.subtitle2,
                textAlign = TextAlign.Center,
            )
        },
        actions = actions,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = GuideTjTheme.colors.primary500,
        ),
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewTopAppBar() {
    GuideTjTheme {
        TopAppBar(
            "Назад",
            popBack = {},
            actions = {},
        )
    }

}

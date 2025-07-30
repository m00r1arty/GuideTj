package tj.ikrom.feature.components.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun GuideTjTheme(
    content: @Composable () -> Unit
) {
    val posTypography = GuideTjTypography.createPosDefaults()
    val alifColors = GuideTjColors.lightThemeColors()

    CompositionLocalProvider(
        LocalGuideTjTypography provides posTypography,
        LocalGuideTjColors provides alifColors,
    ) {
        MaterialTheme(content = content)
    }
}

object GuideTjTheme {
    val typography: GuideTjTypography
        @Composable
        get() = LocalGuideTjTypography.current

    val colors: GuideTjColors
        @Composable
        get() = LocalGuideTjColors.current
}
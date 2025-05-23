package tj.ikrom.feature.components.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider


@Composable
fun GuideTjTheme(
    content: @Composable () -> Unit
) {
    val guideTypography = GuideTypography.createGuideDefaults()
    val guideColors = GuideColors.lightThemeColors()

    CompositionLocalProvider(
        LocalGuideTypography provides guideTypography,
        LocalGuideColors provides guideColors,
    ) {
        MaterialTheme(content = content)
    }
}

object GuideTjTheme {
    val typography: GuideTypography
        @Composable
        get() = LocalGuideTypography.current

    val colors: GuideColors
        @Composable
        get() = LocalGuideColors.current
}
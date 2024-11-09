package tj.ikrom.feature.components.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Stable
fun Color(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Float = 1f
) = Color((red / 255f), (green / 255f), (blue / 255f), alpha)


val LocalGuideColors = staticCompositionLocalOf {
    GuideColors.unspecifiedColors()
}

@Immutable
data class GuideColors(
    val primary500: Color,
    val primary400: Color,
    val primary75: Color,
    val secondary500: Color,
    val secondary400: Color,
    val secondary300: Color,
    val secondary70: Color,
    val accent600: Color,
    val accent300: Color,
    val accent200: Color,
    val background200: Color,
    val background100: Color,
    val background: Color,
    val surface500: Color,
    val surface400: Color,
    val surface300: Color,
    val basic500: Color,
    val basic300: Color,
    val basic200: Color,
    val error: Color,
    val neutral600: Color,
    val neutral500: Color,
    val neutral400: Color,
    val neutral300: Color,
    val neutral200: Color,
    val neutral100: Color,
) {
    companion object {
        fun lightThemeColors(): GuideColors {
            return GuideColors(
                primary500 = Color(0, 175, 102, 1f),
                primary400 = Color(134, 225, 159, 0.16f),
                primary75 = Color(57, 185, 128, 1f),
                secondary500 = Color(13, 13, 55, 1f),
                secondary400 = Color(13, 13, 15, 1f),
                secondary300 = Color(142, 143, 151, 1f),
                secondary70 = Color(35, 35, 41, 1f),
                accent600 = Color(234, 60, 63, 1f),
                accent300 = Color(205, 237, 223, 1f),
                accent200 = Color(219, 237, 224, 1f),
                background200 = Color(255, 246, 229, 1f),
                background100 = Color(251, 255, 253, 1f),
                background = Color(255, 255, 255, 1f),
                surface500 = Color(247, 248, 249, 1f),
                surface400 = Color(247, 186, 67, 1f),
                surface300 = Color(208, 215, 222, 1f),
                basic500 = Color(34, 34, 34, 1f),
                basic300 = Color(115, 120, 125, 1f),
                basic200 = Color(155, 161, 167, 1f),
                error = Color(223, 38, 56, 1f),
                neutral600 = Color(122, 129, 137, 1f),
                neutral500 = Color(236, 240, 243, 1f),
                neutral400 = Color(119, 119, 137, 1f),
                neutral300 = Color(237, 240, 244, 1f),
                neutral200 = Color(244, 245, 247, 1f),
                neutral100 = Color(249, 238, 238, 1f)
            )
        }

        fun unspecifiedColors(): GuideColors {
            return GuideColors(
                primary500 = Color.Unspecified,
                primary400 = Color.Unspecified,
                primary75 = Color.Unspecified,
                secondary500 = Color.Unspecified,
                secondary400 = Color.Unspecified,
                secondary300 = Color.Unspecified,
                secondary70 = Color.Unspecified,
                accent600 = Color.Unspecified,
                accent300 = Color.Unspecified,
                accent200 = Color.Unspecified,
                background200 = Color.Unspecified,
                background100 = Color.Unspecified,
                background = Color.Unspecified,
                surface500 = Color.Unspecified,
                surface400 = Color.Unspecified,
                surface300 = Color.Unspecified,
                basic500 = Color.Unspecified,
                basic300 = Color.Unspecified,
                basic200 = Color.Unspecified,
                error = Color.Unspecified,
                neutral600 = Color.Unspecified,
                neutral500 = Color.Unspecified,
                neutral400 = Color.Unspecified,
                neutral300 = Color.Unspecified,
                neutral200 = Color.Unspecified,
                neutral100 = Color.Unspecified,
            )
        }
    }
}

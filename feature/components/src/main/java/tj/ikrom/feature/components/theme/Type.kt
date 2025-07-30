package tj.ikrom.feature.components.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import tj.ikrom.feature.components.R


val AlsHauss = FontFamily(
    Font(R.font.alshauss_bold, FontWeight.Bold),
    Font(R.font.alshauss_light, FontWeight.Light),
    Font(R.font.alshauss_medium, FontWeight.Medium),
    Font(R.font.alshauss_regular, FontWeight.Normal),
)


val LocalGuideTjTypography = staticCompositionLocalOf {
    GuideTjTypography()
}

data class GuideTjTypography(
    val display1: TextStyle = TextStyle.Default,
    val display2: TextStyle = TextStyle.Default,
    val display2Medium: TextStyle = TextStyle.Default,
    val display3: TextStyle = TextStyle.Default,
    val display4: TextStyle = TextStyle.Default,
    val title1: TextStyle = TextStyle.Default,
    val title2: TextStyle = TextStyle.Default,
    val title2Medium: TextStyle = TextStyle.Default,
    val subtitle2: TextStyle = TextStyle.Default,
    val body1: TextStyle = TextStyle.Default,
    val body2: TextStyle = TextStyle.Default,
    val body3: TextStyle = TextStyle.Default,
    val body3Medium: TextStyle = TextStyle.Default,
    val body4: TextStyle = TextStyle.Default,
    val caps: TextStyle = TextStyle.Default,
    val tiny1: TextStyle = TextStyle.Default,
    val tiny2: TextStyle = TextStyle.Default,
    val tiny3: TextStyle = TextStyle.Default
) {
    companion object {
        fun createPosDefaults(): GuideTjTypography {
            return GuideTjTypography(
                display1 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                ),
                display2 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Normal,
                    fontSize = 30.sp,
                    lineHeight = 30.sp
                ),
                display2Medium = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Medium,
                    fontSize = 32.sp,
                    letterSpacing = (-1).sp,
                ),
                display3 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Medium,
                    fontSize = 24.sp
                ),
                display4 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Normal,
                    fontSize = 24.sp,
                    lineHeight = 32.sp
                ),
                title1 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp
                ),
                title2 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp,
                    lineHeight = 18.sp
                ),
                title2Medium = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    lineHeight = 22.sp
                ),
                subtitle2 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                ),
                body1 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                ),
                body2 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                ),
                body3 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    lineHeight = 16.sp
                ),
                body3Medium = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    lineHeight = 26.sp
                ),
                body4 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp
                ),
                caps = TextStyle(
                    fontFamily = AlsHauss,
                    fontSize = 13.sp,
                    lineHeight = 15.sp,
                    letterSpacing = 1.sp,
                ),
                tiny1 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    lineHeight = 12.sp
                ),
                tiny2 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 12.sp,
                    letterSpacing = (0.5).sp,
                ),
                tiny3 = TextStyle(
                    fontFamily = AlsHauss,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.sp
                )
            )
        }
    }
}

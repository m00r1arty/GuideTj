package tj.ikrom.feature.components.theme

import android.annotation.SuppressLint
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp

@SuppressLint("ResourceType")
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = 1
)

val Georgia = FontFamily(
    Font(
        googleFont = GoogleFont("Georgia"),
        fontProvider = provider,
        weight = FontWeight.Bold
    ),
    Font(
        googleFont = GoogleFont("Georgia"),
        fontProvider = provider,
        weight = FontWeight.Light
    ),
    Font(
        googleFont = GoogleFont("Georgia"),
        fontProvider = provider,
        weight = FontWeight.Medium
    ),
    Font(
        googleFont = GoogleFont("Georgia"),
        fontProvider = provider,
        weight = FontWeight.Normal
    )
)


val LocalGuideTypography = staticCompositionLocalOf {
    GuideTypography()
}

data class GuideTypography(
    val display1: TextStyle = TextStyle.Default,
    val display2: TextStyle = TextStyle.Default,
    val display2Medium: TextStyle = TextStyle.Default,
    val display3: TextStyle = TextStyle.Default,
    val display4: TextStyle = TextStyle.Default,
    val title1: TextStyle = TextStyle.Default,
    val title2: TextStyle = TextStyle.Default,
    val title2Medium: TextStyle = TextStyle.Default,
    val subtitle1: TextStyle = TextStyle.Default,
    val subtitle2: TextStyle = TextStyle.Default,
    val subtitle3: TextStyle = TextStyle.Default,
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
        fun createGuideDefaults(): GuideTypography {
            return GuideTypography(
                display1 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                ),
                display2 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 30.sp,
                    lineHeight = 30.sp
                ),
                display2Medium = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 32.sp,
                    letterSpacing = (-1).sp,
                ),
                display3 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 24.sp
                ),
                display4 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 24.sp,
                    lineHeight = 32.sp
                ),
                title1 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp
                ),
                title2 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 18.sp,
                    lineHeight = 18.sp
                ),
                title2Medium = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    lineHeight = 22.sp
                ),
                subtitle1 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 17.sp,
                ),
                subtitle2 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                ),
                subtitle3 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                ),
                body1 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                ),
                body2 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                ),
                body3 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    lineHeight = 16.sp
                ),
                body3Medium = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    lineHeight = 17.92.sp
                ),
                body4 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp
                ),
                caps = TextStyle(
                    fontFamily = Georgia,
                    fontSize = 13.sp,
                    lineHeight = 15.sp,
                    letterSpacing = 1.sp,
                ),
                tiny1 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    lineHeight = 12.sp
                ),
                tiny2 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                ),
                tiny3 = TextStyle(
                    fontFamily = Georgia,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.sp
                )
            )
        }
    }
}
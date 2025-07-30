package tj.ikrom.feature.main.data

import androidx.annotation.DrawableRes

data class CarouselItem(
    val id: Int,
    @DrawableRes val imageResId: Int,
    val contentDescription: String,
)

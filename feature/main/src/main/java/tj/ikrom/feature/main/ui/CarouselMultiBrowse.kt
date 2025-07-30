package tj.ikrom.feature.main.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import tj.ikrom.feature.components.R
import tj.ikrom.feature.main.data.CarouselItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarouselMultiBrowse() {
    val carouselItems = listOf(
        CarouselItem(0, R.drawable.ic_cities_clicked, "Города"),
        CarouselItem(1, R.drawable.ic_sanatoriums_clicked, "Санатории"),
        CarouselItem(2, R.drawable.ic_camping_clicked, "Турбазы"),
        CarouselItem(3, R.drawable.ic_hiking_trips_clicked, "Турпоходы"),
        CarouselItem(4, R.drawable.ic_guide_clicked, "Справочник"),
    )

    HorizontalUncontainedCarousel(
        state = rememberCarouselState { carouselItems.count() },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        itemWidth = 160.dp,
        itemSpacing = 12.dp,
        contentPadding = PaddingValues(horizontal = 16.dp),
    ) { i ->
        val item = carouselItems[i]
        Image(
            modifier = Modifier
                .height(180.dp)
                .width(160.dp)
                .clip(MaterialTheme.shapes.extraLarge),
            painter = painterResource(id = item.imageResId),
            contentDescription = item.contentDescription,
            contentScale = ContentScale.Crop
        )
    }
}
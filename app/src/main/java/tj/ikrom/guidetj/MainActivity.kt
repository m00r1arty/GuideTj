package tj.ikrom.guidetj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import tj.ikrom.feature.components.theme.GuideTjTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            navController = rememberNavController()
            GuideTjTheme {
                AppNavigation(navController = navController)
            }
        }

    }
}

package jolchu.tolik.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import jolchu.tolik.navigationcompose.ui.theme.NavigationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationComposeTheme {
                Drawer()
            }
        }
    }
}

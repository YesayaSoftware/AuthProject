package tz.co.yesayasoftware.authproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import tz.co.yesayasoftware.authproject.ui.screens.LoginScreen
import tz.co.yesayasoftware.authproject.ui.theme.AuthProjectTheme
import tz.co.yesayasoftware.authproject.ui.theme.BackgroundColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AuthProjectTheme {
                Surface(
                    color = BackgroundColor,
                    modifier = Modifier.fillMaxSize()
                ) {
                    LoginScreen()
                }
            }
        }
    }
}
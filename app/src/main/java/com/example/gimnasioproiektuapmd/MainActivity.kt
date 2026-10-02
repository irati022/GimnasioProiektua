package com.example.gimnasioproiektuapmd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gimnasioproiektuapmd.ui.pantailak.LoginPantaila
import com.example.gimnasioproiektuapmd.ui.theme.GimnasioProiektuaPMDTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            GimnasioProiektuaPMDTheme {


                    AppNavigation()
                }
            }
        }
    }


@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "hasiera"
    ) {

        composable("login") {
            LoginPantaila(navController)
        }


    }
}

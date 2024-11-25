package com.yogaveda.uphaar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yogaveda.uphaar.feature.login.screens.LoginMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*setContent {
            App()
        }*/

        setContent {
            Surface (
                modifier = Modifier
                    .background(Color.LightGray)
            ) {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "login"
                ){
                    composable(route = "login") {
                        LoginMain()
                    }
                }
            }
        }
    }
}

/*
@Preview
@Composable
fun AppAndroidPreview() {
    App()
}*/

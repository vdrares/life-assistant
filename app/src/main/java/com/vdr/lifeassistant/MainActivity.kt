package com.vdr.lifeassistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.navigation.compose.rememberNavController
import com.vdr.lifeassistant.ui.bottomnav.BottomNavigation
import com.vdr.lifeassistant.ui.bottomnav.Navigation
import com.vdr.lifeassistant.ui.theme.LifeAssistantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LifeAssistantTheme {
                val navController = rememberNavController()
                Scaffold(bottomBar = { BottomNavigation(navController)}) {
                    Navigation(navController)
                }
            }
        }
    }
}
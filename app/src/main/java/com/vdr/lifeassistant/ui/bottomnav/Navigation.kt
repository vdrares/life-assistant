package com.vdr.lifeassistant.ui.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.vdr.lifeassistant.ui.screens.HomeScreen
import com.vdr.lifeassistant.ui.screens.TaskManagerScreen

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = NavigationItem.Home.route ) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.TaskManager.route) {
            TaskManagerScreen()
        }
    }
}
package com.vdr.lifeassistant.ui.bottomnav


import com.vdr.lifeassistant.R
import com.vdr.lifeassistant.ui.bottomnav.NavigationItem.NavigationRoutes.HOME

sealed class NavigationItem(var title: Int, var icon: Int, var route: String) {

    object Home: NavigationItem(R.string.home, R.drawable.ic_home, HOME)
    object TaskManager: NavigationItem(R.string.task_manager, R.drawable.ic_task_manager, HOME)

    object NavigationRoutes {
        const val HOME = "home"
    }
}
package com.vdr.lifeassistant.ui.bottomnav


import com.vdr.lifeassistant.R
import com.vdr.lifeassistant.ui.bottomnav.NavigationItem.NavigationRoutes.HOME
import com.vdr.lifeassistant.ui.bottomnav.NavigationItem.NavigationRoutes.TASK_MANAGER

sealed class NavigationItem(var title: Int, var icon: Int, var route: String) {

    object Home: NavigationItem(R.string.home, R.drawable.ic_home, HOME)
    object TaskManager: NavigationItem(R.string.task_manager, R.drawable.ic_task_manager, TASK_MANAGER)

    object NavigationRoutes {
        const val HOME = "home"
        const val TASK_MANAGER = "taskManager"
    }
}
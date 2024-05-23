package com.applicationtls.tools.ui.reminder.domain

data class ReminderModel(
    val id :Int = 0,
    val content: String = "",
    val time: String = "",
    val isDone: Boolean = false
){

}

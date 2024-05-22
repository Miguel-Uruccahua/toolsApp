package com.applicationtls.tools.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
object QrScan

@Serializable
object Tools

@Serializable
data class Menu(
    val name:String?
)
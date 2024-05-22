package com.applicationtls.tools.ui.qrscan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.applicationtls.tools.ui.navigation.Tools

@Composable
fun QrScanScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        Button(onClick = { navController.navigate(Tools) }) {
            Text(text = "Navegar")
        }
    }
}
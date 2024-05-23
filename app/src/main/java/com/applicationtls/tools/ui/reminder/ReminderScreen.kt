/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.applicationtls.tools.ui.reminder

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.applicationtls.tools.ui.reminder.domain.ReminderModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ReminderScreen(
    navController: NavHostController, viewModel: ReminderViewModel = hiltViewModel()
) {
    val scrollState = rememberLazyListState()
    val content by viewModel.data.observeAsState(initial = "")

    Column(
        modifier = Modifier.fillMaxSize(), Arrangement.Center, Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = content,
            onValueChange = { viewModel.onDataChange(it) },
            modifier = Modifier.padding(start = 32.dp, end = 32.dp),
            label = { Text(text = "Contenido") },
        )
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = { viewModel.addReminder() }) {
            Text(text = "Guardar")
        }
    }
}


@Composable
fun AccessList(itemsAccess: List<ReminderModel>, onLoadMore: () -> Unit) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Enviado",
            modifier = Modifier.padding(start = 4.dp, end = 4.dp),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            text = "Descripción",
            modifier = Modifier.padding(start = 4.dp, end = 4.dp),
            fontWeight = FontWeight.Bold
        )
    }
    val scrollState = rememberLazyListState()
    LazyColumn(
        state = scrollState,
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        items(itemsAccess, key = { it.id }) { access ->
            AccessItem(access)
            if (access.id == itemsAccess[itemsAccess.size - 1].id) {
                onLoadMore()
            }
        }
    }
}

@Composable
fun AccessItem(item: ReminderModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(shape = MaterialTheme.shapes.small)
            .background(Color(0xFFEEEDED))
            .border(
                width = 2.dp, color = Color(0xFF163C5D)
            )
            .padding(horizontal = 8.dp, vertical = 8.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Check, contentDescription = null)
            Spacer(modifier = Modifier.width(20.dp))
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Text(text = item.content)
                Text(text = item.time)
            }
        }
    }
}


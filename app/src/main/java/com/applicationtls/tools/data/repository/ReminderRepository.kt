package com.applicationtls.tools.data.repository

import com.applicationtls.tools.data.local.database.reminder.ReminderDao
import com.applicationtls.tools.data.local.database.reminder.asDomain
import com.applicationtls.tools.data.local.database.reminder.asEntity
import com.applicationtls.tools.ui.reminder.domain.ReminderModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

interface ReminderRepository {
    val reminderList: Flow<List<ReminderModel>>
    suspend fun add(reminder:ReminderModel)
}

class ReminderRepositoryImpl @Inject constructor(
    private val reminderDao: ReminderDao,
) : ReminderRepository {

    override val reminderList: Flow<List<ReminderModel>> =
        reminderDao.getReminder().map { item -> item.map { it.asDomain()}
        }

    override suspend fun add(reminder: ReminderModel) {
        reminderDao.insertRemind(reminder.asEntity())
    }
}
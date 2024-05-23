package com.applicationtls.tools.data.local.database.reminder

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminderentity ORDER BY id DESC LIMIT 10")
    fun getReminder(): Flow<List<ReminderEntity>>

    @Insert
    suspend fun insertRemind(item: ReminderEntity)

}
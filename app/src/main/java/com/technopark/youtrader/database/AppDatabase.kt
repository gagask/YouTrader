package com.technopark.youtrader.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.technopark.youtrader.model.CryptoCurrencyExample
import com.technopark.youtrader.model.ProfileDataExample

@Database(
    entities = [CryptoCurrencyExample::class, ProfileDataExample::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cryptoCurrencyDao(): CryptoCurrencyDao
    abstract fun profileDao(): ProfileDao
}

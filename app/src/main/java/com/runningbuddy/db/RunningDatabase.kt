package com.runningbuddy.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bumptech.glide.load.model.ByteArrayLoader.Converter


@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(Converter::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO
}
package com.example.nikhil.roomdb;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * We annotate this class with @Database which takes two arguments.
 * 1. An Array of Entity classes.
 * 2. Database version which is just an integer
 * This class is use to create database and get an instance of it.
 */
@Database(entities = {DataModel.class},version = 1)
public abstract class AppDatabase extends RoomDatabase{

    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context){
        if(INSTANCE == null)
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"items_db").build();
        return INSTANCE;
    }

    public abstract DataModelDao itemModel();
}

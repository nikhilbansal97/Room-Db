package com.example.nikhil.roomdb;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * This interface is a Data Access Object. It is used to define the queries that are used to access the object.
 * We use @Dao to tell Room that this is DAO Class.
 * We define our queries as strings and pass them as a parameter to @Query.
 * Each @Query annotation is paired with a method. When the paired method is called, the query gets executed.
 */
@Dao
public interface DataModelDao {

    @Query("Select * from DataModel")
    List<DataModel> getAllItems();

    @Query("select * from DataModel where id = :id")
    DataModel getItemById(String id);

    @Insert(onConflict = REPLACE)
    void addData(DataModel dataModel);

    @Delete
    void deleteData(DataModel dataModel);

    @Update
    void updateData(DataModel datamodel);
}

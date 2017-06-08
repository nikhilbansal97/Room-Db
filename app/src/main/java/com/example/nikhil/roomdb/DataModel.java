package com.example.nikhil.roomdb;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @Entity annotation is used to to tell Room to use current class as the database table.
 */
@Entity
public class DataModel {

    /**
     * Any attribute preceded by @PrimaryKey Annotation will serve as primary key for Database table.
     * Here we use ( autoGenerate = true ) so that a key is automatically generated whenever an entity is made.
     */
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String itemName;
    public String personName;

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

}

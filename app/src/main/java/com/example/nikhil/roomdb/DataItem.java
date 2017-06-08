package com.example.nikhil.roomdb;

/**
 * Created by nikhil on 7/6/17.
 */

public class DataItem {

    private String itemName;
    private String personName;

    public DataItem(String itemName, String personName) {
        this.itemName = itemName;
        this.personName = personName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}

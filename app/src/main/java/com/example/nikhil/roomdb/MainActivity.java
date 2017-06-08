package com.example.nikhil.roomdb;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppDatabase appDatabase;
    private ListView listView;
    private DataAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);
        appDatabase = AppDatabase.getDatabase(this);

        mAdapter = new DataAdapter(this,new ArrayList<DataModel>());
        listView.setAdapter(mAdapter);

        new DatabaseAsync().execute();

    }

    private class DatabaseAsync extends AsyncTask<Void,Void,List<DataModel>>{

        @Override
        protected List<DataModel> doInBackground(Void... params) {

            //Dummy Data for database
            DataModel model = new DataModel();
            model.setItemName("Item 1");
            model.setPersonName("Person 1");

            appDatabase.itemModel().addData(model);
            model.setId(1);
            model.setPersonName("Person 2");
            appDatabase.itemModel().updateData(model);

            appDatabase.itemModel().addData(model);

            return appDatabase.itemModel().getAllItems();
        }

        @Override
        protected void onPostExecute(List<DataModel> dataItems) {
            super.onPostExecute(dataItems);
            mAdapter.addAll(dataItems);
        }
    }
}

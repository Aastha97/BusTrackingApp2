package com.example.raghav.bustrackingapp2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class DataList extends AppCompatActivity {
    ListView listView;
    SQLiteDatabase sqLiteDatabase;
    DatabaseHelperAdmin databaseHelperAdmin;
    Cursor cursor;
    ListDataAdapter listDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list);
        listView = (ListView)findViewById(R.id.list_view);
        listDataAdapter = new ListDataAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(listDataAdapter);
        databaseHelperAdmin = new DatabaseHelperAdmin(getApplicationContext());
        sqLiteDatabase = databaseHelperAdmin.getReadableDatabase();
        cursor = databaseHelperAdmin.getInformations(sqLiteDatabase);
        if(cursor.moveToFirst())
        {
            do{

                String bus,driver,route,dl;
                bus = cursor.getString(0);
                driver = cursor.getString(1);
                route = cursor.getString(2);
                dl = cursor.getString(3);
                DataProvider dataProvider = new DataProvider(bus,driver,route,dl);
                listDataAdapter.add(dataProvider);


            }while (cursor.moveToNext());
        }

    }
}

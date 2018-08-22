package com.example.raghav.bustrackingapp2;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddDetails extends AppCompatActivity {
    Context context = this;
    DatabaseHelperAdmin databaseHelperAdmin;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);
    }

    public void AddInfo(View w) {
        if (w.getId() == R.id.btnAddInfo) {

            EditText BusNo = (EditText)findViewById(R.id.tfAddBus);
            EditText DriverName = (EditText)findViewById(R.id.tfAddDriver);
            EditText RouteNo = (EditText)findViewById(R.id.tfAddRoute);
            EditText DlNo = (EditText)findViewById(R.id.tfAddDL);

            String bus = BusNo.getText().toString();
            String driver = DriverName.getText().toString();
            String route = RouteNo.getText().toString();
            String dl = DlNo.getText().toString();

            databaseHelperAdmin = new DatabaseHelperAdmin(context);
            sqLiteDatabase = databaseHelperAdmin.getWritableDatabase();
            databaseHelperAdmin.addInformations(bus,driver,route,dl,sqLiteDatabase);
            Toast.makeText(getBaseContext(),"Data Saved",Toast.LENGTH_LONG).show();
            databaseHelperAdmin.close();
        }
    }
}

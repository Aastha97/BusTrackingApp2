package com.example.raghav.bustrackingapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
    }

    public void Add(View w) {
        if (w.getId() == R.id.btnAdd) {

            Intent i = new Intent(AdminPage.this, AddDetails.class);

            startActivity(i);
        }
    }



    public void Viewlist(View w) {
        if (w.getId() == R.id.btnView) {

            Intent i = new Intent(AdminPage.this, DataList.class);

            startActivity(i);
        }
    }


}

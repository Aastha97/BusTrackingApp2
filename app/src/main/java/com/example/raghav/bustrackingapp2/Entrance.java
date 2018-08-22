package com.example.raghav.bustrackingapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Entrance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance);
    }

    public void onEntranceClick(View w) {
        if (w.getId() == R.id.btnOption) {

            Intent i = new Intent(Entrance.this, Option.class);

            startActivity(i);
        }
    }
}

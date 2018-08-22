package com.example.raghav.bustrackingapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }

    public void onInformationClick(View w) {
        if (w.getId() == R.id.btnInfo) {

            Intent i = new Intent(Option.this, Information.class);

            startActivity(i);
        }
    }

    public void onLocationClick(View w) {
        if (w.getId() == R.id.btnLocation) {

            Intent i = new Intent(Option.this, Location.class);

            startActivity(i);
        }
    }

    public void onseatBookingClick(View w) {
        if (w.getId() == R.id.btnSeatBooking) {

            Intent i = new Intent(Option.this, SeatBooking.class);

            startActivity(i);
        }
    }
}

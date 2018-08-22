package com.example.raghav.bustrackingapp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    public static final String MY_TAG = "the_custom_message";

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Log.i(MY_TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG,"onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG,"onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG,"onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG,"onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MY_TAG,"onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG,"onDestroy");
    }

    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.btnEntrance) {
            EditText a = (EditText) findViewById(R.id.tfUsername);
            String str = a.getText().toString();
            EditText b = (EditText) findViewById(R.id.tfPassword);
            String pass1 = b.getText().toString();

            String password = helper.searchPass(str);
            if(pass1.equals(password))
            {
                Intent i = new Intent(HomePage.this, Entrance.class);
                startActivity(i);
            }

            else
            {
                if(pass1.equals("2797") && str.equals("bus"))
                {
                    Intent i = new Intent(HomePage.this, AdminPage.class);
                    startActivity(i);
                }

                else
                {
                    //popup msg
                    Toast temp = Toast.makeText(HomePage.this, "Username or Password incorrect !", Toast.LENGTH_SHORT);
                    temp.show();
                }
            }


        }

    }
    public void nextClick(View w)
    {
        if(w.getId() == R.id.btnRegister)
        {

            Intent n = new Intent(HomePage.this, Register.class);

            startActivity(n);
        }
    }

}

package com.example.raghav.bustrackingapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Login(View w)
    {
        if(w.getId() == R.id.btnLogin)
        {
            EditText name = (EditText)findViewById(R.id.tfName);
            EditText email = (EditText)findViewById(R.id.tfEmail);
            EditText uname = (EditText)findViewById(R.id.tfUname);
            EditText pass = (EditText)findViewById(R.id.tfpass);
            EditText conpass = (EditText)findViewById(R.id.tfConpass);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String passstr = pass.getText().toString();
            String conpassstr = conpass.getText().toString();


            if (!passstr.equals(conpassstr))
            {
                //popup msg
                Toast pass1 = Toast.makeText(Register.this , "Passwords don't match!" , Toast.LENGTH_SHORT);
                pass1.show();
            }



            else
            {
                //insert in database
                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(passstr);

                helper.insertContact(c);

                Intent n = new Intent(Register.this, HomePage.class);

                startActivity(n);

            }
        }
    }
}

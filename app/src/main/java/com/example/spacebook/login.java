package com.example.spacebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        TextView username= findViewById(R.id.username);
        TextView password=findViewById(R.id.password);

        MaterialButton loginbtn= (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String USERNAME=username.getText().toString();
                String PASSWORD=password.getText().toString();
                if(USERNAME.equals("admin")&&PASSWORD.equals("admin"))
                {
                    //correct password
                    Toast.makeText(login.this,"Login Sucessfull",Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(login.this, userpage.class);
                            i.putExtra("keyname",USERNAME);
                            startActivity(i);
                        }
                else
                    {
                     Toast.makeText(login.this,"Login Failed",Toast.LENGTH_SHORT).show();
                    }
                }
        });
    }
}
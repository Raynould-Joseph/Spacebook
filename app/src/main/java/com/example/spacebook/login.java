package com.example.spacebook;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] courses = { "C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        Spinner spino= findViewById(R.id.planet_spinner);
        spino.setOnItemSelectedListener(this);

        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                courses);


        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);


        spino.setAdapter(ad);

        TextView username= findViewById(R.id.username);
        TextView password=findViewById(R.id.password);

        MaterialButton loginbtn= (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String USERNAME=username.getText().toString();
                if(USERNAME.isEmpty())
                {
                    alert("Please insert the username");
                }
                else
                {
                    String PASSWORD=password.getText().toString();
                    if(PASSWORD.isEmpty())
                    {
                        {
                            alert("Please insert the password");
                        }

                    }
                    else{
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


                }
            }
        });
    }
    private void alert(String message)
    {
        AlertDialog dia1=new AlertDialog.Builder(login.this)
                .setTitle("Invaild Creditentails")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();

                    }
                })
                .create();
        dia1.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(getApplicationContext(),
                        courses[i],
                        Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
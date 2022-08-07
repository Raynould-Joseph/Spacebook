package com.example.spacebook;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class userpage extends AppCompatActivity {
    private TextView UserName;
    private Button logoutbtn;
    TextView txt,name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
        name=findViewById(R.id.userName);
        String user= getIntent().getStringExtra("keyname");
        name.setText("hello \t"+ user);


    }
}





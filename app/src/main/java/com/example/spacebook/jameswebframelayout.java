package com.example.spacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class jameswebframelayout extends AppCompatActivity {
    ImageView img1 , img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jameswebframelayout);
        img1=findViewById(R.id.frame1);
        img2=findViewById(R.id.frame2);
        mylistener();
    }
    public void mylistener()
    {
        img1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                img1.setVisibility(View.GONE);
                img2.setVisibility(View.VISIBLE);

            }
        });
        img2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                img1.setVisibility(View. VISIBLE);
                img2.setVisibility(View.GONE);

            }
        });

    }
}
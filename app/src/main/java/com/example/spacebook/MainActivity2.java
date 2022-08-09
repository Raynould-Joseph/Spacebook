package com.example.spacebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button scrollviewButton=findViewById(R.id.btn_2);
        Button nestedScrollviewButton=findViewById(R.id.btn_3);
        Button jameswebb_framelayout=findViewById(R.id.btn_4);
        Button implict_intent=findViewById(R.id.btn_5);
        Button toggle_button=findViewById(R.id.btn_6);



        scrollviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, scrollview.class);
                startActivity(i);
            }
        });
        toggle_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, toogleButton.class);
                startActivity(i);
            }
        });
        nestedScrollviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, nestedscrollview.class);
                startActivity(i);
            }
        });
        jameswebb_framelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, jameswebframelayout.class);
                startActivity(i);
            }
        });
        implict_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(i.EXTRA_EMAIL,"raynould2000gmail.com");
                i.putExtra(i.EXTRA_SUBJECT,"Exoplanet");
                i.putExtra(i.EXTRA_TEXT, "the email will come in 1 minute");
                if(i.resolveActivity(getPackageManager())!=null){
                    startActivity(i);
                }
            }
        });


    }
}
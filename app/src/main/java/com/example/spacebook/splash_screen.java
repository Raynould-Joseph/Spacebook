package com.example.spacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);Thread thread= new Thread()
        {
            public  void run()
            {
                try
                {
                    sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(splash_screen.this,MainActivity.class);
                    startActivity(i);

                }
            }
        };thread.start();
    }
}

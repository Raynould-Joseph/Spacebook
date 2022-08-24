package com.example.spacebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class nestedscrollview extends AppCompatActivity {
    private ActionMode mActionMode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nestedscrollview);
        Button Nasa=findViewById(R.id.nasa);


        Nasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nasa.gov/"));
                if(i.resolveActivity(getPackageManager())!=null){
                    startActivity(i);
                }
            }
        });

    }
}
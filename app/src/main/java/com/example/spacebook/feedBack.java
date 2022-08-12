package com.example.spacebook;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class feedBack extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        radioGroup = (RadioGroup) findViewById(R.id.radio_button);
        Button submit_button = findViewById(R.id.submit_button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);


            }
        });
    }
        public void checkButton(View v)
        {
            int radioId=radioGroup.getCheckedRadioButtonId();
            radioButton=findViewById(radioId);
            Toast.makeText(this, "selected radio button"+radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }

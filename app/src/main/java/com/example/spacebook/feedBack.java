package com.example.spacebook;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class feedBack extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    RatingBar rt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        addListenerOnButtonClick();
        //finding the specific RatingBar with its unique ID
        LayerDrawable stars = (LayerDrawable) rt.getProgressDrawable();
        //Use for changing the color of RatingBar
        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);

        radioGroup = (RadioGroup) findViewById(R.id.radio_button);
        Button submit_button = findViewById(R.id.submit_button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);


            }
        });
    }

    public void addListenerOnButtonClick() {
        rt = (RatingBar) findViewById(R.id.ratingBar);
        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rating = String.valueOf(rt.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });

    }


    public void Call(View v) {
        // This function is called when button is clicked.
        // Display ratings, which is required to be converted into string first.
        String rating = String.valueOf(rt.getRating());
        Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
    }
}

//        public void checkButton(View v)
//        {
//            int radioId=radioGroup.getCheckedRadioButtonId();
//            radioButton=findViewById(radioId);
//            Toast.makeText(this, "selected radio button"+radioButton.getText(), Toast.LENGTH_SHORT).show();
//        }
//    }

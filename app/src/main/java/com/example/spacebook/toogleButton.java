package com.example.spacebook;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class toogleButton extends AppCompatActivity {
    ToggleButton togglebutton;
    TextView textview;
    SwitchCompat switchCompat;
    ImageView switch_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toogle_button2);
        switchCompat=findViewById(R.id.switchButton);
        switch_image=findViewById(R.id.switch_image);
        togglebutton = (ToggleButton) findViewById(R.id.toggleButton);
        textview= (TextView) findViewById(R.id.text_mes);

        switch_image.setImageDrawable(getResources().getDrawable(R.drawable.light_off));

        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switchCompat.isChecked())
                {
                    switch_image.setImageDrawable(getResources().getDrawable(R.drawable.light_on));
                }
                else
                {
                    switch_image.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                }
            }
        });
    }

    public void onToggleClick(View view)
    {
        if (togglebutton.isChecked()) {
            textview.setText("Toggle is ON");
        }
        else {
            textview.setText("Toggle is OFF");
        }
    }
}
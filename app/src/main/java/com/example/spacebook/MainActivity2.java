package com.example.spacebook;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Link those objects with their respective id's
        // that we have given in .XML file
        textView = (TextView) findViewById(R.id.textView);
        relativeLayout = (RelativeLayout) findViewById(R.id.relLayout);

        // here you have to register a view for context menu
        // you can register any view like listview, image view,
        // textview, button etc
        registerForContextMenu(textView);


        Button scrollviewButton=findViewById(R.id.btn_2);
        Button nestedScrollviewButton=findViewById(R.id.btn_3);
        Button jameswebb_framelayout=findViewById(R.id.btn_4);
        Button implict_intent=findViewById(R.id.btn_5);
        Button toggle_button=findViewById(R.id.btn_6);
        Button web_view= findViewById(R.id.btn_7);
        Button knowledge_base=findViewById(R.id.btn_8);



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
        web_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, web_view.class);
                startActivity(i);
            }
        });

        knowledge_base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, knowledge_base.class);
                startActivity(i);
            }
        });


    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        // you can set menu header with title icon etc
        menu.setHeaderTitle("Choose a color");
        // add menu items
        menu.add(0, v.getId(), 0, "Yellow");
        menu.add(0, v.getId(), 0, "Gray");
        menu.add(0, v.getId(), 0, "Cyan");
    }

    // menu item select listener
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getTitle() == "Yellow") {
            relativeLayout.setBackgroundColor(Color.YELLOW);
        } else if (item.getTitle() == "Gray") {
            relativeLayout.setBackgroundColor(Color.GRAY);
        } else if (item.getTitle() == "Cyan") {
            relativeLayout.setBackgroundColor(Color.CYAN);
        }

        return true;
    }
}

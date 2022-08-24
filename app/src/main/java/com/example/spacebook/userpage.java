package com.example.spacebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class userpage extends AppCompatActivity {
    private TextView UserName;
    private Button logoutbtn;
    TextView txt,name;
    ImageView img_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
        name=findViewById(R.id.userName);
        img_view=findViewById(R.id.register_button);

        img_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(userpage.this, space_travel.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.home_menu,menu);
        return super.onCreateOptionsMenu(menu );
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.notify:
                Toast.makeText(getApplicationContext(), "No notifications", Toast.LENGTH_LONG).show();
                break;
            case R.id.add:
                startActivity(new Intent(userpage.this,add_content.class));
                break;
            case R.id.exit:
                finish();
                break;
            case R.id.share:
                startActivity(new Intent(userpage.this,share_activity.class));
                break;


            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}





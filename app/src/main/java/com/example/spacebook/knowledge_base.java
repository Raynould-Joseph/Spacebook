
package com.example.spacebook;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class knowledge_base extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_base);
        Button btn_news=findViewById(R.id.newsbtn);
        Button btn_discovery=findViewById(R.id.disbtn);
        Button btn_facts=findViewById(R.id.Factbtn);
        Button btn_iss=findViewById(R.id.ISS);

        btn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,news_fragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();


            }
        });

        btn_discovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,discovery_fragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();


            }
        });
        btn_facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,facts_fragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });
        btn_iss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,ISS_fragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });
    }
}
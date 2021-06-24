package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Basquete3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basquete3);

        ImageButton voltaButtonBasq3 = (ImageButton) findViewById(R.id.voltaButtonBasq3);

        voltaButtonBasq3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Basquete3.this, basquete2.class);
                startActivity(it);
            }
        });

        ImageButton homeButtonBasq = (ImageButton) findViewById(R.id.homeButtonBasq);

        homeButtonBasq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Basquete3.this, HomePage.class);
                startActivity(it);
            }
        });
    }
}
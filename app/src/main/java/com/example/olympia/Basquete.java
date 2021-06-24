package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Basquete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basquete);

        ImageButton voltaButtonBasq = (ImageButton) findViewById(R.id.voltaButtonBasq);

        voltaButtonBasq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Basquete.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageButton setaDoisBasq = (ImageButton) findViewById(R.id.setaDoisBasq);

        setaDoisBasq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Basquete.this, basquete2.class);
                startActivity(it);
            }
        });
    }
}
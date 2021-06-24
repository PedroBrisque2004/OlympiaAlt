package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class basquete2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basquete2);

        ImageButton voltaButtonBasq2 = (ImageButton) findViewById(R.id.voltaButtonBasq2);

        voltaButtonBasq2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(basquete2.this, Basquete.class);
                startActivity(it);
            }
        });

        ImageButton setaDoisBasq2 = (ImageButton) findViewById(R.id.setaDoisBasq2);

        setaDoisBasq2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(basquete2.this, Basquete3.class);
                startActivity(it);
            }
        });
    }
}
package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageButton futButton = (ImageButton) findViewById(R.id.futButton);

        futButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(HomePage.this, Futebol.class);
                startActivity(it);
            }
        });

        ImageButton futfemButton = (ImageButton) findViewById(R.id.futfemButton);

        futfemButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(HomePage.this, FutebolFem.class);
                startActivity(it);
            }
        });

        ImageButton footButton = (ImageButton) findViewById(R.id.footButton);

        footButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(HomePage.this, Football.class);
                startActivity(it);
            }
        });

        ImageButton bskButton = (ImageButton) findViewById(R.id.bskButton);

        bskButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(HomePage.this, Basquete.class);
                startActivity(it);
            }
        });

        ImageButton baseButton = (ImageButton) findViewById(R.id.baseButton);

        baseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(HomePage.this, Beisebol.class);
                startActivity(it);
            }
        });

        ImageButton volleyButton  = (ImageButton) findViewById(R.id.volleyButton);

        volleyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(HomePage.this, Volei.class);
                startActivity(it);
            }
        });

    }
}
package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Beisebol3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beisebol3);

        ImageButton voltaButtonBase3 = (ImageButton) findViewById(R.id.voltaButtonBase3);

        voltaButtonBase3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Beisebol3.this, Beisebol2.class);
                startActivity(it);
            }
        });

        ImageButton homeButtonBase = (ImageButton) findViewById(R.id.homeButtonBase);

        homeButtonBase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Beisebol3.this, HomePage.class);
                startActivity(it);
            }
        });
    }
}
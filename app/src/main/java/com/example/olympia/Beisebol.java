package com.example.olympia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Beisebol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beisebol);

        ImageButton voltaButtonBase = (ImageButton) findViewById(R.id.voltaButtonBase);

        voltaButtonBase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Beisebol.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageButton setaDoisBase = (ImageButton) findViewById(R.id.setaDoisBase);

        setaDoisBase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Beisebol.this, Beisebol2.class);
                startActivity(it);
            }
        });
    }
}
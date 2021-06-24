package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Football extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        ImageButton voltaButtonFoot = (ImageButton) findViewById(R.id.voltaButtonFoot);

        voltaButtonFoot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Football.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageButton setaDoisFoot = (ImageButton) findViewById(R.id.setaDoisFoot);

        setaDoisFoot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Football.this, Football2.class);
                startActivity(it);
            }
        });

        ImageButton tbbucButton = (ImageButton) findViewById(R.id.tbbucButton );

        tbbucButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Football.this, Tampa.class);
                startActivity(it);
            }
        });
    }
}
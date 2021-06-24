package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FutebolFem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futebol_fem2);

        ImageButton voltaButtonFem02 = (ImageButton) findViewById(R.id.voltaButtonFem02);

        voltaButtonFem02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(FutebolFem2.this, FutebolFem.class);
                startActivity(it);
            }
        });

        ImageButton homeButtonFem = (ImageButton) findViewById(R.id.homeButtonFem);

        homeButtonFem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(FutebolFem2.this, HomePage.class);
                startActivity(it);
            }
        });
    }
}
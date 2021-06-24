package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FutebolFem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futebol_fem);

        ImageButton voltaButtonFem = (ImageButton) findViewById(R.id.voltaButtonFem);

        voltaButtonFem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(FutebolFem.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageButton setaDoisFem = (ImageButton) findViewById(R.id.setaDoisFem);

        setaDoisFem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(FutebolFem.this, FutebolFem2.class);
                startActivity(it);
            }
        });
    }
}
package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Beisebol2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beisebol2);

        ImageButton voltaButtonBase2 = (ImageButton) findViewById(R.id.voltaButtonBase2);

        voltaButtonBase2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Beisebol2.this, Beisebol.class);
                startActivity(it);
            }
        });

        ImageButton setaDoisBase2 = (ImageButton) findViewById(R.id.setaDoisBase2);

        setaDoisBase2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Beisebol2.this, Beisebol3.class);
                startActivity(it);
            }
        });
    }
}
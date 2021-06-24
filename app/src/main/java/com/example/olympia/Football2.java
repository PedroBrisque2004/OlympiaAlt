package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Football2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football2);

        ImageButton voltaButtonFoot2 = (ImageButton) findViewById(R.id.voltaButtonFoot2);

        voltaButtonFoot2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Football2.this, Football.class);
                startActivity(it);
            }
        });

        ImageButton setaDoisFoot2 = (ImageButton) findViewById(R.id.setaDoisFoot2);

        setaDoisFoot2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Football2.this, Football3.class);
                startActivity(it);
            }
        });
    }
}
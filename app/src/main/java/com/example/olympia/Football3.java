package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Football3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football3);

        ImageButton voltaButtonFoot3 = (ImageButton) findViewById(R.id.voltaButtonFoot3);

        voltaButtonFoot3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Football3.this, Football2.class);
                startActivity(it);
            }
        });

        ImageButton homeButtonFoot = (ImageButton) findViewById(R.id.homeButtonFoot);

        homeButtonFoot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Football3.this, HomePage.class);
                startActivity(it);
            }
        });
    }
}
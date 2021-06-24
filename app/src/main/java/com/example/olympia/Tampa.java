package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Tampa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampa);

        ImageButton voltaButtonamg= (ImageButton) findViewById(R.id.voltaButtonamg);

        voltaButtonamg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Tampa.this, Football.class);
                startActivity(it);
            }
        });

        ImageButton homeButtonamg = (ImageButton) findViewById(R.id.homeButtonamg);

        homeButtonamg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Tampa.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageView imgWeb = (ImageView) findViewById(R.id.faceViewamg);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt-br.facebook.com/tampabaybuccaneers/")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.twitterViewamg);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/buccaneers/?hl=pt-br")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.twitterViewamg2);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/buccaneers")));
            }
        });
    }
}
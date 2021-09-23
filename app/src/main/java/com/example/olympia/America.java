package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class America extends AppCompatActivity {
    private ImageView imgWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);

        ImageButton voltaButtonamg= (ImageButton) findViewById(R.id.voltaButtonamg);

        voltaButtonamg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(America.this, Futebol.class);
                startActivity(it);
            }
        });

        ImageButton homeButtonamg = (ImageButton) findViewById(R.id.homeButtonamg);

        homeButtonamg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(America.this, HomePage.class);
                startActivity(it);
            }
        });

        imgWeb = (ImageView) findViewById(R.id.faceViewamg);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/americamg")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.twitterViewamg);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/america_mg/?hl=pt-br")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.twitterViewamg2);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/AmericaMG?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.Localame);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/maps/place/Arena+Independ%C3%AAncia/@-19.9087657,-43.9201896,17z/data=!3m1!4b1!4m5!3m4!1s0xa6972c5fd676db:0xe435b73e2545fdc7!8m2!3d-19.9087708!4d-43.9180009")));
            }
        });
    }
}
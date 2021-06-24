package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SaoPaulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sao_paulo);

        ImageButton voltaButtonamg= (ImageButton) findViewById(R.id.voltaButtonamg);

        voltaButtonamg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(SaoPaulo.this, Futebol.class);
                startActivity(it);
            }
        });

        ImageButton homeButtonamg = (ImageButton) findViewById(R.id.homeButtonamg);

        homeButtonamg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(SaoPaulo.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageView imgWeb = (ImageView) findViewById(R.id.faceViewsp);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/saopaulofc/")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.twitterViewsp);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/SaoPauloFC?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.instaViewsp);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/saopaulofc/?hl=pt-br")));
            }
        });
    }
}
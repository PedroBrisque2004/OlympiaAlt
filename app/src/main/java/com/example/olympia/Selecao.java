package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Selecao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);

        ImageButton voltaButtoncbf= (ImageButton) findViewById(R.id.voltaButtoncbf);

        voltaButtoncbf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Selecao.this, Futebol.class);
                startActivity(it);
            }
        });

        ImageButton homeButtoncbf = (ImageButton) findViewById(R.id.homeButtoncbf);

        homeButtoncbf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Selecao.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageView imgWeb = (ImageView) findViewById(R.id.faceViewsp);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/CBF/")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.twitterViewsp);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cbf_futebol/?hl=pt-br")));
            }
        });

        imgWeb = (ImageView) findViewById(R.id.instaViewsp);
        imgWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/CBF_Futebol?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor")));
            }
        });
    }
}
package com.example.olympia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Volei extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volei);

        ImageButton voltaButtonVol = (ImageButton) findViewById(R.id.voltaButtonVol);

        voltaButtonVol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageButton amgvolButton = (ImageButton) findViewById(R.id.amgvolButton );

        amgvolButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton apanButton = (ImageButton) findViewById(R.id.apanButton );

        apanButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton volrenButton = (ImageButton) findViewById(R.id.volrenButton );

        volrenButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton tauButton = (ImageButton) findViewById(R.id.tauButton );

        tauButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton rpvolButton = (ImageButton) findViewById(R.id.rpvolButton );

        rpvolButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton gruButton = (ImageButton) findViewById(R.id.gruButton );

        gruButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton caraButton = (ImageButton) findViewById(R.id.caraButton );

        caraButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton umButton = (ImageButton) findViewById(R.id.umButton );

        umButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton uberButton = (ImageButton) findViewById(R.id.uberButton );

        uberButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton sesiButton = (ImageButton) findViewById(R.id.sesiButton );

        sesiButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton mtcButton = (ImageButton) findViewById(R.id.mtcButton );

        mtcButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton cruvolButton = (ImageButton) findViewById(R.id.cruvolButton );

        cruvolButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Volei.this, TelaErro.class);
                startActivity(it);
            }
        });

    }
}
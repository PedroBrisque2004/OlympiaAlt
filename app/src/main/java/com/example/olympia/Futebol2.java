package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Futebol2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futebol2);

        ImageButton voltaButton02 = (ImageButton) findViewById(R.id.voltaButton02);

        voltaButton02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, Futebol.class);
                startActivity(it);
            }
        });

        ImageButton homeButton = (ImageButton) findViewById(R.id.homeButton);

        homeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageButton flaButton = (ImageButton) findViewById(R.id.flaButton );

        flaButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton juvButton = (ImageButton) findViewById(R.id.juvButton );

        juvButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton greButton = (ImageButton) findViewById(R.id.greButton );

        greButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton sanButton = (ImageButton) findViewById(R.id.sanButton );

        sanButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton rbbButton = (ImageButton) findViewById(R.id.rbbButton );

        rbbButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton spfcButton = (ImageButton) findViewById(R.id.spfcButton );

        spfcButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, SaoPaulo.class);
                startActivity(it);
            }
        });

        ImageButton spoButton = (ImageButton) findViewById(R.id.spoButton );

        spoButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton palButton = (ImageButton) findViewById(R.id.palButton );

        palButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton cbfButton = (ImageButton) findViewById(R.id.cbfButton );

        cbfButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol2.this, TelaErro.class);
                startActivity(it);
            }
        });

    }
}
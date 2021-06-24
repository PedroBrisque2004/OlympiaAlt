package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Futebol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futebol);

        ImageButton voltaButton = (ImageButton) findViewById(R.id.voltaButton);

        voltaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, HomePage.class);
                startActivity(it);
            }
        });

        ImageButton setaDois = (ImageButton) findViewById(R.id.setaDois);

        setaDois.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, Futebol2.class);
                startActivity(it);
            }
        });

        ImageButton amgButton = (ImageButton) findViewById(R.id.amgButton );

        amgButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, America.class);
                startActivity(it);
            }
        });

        ImageButton intButton = (ImageButton) findViewById(R.id.intButton );

        intButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton chaButton = (ImageButton) findViewById(R.id.chaButton );

        chaButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton fluButton = (ImageButton) findViewById(R.id.fluButton );

        fluButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton forButton = (ImageButton) findViewById(R.id.forButton );

        forButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton camButton = (ImageButton) findViewById(R.id.camButton );

        camButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton capButton = (ImageButton) findViewById(R.id.capButton );

        capButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton bahButton = (ImageButton) findViewById(R.id.bahButton );

        bahButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton corButton = (ImageButton) findViewById(R.id.corButton );

        corButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton acgButton = (ImageButton) findViewById(R.id.acgButton );

        acgButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton ceaButton = (ImageButton) findViewById(R.id.ceaButton );

        ceaButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });

        ImageButton cuiButton = (ImageButton) findViewById(R.id.cuiButton );

        cuiButton .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Futebol.this, TelaErro.class);
                startActivity(it);
            }
        });
    }
}
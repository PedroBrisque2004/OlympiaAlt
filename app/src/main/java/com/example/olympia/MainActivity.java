package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etnome = findViewById(R.id.etNome);
        final EditText etsenha = findViewById(R.id.etSenha);
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnregistro = findViewById(R.id.btnRegistro);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etnome.getText().toString();
                String senha = etsenha.getText().toString();
                SharedPreferences preferences = getSharedPreferences("PREFERENCIAS", 0);

                //String savedSenha = preferences.getString(senha, "");
                //String savednome = preferences.getString(usuario, "");

                String Usuario = preferences.getString(usuario + senha + "data","Usuáiro ou senha inválidos");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("display",Usuario);
                editor.commit();

                Intent MainActivity = new Intent(MainActivity.this, HomePage.class);
                startActivity(MainActivity);
            }
        });


        btnregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro = new Intent(MainActivity.this, registro.class);
                startActivity(registro);
            }
        });
    }



}
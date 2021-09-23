package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        final EditText nome = findViewById(R.id.etNomereg);
        final EditText senha = findViewById(R.id.etSenhareg);
        final EditText email = findViewById(R.id.etEmailreg);
        Button btnRegistro = findViewById(R.id.btnNewRegistro);


        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences("PREFERENCIAS",0);
                String Usuario  = nome.getText().toString();
                String Senha = senha.getText().toString();
                String newEmail = email.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();

                editor.putString(Usuario,Usuario);
                editor.commit();
                editor.putString(Senha, Senha);
                editor.commit();
                editor.putString(Usuario + Senha + "data", Usuario + "\n" + newEmail);
                editor.commit();

                Intent registro = new Intent(registro.this, MainActivity.class);
                startActivity(registro);
            }
        });

    }

}

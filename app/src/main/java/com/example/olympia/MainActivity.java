package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Button btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView etEmail = findViewById(R.id.etEmail);
                TextView etSenha = findViewById(R.id.etSenha);
                String email = etEmail.getText().toString();
                String senha = etSenha.getText().toString();
                if (email.equals("pedrojbrisque@gmail.com") && senha.equals("123456")) {
                    Intent intent = new Intent (getApplicationContext(), HomePage.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Login Inválido", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.gson.Gson;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private static final String FILE_NAME = "dadosCliente.json";
    private EditText txtEmail, txtSenha;
    private String email, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLogin = findViewById(R.id.btnLogin);
        txtEmail = findViewById(R.id.etEmail);
        txtSenha = findViewById(R.id.etSenha);
        btnLogin.setOnClickListener(v -> {
            Gson gson = new Gson();
            String clienteJson = lerDados();
            Cliente cliente = gson.fromJson(clienteJson, Cliente.class);
            String emailLogin = String.valueOf(txtEmail.getText());
            String senhaLogin = String.valueOf(txtSenha.getText());
            if ((senhaLogin.equals(cliente.getSenha())) && (emailLogin.equals(cliente.getEmail()))) {
                entrar();
            } else {
                Toast.makeText(MainActivity.this, "Usuário ou senha não correspondem", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // MÉTODOS PARA ENTRAR
    public void entrar() {
        Toast.makeText(MainActivity.this, "Inicio", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), registro.class);
        startActivity(intent);
    }
    // LER DADOS
    private String lerDados() {
        FileInputStream fis;
        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;
            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
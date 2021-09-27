package com.example.olympia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class registro extends AppCompatActivity {

    private static final String FILE_NAME = "dadosCliente.json";
    private EditText txtNome, txtCPF, txtCelular, txtIdade, txtEmail, txtSenha, txtConfSenha;
    private String nome, cpf, celular, stringidade, email, senha, confsenha;
    private int idade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Button btnCadastrar = findViewById(R.id.btnNewRegistro);
        txtNome = findViewById(R.id.etNomereg);
        txtCPF = findViewById(R.id.etCPFreg);
        txtCelular = findViewById(R.id.etCelularreg);
        txtIdade = findViewById(R.id.etIdadereg);
        txtEmail = findViewById(R.id.etEmailreg);
        txtSenha = findViewById(R.id.etSenhareg);
        txtConfSenha = findViewById(R.id.etCSenhareg);
        btnCadastrar.setOnClickListener(v -> {
            nome = txtNome.getText().toString();
            cpf = txtCPF.getText().toString();
            celular = txtCelular.getText().toString();
            stringidade = txtIdade.getText().toString();
            idade = Integer.parseInt(stringidade);
            email = txtEmail.getText().toString();
            senha = txtSenha.getText().toString();
            confsenha = txtConfSenha.getText().toString();
            if (idade >= 18){
                if (senha.equals(confsenha)) {
                    Cliente cliente = new Cliente(nome, cpf, celular, idade, email, senha);
                    Gson gson = new Gson();
                    String json = gson.toJson(cliente);
                    gravarDados(json);
                    abrirLogin(null);
                } else {
                    Toast.makeText(registro.this, "As senhas não correspondem.", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(registro.this, "É preciso ser maior de idade para cadastrar-se.", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // MÉTODOS PARA ENTRAR
    public void abrirLogin(View view) {
        Toast.makeText(registro.this, "Login", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    // ARMAZENAR DADOS
    private void gravarDados(String json) {
        FileOutputStream fos = null;
        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(json.getBytes());
            Toast.makeText(this, "Cadastro efetuado.", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
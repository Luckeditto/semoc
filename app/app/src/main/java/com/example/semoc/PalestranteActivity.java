package com.example.semoc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PalestranteActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palestrantedeets);

        Intent intent = PalestranteActivity.this.getIntent();

        Palestrante chave_palestrante = (Palestrante) intent.getSerializableExtra("CHAVE");
        String nome = chave_palestrante.getNome();
        TextView palestranteNome = findViewById(R.id.palestranteactvnome);
        palestranteNome.setText(nome);


    }
}

package com.example.semoc;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class PopUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        Intent intent = PopUpActivity.this.getIntent();

        Evento chave_programa = (Evento) intent.getSerializableExtra("CHAVE");

        TextView titulo = (TextView) this.findViewById(R.id.texto_teste);
        titulo.setText(chave_programa.getTitulo());
        TextView descricao = (TextView) this.findViewById((R.id.descricao));
        descricao.setText(chave_programa.getDescricao());


    }

}

package com.calculonotas.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    //Cria um objeto que vai estar associado ao elemento de tela
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //associação do objeto ao elemento de tela
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        //declara o objeto que receberá o gerenciador de atividade
        Intent i = getIntent();
        //lê o parâmetro que foi passado pela tela anterior
        float media = i.getFloatExtra("media", 0f);
        // define o que seráapresentado ao usuário
        String situacao = null;
        if (media >= 6)
            situacao = "Aprovado";
        else
            situacao = "Reprovado";
        String mag = "Você foi " + situacao + " com média " + media;
        //copia a mensagem que será mostrado ao usuário para canto tvResultado
        tvResultado.setText(mag);
    }
}

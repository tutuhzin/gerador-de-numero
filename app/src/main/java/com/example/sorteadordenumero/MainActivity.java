package com.example.sorteadordenumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View v){

        int x = new Random().nextInt(11);

        TextView texto = findViewById(R.id.textoResultado); // chamando o texto
        texto.setText("O número sorteado foi: " + x); // alterando o texto


    }

}

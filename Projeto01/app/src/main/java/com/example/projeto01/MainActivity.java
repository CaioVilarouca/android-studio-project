package com.example.projeto01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button meuBotao;
    private EditText meuTexto;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meuBotao = findViewById(R.id.Botao);
        meuTexto = findViewById(R.id.Texto);
        resultado = findViewById(R.id.Resultado);

        meuBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = meuTexto.getText().toString().trim();
                resultado.setText(textoDigitado);
            }
        });
    }
}

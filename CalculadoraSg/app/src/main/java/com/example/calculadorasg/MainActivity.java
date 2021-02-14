package com.example.calculadorasg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.etNumero1);
        numero2 = (EditText) findViewById(R.id.etNumero2);
        resultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void Calculadora(View v)
    {
      float n1 = Integer.parseInt(numero1.getText().toString());
      float n2 =  Integer.parseInt(numero2.getText().toString());
      float suma = n1+n2;
      float resta = n1-n2;
      float multi = n1 * n2;
      float divi = n1 / n2;
        resultado.setText("El resultado de las operaciones es: suma "+suma +" resta "+resta +" multiplicación "+ multi +" division "+divi);
    }
}
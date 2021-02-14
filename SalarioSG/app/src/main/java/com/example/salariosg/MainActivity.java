package com.example.salariosg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText apellidos;
    private EditText sueldo;
    private EditText extras;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.etNombre);
        apellidos = (EditText) findViewById(R.id.etApellidos);
        sueldo = (EditText) findViewById(R.id.etSueldo);
        extras = (EditText) findViewById(R.id.etExtras);
        resultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void CalculaSueldo(View v)
    {
        double suel = Integer.parseInt(sueldo.getText().toString());
        double ext = Integer.parseInt(extras.getText().toString());
        double subtotal = (suel*48);
        double subtotal1 = (suel * ext);
        double subtotal2 = (subtotal1*0.02);
        double total = (subtotal+subtotal1+subtotal2);
        resultado.setText("El sueldo total semanal es de " + total);
    }
}
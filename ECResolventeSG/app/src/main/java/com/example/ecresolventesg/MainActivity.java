package com.example.ecresolventesg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numeroa;
    private EditText numerob;
    private EditText numeroc;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroa = (EditText) findViewById(R.id.etNumeroa);
        numerob = (EditText) findViewById(R.id.etNumerob);
        numeroc = (EditText) findViewById(R.id.etNumeroc);
        resultado = (TextView) findViewById(R.id.tvResultado);
    }

    public void ec(View v){


    double na = Integer.parseInt(numeroa.getText().toString());
    double nb =  Integer.parseInt(numerob.getText().toString());
    double nc =  Integer.parseInt(numeroc.getText().toString());
    double discriminante = ((nb*nb)-(4*(na*nc)));
    double x1, x2;

        if (discriminante < 0) {
            resultado.setText ("La Ecuacion No Tiene Soluciones");
        }

        if (discriminante == 0) {
            resultado.setText ("La ecuacion tiene solo una raiz");
            x1 = (-nb)/(2*na);
            resultado.setText ("La Solucion es, X1=X2 : "+x1);
        }

        if (discriminante > 0) {
            resultado.setText ("La ecuacion tiene dos raizes ");
            x1 = (-nb)+Math.sqrt(discriminante)/(2*na);
            x2 = (-nb)-Math.sqrt(discriminante)/(2*na);
            resultado.setText ("La Solucion es, X1 = " +x1+ " y, X2 = " +x2);
        }

    }
}
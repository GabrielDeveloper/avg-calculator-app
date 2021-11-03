package com.example.avgcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.round;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    private EditText editTextava1;
    private EditText editTextava2;
    private EditText editTextprova;
    private TextView textviewresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextava1 = findViewById(R.id.editTextava1);
        editTextava2 = findViewById(R.id.editTextava2);
        editTextprova = findViewById(R.id.editTextprova);
        textviewresultado = findViewById(R.id.textViewresultado);
    }

    public void calcularmedia(View view) {
        try {
            double ava1 = Double.parseDouble(editTextava1.getText().toString());
            double ava2 = Double.parseDouble(editTextava2.getText().toString());
            double prova = Double.parseDouble(editTextprova.getText().toString());

            double resultadoa1 = (ava1 * 0.4) + (ava2 * 0.4);
            double resultadoprova = (prova * 0.6);
            double nfp = resultadoa1 + resultadoprova;
            double nfpFinal = Math.round(nfp * 100.0) / 100.0;

            if (nfpFinal >= 6) {

                textviewresultado.setText("APROVADO! NFp = "+nfpFinal);

            }else if (nfp <= 5.9) {

                textviewresultado.setText("REPROVADO NFp = "+nfpFinal);

            }
        } catch (Exception ex){
            Log.e(TAG,"Erro na função verificar: "+ex.getMessage());
        }
    }
}
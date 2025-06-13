package com.tap.proyecto_movil;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad6 extends AppCompatActivity {

    private Spinner spinnerNumeros;
    private Button btnPares, btnImpares, btnVaciar, btnRegresar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad6);

        spinnerNumeros = findViewById(R.id.spinnerNumeros);
        btnPares = findViewById(R.id.btnPares);
        btnImpares = findViewById(R.id.btnImpares);
        btnVaciar = findViewById(R.id.btnVaciar);
        btnRegresar = findViewById(R.id.btnRegresar);
        lblResultado = findViewById(R.id.lblResultado);

        btnPares.setOnClickListener(v -> llenarSpinnerConPares());

        btnImpares.setOnClickListener(v -> llenarSpinnerConImpares());

        btnVaciar.setOnClickListener(v -> {
            lblResultado.setText("");
            spinnerNumeros.setAdapter(null);
        });

        spinnerNumeros.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String seleccionado = parent.getItemAtPosition(position).toString();
                lblResultado.setText(seleccionado);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                lblResultado.setText("");
            }
        });

        btnRegresar.setOnClickListener(v -> finish());
    }

    private void llenarSpinnerConPares() {
        String[] pares = new String[5];
        int idx = 0;
        for (int i = 0; i < 10; i += 2) {
            pares[idx++] = "Num " + i;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, pares);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNumeros.setAdapter(adapter);
    }

    private void llenarSpinnerConImpares() {
        String[] impares = new String[5];
        int idx = 0;
        for (int i = 1; i < 10; i += 2) {
            impares[idx++] = "Num " + i;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, impares);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNumeros.setAdapter(adapter);
    }
}


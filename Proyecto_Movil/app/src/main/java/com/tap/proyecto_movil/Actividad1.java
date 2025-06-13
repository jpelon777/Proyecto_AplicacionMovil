package com.tap.proyecto_movil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad1 extends AppCompatActivity {

    private TextView lblNombre, lblCiudad;
    private Button btnOcultarNombre, btnVisuNombre, btnOcultarCiudad, btnVisuCiudad;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        lblNombre = findViewById(R.id.lblNombre);
        lblCiudad = findViewById(R.id.lblCiudad);
        btnOcultarNombre = findViewById(R.id.btnOcultarNombre);
        btnVisuNombre = findViewById(R.id.btnVisuNombre);
        btnOcultarCiudad = findViewById(R.id.btnOcultarCiudad);
        btnVisuCiudad = findViewById(R.id.btnVisuCiudad);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnOcultarNombre.setOnClickListener(v -> lblNombre.setVisibility(View.INVISIBLE));
        btnVisuNombre.setOnClickListener(v -> lblNombre.setVisibility(View.VISIBLE));

        btnOcultarCiudad.setOnClickListener(v -> lblCiudad.setVisibility(View.INVISIBLE));
        btnVisuCiudad.setOnClickListener(v -> lblCiudad.setVisibility(View.VISIBLE));

        btnRegresar.setOnClickListener(v -> finish());  // Cierra la actividad y regresa a la anterior
    }
}


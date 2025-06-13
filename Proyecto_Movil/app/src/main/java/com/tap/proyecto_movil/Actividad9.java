package com.tap.proyecto_movil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad9 extends AppCompatActivity {

    EditText txtUnidades, txtPrecio;
    TextView lblTotalSinIva, lblIva, lblTotalMasIva;
    Button btnCalcular, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad9);

        txtUnidades = findViewById(R.id.txtUnidades);
        txtPrecio = findViewById(R.id.txtPrecio);
        lblTotalSinIva = findViewById(R.id.lblTotalSinIva);
        lblIva = findViewById(R.id.lblIva);
        lblTotalMasIva = findViewById(R.id.lblTotalMasIva);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(v -> {
            try {
                double unidades = Double.parseDouble(txtUnidades.getText().toString());
                double precio = Double.parseDouble(txtPrecio.getText().toString());
                double totalSinIva = unidades * precio;
                double iva = totalSinIva * 0.16;
                double totalConIva = totalSinIva + iva;

                lblTotalSinIva.setText("Total sin IVA: " + totalSinIva);
                lblIva.setText("IVA: " + iva);
                lblTotalMasIva.setText("Total con IVA: " + totalConIva);
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Ingrese valores válidos", Toast.LENGTH_SHORT).show();
            }
        });

        btnRegresar.setOnClickListener(v -> {
            finish();
        });
    }
}

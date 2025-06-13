package com.tap.proyecto_movil;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad7 extends AppCompatActivity {

    private EditText editPrecioBase;
    private ToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;
    private TextView lblTotal;
    private Button btnCalcular, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad7);

        editPrecioBase = findViewById(R.id.editPrecioBase);
        tbtnInstalacion = findViewById(R.id.tbtnInstalacion);
        tbtnFormacion = findViewById(R.id.tbtnFormacion);
        tbtnAlimentacionBD = findViewById(R.id.tbtnAlimentacionBD);
        lblTotal = findViewById(R.id.lblTotal);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnRegresar = findViewById(R.id.btnRegresar);

        // Preseleccionar Instalacion activado
        tbtnInstalacion.setChecked(true);

        btnCalcular.setOnClickListener(v -> calcularTotal());

        btnRegresar.setOnClickListener(v -> finish()); // Cierra esta actividad y regresa
    }

    private void calcularTotal() {
        String precioBaseStr = editPrecioBase.getText().toString().trim();

        if (TextUtils.isEmpty(precioBaseStr)) {
            Toast.makeText(this, "Ingrese el precio base", Toast.LENGTH_SHORT).show();
            return;
        }

        double precioBase;
        try {
            precioBase = Double.parseDouble(precioBaseStr);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Precio base inválido", Toast.LENGTH_SHORT).show();
            return;
        }

        double precioInstalacion = 40;
        double precioFormacion = 200;
        double precioAlimentacionBD = 200;

        double total = precioBase;
        if (tbtnInstalacion.isChecked()) total += precioInstalacion;
        if (tbtnFormacion.isChecked()) total += precioFormacion;
        if (tbtnAlimentacionBD.isChecked()) total += precioAlimentacionBD;

        lblTotal.setText(String.format("Total: %.2f $", total));
    }
}



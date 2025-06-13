package com.tap.proyecto_movil;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad2 extends AppCompatActivity {

    private RadioGroup grupoColores;
    private RadioButton optRojo, optVerde, optAzul;
    private Button btnAceptar, btnRegresar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        // Referenciar componentes del layout
        grupoColores = findViewById(R.id.grupoColores);
        optRojo = findViewById(R.id.optRojo);
        optVerde = findViewById(R.id.optVerde);
        optAzul = findViewById(R.id.optAzul);
        btnAceptar = findViewById(R.id.btnAceptar);
        lblResultado = findViewById(R.id.lblResultado);
        btnRegresar = findViewById(R.id.btnRegresar);

        // Seleccionar rojo por defecto
        optRojo.setChecked(true);

        // Acción al presionar "Aceptar"
        btnAceptar.setOnClickListener(v -> {
            String mensaje = "Color elegido: ";
            int seleccionado = grupoColores.getCheckedRadioButtonId();
            if (seleccionado == R.id.optRojo) {
                mensaje += "Rojo";
            } else if (seleccionado == R.id.optVerde) {
                mensaje += "Verde";
            } else if (seleccionado == R.id.optAzul) {
                mensaje += "Azul";
            }
            lblResultado.setText(mensaje);
        });

        // Acción al presionar "Regresar"
        btnRegresar.setOnClickListener(v -> finish());
    }
}




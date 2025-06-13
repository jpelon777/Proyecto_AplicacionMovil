package com.tap.proyecto_movil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad4 extends AppCompatActivity {

    private Spinner cboColores;
    private EditText lblResultado;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        cboColores = findViewById(R.id.cboColores);
        lblResultado = findViewById(R.id.lblResultado);
        btnRegresar = findViewById(R.id.btnRegresar);

        // Adaptador para el spinner con los colores
        String[] colores = {"Rojo", "Verde", "Azul"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colores);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cboColores.setAdapter(adapter);

        cboColores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String mensaje = "El color elegido es " + parent.getItemAtPosition(position).toString();
                lblResultado.setText(mensaje);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                lblResultado.setText("");
            }
        });

        btnRegresar.setOnClickListener(v -> finish());
    }
}

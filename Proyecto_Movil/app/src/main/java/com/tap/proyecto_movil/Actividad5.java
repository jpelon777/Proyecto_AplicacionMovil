package com.tap.proyecto_movil;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad5 extends AppCompatActivity {

    private ListView lstNombres;
    private TextView lblResultado;
    private Button btnCurso1, btnCurso2, btnVaciar, btnRegresar;

    private String[] curso1 = {"Juan", "Maria", "Luis"};
    private String[] curso2 = {"Ana", "Marta", "Jose"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad5);

        lstNombres = findViewById(R.id.lstNombres);
        lblResultado = findViewById(R.id.lblResultado);
        btnCurso1 = findViewById(R.id.btnCurso1);
        btnCurso2 = findViewById(R.id.btnCurso2);
        btnVaciar = findViewById(R.id.btnVaciar);
        btnRegresar = findViewById(R.id.btnRegresar);

        // Botón Curso 1 - carga nombres de curso 1
        btnCurso1.setOnClickListener(v -> {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, curso1);
            lstNombres.setAdapter(adapter);
            lblResultado.setText("");
        });

        // Botón Curso 2 - carga nombres de curso 2
        btnCurso2.setOnClickListener(v -> {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, curso2);
            lstNombres.setAdapter(adapter);
            lblResultado.setText("");
        });

        // Botón Vaciar - limpia la lista y el texto
        btnVaciar.setOnClickListener(v -> {
            lstNombres.setAdapter(null);
            lblResultado.setText("");
        });

        // Al seleccionar un nombre en la lista, mostrarlo en lblResultado
        lstNombres.setOnItemClickListener((parent, view, position, id) -> {
            String seleccionado = (String) parent.getItemAtPosition(position);
            lblResultado.setText(seleccionado);
        });

        // Botón Regresar - cierra la actividad
        btnRegresar.setOnClickListener(v -> finish());
    }
}


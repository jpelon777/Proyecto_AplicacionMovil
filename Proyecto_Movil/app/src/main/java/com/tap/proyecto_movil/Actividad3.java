package com.tap.proyecto_movil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad3 extends AppCompatActivity {

    private EditText txtTexto;
    private TextView lblTexto1, lblTexto2;
    private Button btnTraspasa1, btnTraspasa2, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        txtTexto = findViewById(R.id.txtTexto);
        lblTexto1 = findViewById(R.id.lblTexto1);
        lblTexto2 = findViewById(R.id.lblTexto2);
        btnTraspasa1 = findViewById(R.id.btnTraspasa1);
        btnTraspasa2 = findViewById(R.id.btnTraspasa2);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnTraspasa1.setOnClickListener(v -> {
            String texto = txtTexto.getText().toString();
            lblTexto1.setText(texto);
        });

        btnTraspasa2.setOnClickListener(v -> {
            String texto = txtTexto.getText().toString();
            lblTexto2.setText(texto);
        });

        btnRegresar.setOnClickListener(v -> finish());
    }
}

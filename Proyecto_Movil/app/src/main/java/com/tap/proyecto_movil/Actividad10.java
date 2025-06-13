package com.tap.proyecto_movil;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad10 extends AppCompatActivity {

    EditText txtRadio;
    TextView lblArea, lblPerimetro;
    Button btnCalcular, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad10);

        txtRadio = findViewById(R.id.txtRadio);
        lblArea = findViewById(R.id.lblArea);
        lblPerimetro = findViewById(R.id.lblPerimetro);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnCalcular.setOnClickListener(v -> calcular());

        btnRegresar.setOnClickListener(v -> finish()); // Vuelve a la actividad anterior
    }

    public void calcular() {
        try {
            double r = Double.parseDouble(txtRadio.getText().toString());

            if (r < 0) {
                lblArea.setText("ERROR");
                lblArea.setTextColor(Color.RED);
                lblPerimetro.setText("ERROR");
                lblPerimetro.setTextColor(Color.RED);
            } else {
                double area = Math.PI * Math.pow(r, 2);
                double perimetro = 2 * Math.PI * r;

                lblArea.setTextColor(Color.BLACK);
                lblPerimetro.setTextColor(Color.BLACK);

                lblArea.setText(String.format("%.2f", area));
                lblPerimetro.setText(String.format("%.2f", perimetro));
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Ingrese un valor válido", Toast.LENGTH_SHORT).show();
        }
    }
}

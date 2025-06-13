package com.tap.proyecto_movil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Actividad8 extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView txtValor;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad8);

        seekBar = findViewById(R.id.seekBar);
        txtValor = findViewById(R.id.txtValor);
        btnRegresar = findViewById(R.id.btnRegresar);


        txtValor.setText("El valor es: " + seekBar.getProgress());


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtValor.setText("El valor es: " + progress);
            }

            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });


        btnRegresar.setOnClickListener(view -> {
            Intent intent = new Intent(Actividad8.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}


package com.tap.proyecto_movil;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnEj1, btnEj2, btnEj3, btnEj4, btnEj5, btnEj6, btnEj7, btnEj8, btnEj9, btnEj10;
    Button btnCerrarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEj1 = findViewById(R.id.btnEjercicio1);
        btnEj2 = findViewById(R.id.btnEjercicio2);
        btnEj3 = findViewById(R.id.btnEjercicio3);
        btnEj4 = findViewById(R.id.btnEjercicio4);
        btnEj5 = findViewById(R.id.btnEjercicio5);
        btnEj6 = findViewById(R.id.btnEjercicio6);
        btnEj7 = findViewById(R.id.btnEjercicio7);
        btnEj8 = findViewById(R.id.btnEjercicio8);
        btnEj9 = findViewById(R.id.btnEjercicio9);
        btnEj10 = findViewById(R.id.btnEjercicio10);
        btnCerrarSesion = findViewById(R.id.btnCerrarSesion);

        btnEj1.setOnClickListener(v -> startActivity(new Intent(this, Actividad1.class)));
        btnEj2.setOnClickListener(v -> startActivity(new Intent(this, Actividad2.class)));
        btnEj3.setOnClickListener(v -> startActivity(new Intent(this, Actividad3.class)));
        btnEj4.setOnClickListener(v -> startActivity(new Intent(this, Actividad4.class)));
        btnEj5.setOnClickListener(v -> startActivity(new Intent(this, Actividad5.class)));
        btnEj6.setOnClickListener(v -> startActivity(new Intent(this, Actividad6.class)));
        btnEj7.setOnClickListener(v -> startActivity(new Intent(this, Actividad7.class)));
        btnEj8.setOnClickListener(v -> startActivity(new Intent(this, Actividad8.class)));
        btnEj9.setOnClickListener(v -> startActivity(new Intent(this, Actividad9.class)));
        btnEj10.setOnClickListener(v -> startActivity(new Intent(this, Actividad10.class)));

        btnCerrarSesion.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });
    }
}


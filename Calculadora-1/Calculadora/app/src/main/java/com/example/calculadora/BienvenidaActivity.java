package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class BienvenidaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar la actividad MainActivity
                Intent intent = new Intent(BienvenidaActivity.this, MainActivity.class);

                // Iniciar la actividad MainActivity
                startActivity(intent);

                // Finalizar esta actividad (opcional, dependiendo de tu flujo de navegación)
                finish();
            }
        });
    }
}

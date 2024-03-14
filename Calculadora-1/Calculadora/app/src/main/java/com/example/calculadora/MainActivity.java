package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private TextView msn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = findViewById(R.id.Fibonacci);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar la actividad MainActivity
                Intent intent = new Intent(MainActivity.this, FibonacciActivity.class);

                // Iniciar la actividad MainActivity
                startActivity(intent);

                // Finalizar esta actividad (opcional, dependiendo de tu flujo de navegación)
                finish();
            }
        });

        msn = findViewById(R.id.Resultado);
        valor1 = findViewById(R.id.Caja1);
        valor2 = findViewById(R.id.Caja2);

        Button suma = findViewById(R.id.Sm);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int msj = Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
                msn.setText(String.valueOf(msj));
            }
        });

        Button res = findViewById(R.id.Rt);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int msj = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
                msn.setText(String.valueOf(msj));
            }
        });

        Button mult = findViewById(R.id.Ml);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int msj = Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString());
                msn.setText(String.valueOf(msj));
            }
        });

        Button div = findViewById(R.id.Dv);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int msj = Integer.parseInt(valor1.getText().toString()) / Integer.parseInt(valor2.getText().toString());
                msn.setText(String.valueOf(msj));
            }
        });

        Button pot = findViewById(R.id.Potencia);
        pot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double base = Double.parseDouble(valor1.getText().toString());
                double expo = Double.parseDouble(valor2.getText().toString());
                double result = potencia2(base, expo);
                msn.setText(String.valueOf(result));
            }
        });
        //-----
        Button factorialButton = findViewById(R.id.Factorial);
        factorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(valor1.getText().toString());
                int result = calcularFactorial(n);
                msn.setText(String.valueOf(result));
            }
        });
    }
    //-----
    private int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    private static double potencia2(double base, double expo) {
        if (expo == 0) {
            return 1;
        } else if (expo < 0) {
            return potencia2(base, expo + 1) / base;
        } else {
            return base * potencia2(base, expo - 1);
        }
    }
}



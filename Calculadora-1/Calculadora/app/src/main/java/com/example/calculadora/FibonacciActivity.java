package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FibonacciActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
        EditText inputNumber = findViewById(R.id.Caja1);
        TextView resultTextView = findViewById(R.id.Resultado);
        Button calculateButton = findViewById(R.id.CalcularFibonacci);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el número ingresado por el usuario
                int n = Integer.parseInt(inputNumber.getText().toString());

                // Calcular la secuencia de Fibonacci hasta el número n
                StringBuilder result = new StringBuilder();
                int fib1 = 0, fib2 = 1;
                for (int i = 0; i < n; i++) {
                    result.append(fib1).append(", ");
                    int nextFib = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = nextFib;
                }

                // Mostrar la secuencia de Fibonacci en el TextView
                resultTextView.setText(result.toString());
            }
        });

    }
}

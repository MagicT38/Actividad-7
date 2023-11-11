package com.example.activity_x5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    private EditText editTextNumerador1, editTextDenominador1, editTextNumerador2, editTextDenominador2;
    private Button btnRestar;
    private TextView textViewResultadoResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        // Inicializar vistas
        editTextNumerador1 = findViewById(R.id.editTextNumerador1);
        editTextDenominador1 = findViewById(R.id.editTextDenominador1);
        editTextNumerador2 = findViewById(R.id.editTextNumerador2);
        editTextDenominador2 = findViewById(R.id.editTextDenominador2);
        btnRestar = findViewById(R.id.btnRestar);
        textViewResultadoResta = findViewById(R.id.textViewResultadoResta);

        // Configurar el clic del botón
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restarFracciones();
            }
        });
    }

    private void restarFracciones() {
        try {
            // Obtener las fracciones ingresadas como texto
            int numerador1 = Integer.parseInt(editTextNumerador1.getText().toString());
            int denominador1 = Integer.parseInt(editTextDenominador1.getText().toString());
            int numerador2 = Integer.parseInt(editTextNumerador2.getText().toString());
            int denominador2 = Integer.parseInt(editTextDenominador2.getText().toString());

            // Calcular la resta
            int nuevoNumerador = numerador1 * denominador2 - numerador2 * denominador1;
            int nuevoDenominador = denominador1 * denominador2;

            // Mostrar el resultado
            textViewResultadoResta.setText("Resultado de la resta: " + nuevoNumerador + "/" + nuevoDenominador);
        } catch (NumberFormatException e) {
            textViewResultadoResta.setText("Por favor, ingresa números válidos para las fracciones.");
        } catch (ArithmeticException e) {
            textViewResultadoResta.setText("Error: Division by zero.");
        }
    }
}

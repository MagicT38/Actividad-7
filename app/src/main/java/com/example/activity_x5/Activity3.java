package com.example.activity_x5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private EditText editTextNumero1, editTextNumero2, editTextNumero3;
    private Button btnDividirNumeros;
    private TextView textViewResultadoDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        // Inicializar vistas
        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        editTextNumero3 = findViewById(R.id.editTextNumero3);
        btnDividirNumeros = findViewById(R.id.btnDividirNumeros);
        textViewResultadoDivision = findViewById(R.id.textViewResultadoDivision);

        // Configurar el clic del botón
        btnDividirNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dividirNumeros();
            }
        });
    }

    private void dividirNumeros() {
        // Obtener los números ingresados como texto
        String strNumero1 = editTextNumero1.getText().toString();
        String strNumero2 = editTextNumero2.getText().toString();
        String strNumero3 = editTextNumero3.getText().toString();

        // Convertir a números
        try {
            double numero1 = Double.parseDouble(strNumero1);
            double numero2 = Double.parseDouble(strNumero2);
            double numero3 = Double.parseDouble(strNumero3);

            // Verificar si el denominador es diferente de cero
            if (numero3 != 0) {
                // Realizar la división
                double resultado = (numero1 / numero2) / numero3;

                // Mostrar el resultado
                textViewResultadoDivision.setText("Resultado de la división: " + resultado);
            } else {
                textViewResultadoDivision.setText("Error: El tercer número no puede ser cero.");
            }
        } catch (NumberFormatException e) {
            textViewResultadoDivision.setText("Por favor, ingresa números válidos.");
        }
    }
}

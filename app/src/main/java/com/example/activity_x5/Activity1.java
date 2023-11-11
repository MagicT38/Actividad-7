package com.example.activity_x5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2, editTextNumber3;
    private Button btnSumar;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        // Inicializar vistas
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        btnSumar = findViewById(R.id.btnSumar);
        textViewResultado = findViewById(R.id.textViewResultado);

        // Configurar el clic del botón
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarNumeros();
            }
        });
    }

    private void sumarNumeros() {
        // Obtener los números ingresados como texto
        String numero1Str = editTextNumber1.getText().toString();
        String numero2Str = editTextNumber2.getText().toString();
        String numero3Str = editTextNumber3.getText().toString();

        // Verificar si los campos están vacíos
        if (numero1Str.isEmpty() || numero2Str.isEmpty() || numero3Str.isEmpty()) {
            textViewResultado.setText("Por favor, ingresa todos los números.");
            return;
        }

        // Convertir los números de texto a enteros
        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int numero3 = Integer.parseInt(numero3Str);

        // Realizar la suma
        int resultado = numero1 + numero2 + numero3;

        // Mostrar el resultado
        textViewResultado.setText("Resultado: " + resultado);
    }
}

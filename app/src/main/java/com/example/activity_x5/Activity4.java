package com.example.activity_x5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    private EditText editTextPorcentaje;
    private Button btnConvertir;
    private TextView textViewResultadoConversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        // Inicializar vistas
        editTextPorcentaje = findViewById(R.id.editTextPorcentaje);
        btnConvertir = findViewById(R.id.btnConvertir);
        textViewResultadoConversion = findViewById(R.id.textViewResultadoConversion);

        // Configurar el clic del botón
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertirPorcentajeADecimal();
            }
        });
    }

    private void convertirPorcentajeADecimal() {
        // Obtener el porcentaje ingresado como texto
        String strPorcentaje = editTextPorcentaje.getText().toString();

        // Convertir a número
        try {
            double porcentaje = Double.parseDouble(strPorcentaje);

            // Realizar la conversión a decimal
            double decimal = porcentaje / 100.0;

            // Mostrar el resultado
            textViewResultadoConversion.setText("Resultado de la conversión: " + decimal);
        } catch (NumberFormatException e) {
            textViewResultadoConversion.setText("Por favor, ingresa un porcentaje válido.");
        }
    }
}

package com.example.activity_x5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private EditText editTextFraccion1, editTextFraccion2;
    private Button btnSumarFracciones;
    private TextView textViewResultadoFraccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Inicializar vistas
        editTextFraccion1 = findViewById(R.id.editTextFraccion1);
        editTextFraccion2 = findViewById(R.id.editTextFraccion2);
        btnSumarFracciones = findViewById(R.id.btnSumarFracciones);
        textViewResultadoFraccion = findViewById(R.id.textViewResultadoFraccion);

        // Configurar el clic del botón
        btnSumarFracciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarFracciones();
            }
        });
    }

    private void sumarFracciones() {
        // Obtener las fracciones ingresadas como texto
        String fraccion1 = editTextFraccion1.getText().toString();
        String fraccion2 = editTextFraccion2.getText().toString();

        // Verificar si los campos están vacíos
        if (fraccion1.isEmpty() || fraccion2.isEmpty()) {
            textViewResultadoFraccion.setText("Por favor, ingresa ambas fracciones.");
            return;
        }

        // Realizar la lógica de suma de fracciones (puedes implementar tu propia lógica aquí)

        // Mostrar el resultado
        textViewResultadoFraccion.setText("Resultado: " + "tu_resultado_de_suma_de_fracciones");
    }
}

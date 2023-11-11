package com.example.activity_x5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOperation1 = findViewById(R.id.btnOperation1);
        Button btnOperation2 = findViewById(R.id.btnOperation2);
        Button btnOperation3 = findViewById(R.id.btnOperation3);
        Button btnOperation4 = findViewById(R.id.btnOperation4);
        Button btnOperation5 = findViewById(R.id.btnOperation5);


        btnOperation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Inicia la Activity correspondiente
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });

        btnOperation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Inicia la Activity correspondiente
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        btnOperation3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Inicia la Activity correspondiente
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });

        btnOperation4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Inicia la Activity correspondiente
                Intent intent = new Intent(MainActivity.this, Activity4.class);
                startActivity(intent);
            }
        });

        btnOperation5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Inicia la Activity correspondiente
                Intent intent = new Intent(MainActivity.this, Activity5.class);
                startActivity(intent);
            }
        });


    }
}


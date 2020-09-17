package com.example.promedioya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aCantidadNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aCantidadNotas= (Button) findViewById(R.id.calcularProm);
        aCantidadNotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aCantidadNotas = new Intent(MainActivity.this, cantidad_notas.class);
                startActivity (aCantidadNotas);
            }
        });
    }

    public class Cantidad_de_semestres extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }
    }
}
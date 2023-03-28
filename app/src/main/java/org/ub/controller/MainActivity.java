package org.ub.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.ub.controller.models.Serie;

public class MainActivity extends AppCompatActivity  {
    EditText editNumber;
    Button btnGenerar;
    TextView tvMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMostrar = findViewById(R.id.tvMostrar);
        editNumber = findViewById(R.id.editNumber);
        btnGenerar = findViewById(R.id.btnGenerar);

        Serie serie = new Serie();

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cantidad = Integer.valueOf(editNumber.getText().toString());
                String cadena = serie.generarPares(cantidad);
                tvMostrar.setText(cadena);
                Toast.makeText(MainActivity.this, "Hola MAtias", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
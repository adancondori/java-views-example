package org.ub.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ComponentActivity extends AppCompatActivity {

    EditText editPasswordC;
    Button btnMostrarC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        editPasswordC = findViewById(R.id.editPasswordC);
        btnMostrarC = findViewById(R.id.btnMostrarC);

        btnMostrarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Hola Mundo");
                String cadena = editPasswordC.getText().toString();
                System.out.println("VALOR ----> " + cadena);
            }
        });
    }
}
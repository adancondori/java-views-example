package org.ub.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Component3Activity extends AppCompatActivity {

    Button btnMostrarValor;
    EditText editMultilineC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component3);
        btnMostrarValor = findViewById(R.id.btnMostrarValor);
        editMultilineC = findViewById(R.id.editMultilineC);

        btnMostrarValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cadena = editMultilineC.getText().toString();
                System.out.println("Hola Mundo");
                Log.d("univalle", cadena);
                Intent intent = new Intent(Component3Activity.this, MainActivity4.class);
                startActivity(intent);
                //finish();
            }
        });

    }
}
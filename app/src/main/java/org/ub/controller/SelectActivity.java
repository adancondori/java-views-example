package org.ub.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.ub.controller.models.Serie;

public class SelectActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spSerie;
    String[] series = {"Elija un elemento", "Pares", "Impares"};
    Button btnGenerar3;
    EditText editNumber3;
    TextView tvMostrar3;
    int position = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        spSerie = findViewById(R.id.spSerie);
        spSerie.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,series);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spSerie.setAdapter(adapter);
        // ----
        btnGenerar3 = findViewById(R.id.btnGenerar3);
        tvMostrar3 = findViewById(R.id.tvMostrar3);
        editNumber3 = findViewById(R.id.editNumber3);
        Serie serie = new Serie();

        btnGenerar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cantidad = Integer.valueOf(editNumber3.getText().toString());
                String cadena = "";
                switch(position) {
                    case 0:
                        //setContentView(R.layout.xml0);
                        break;
                    case 1:
                        cadena = serie.generarPares(cantidad);
                        break;
                    case 2:
                        cadena = serie.generarImPares(cantidad);
                        break;
                    default:

                        break;
                }
                tvMostrar3.setText(cadena);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        System.out.println("Hola mundo");
        this.position = position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
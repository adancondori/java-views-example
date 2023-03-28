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
import android.widget.Toast;

import org.ub.controller.models.Serie;

public class SeleccionActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener  {

    String[] series = {"Seleccione un elemento","Pares","Impares"};
    Spinner spSeries;
    Button btnGenerar;
    TextView tvNumeros2;
    EditText editNumber2;
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);
        spSeries = findViewById(R.id.spSeries);
        spSeries.setOnItemSelectedListener(this);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,series);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spSeries.setAdapter(adapter);

        // ----
        btnGenerar = findViewById(R.id.btnGenerar2);
        tvNumeros2 = findViewById(R.id.tvNumeros2);
        editNumber2 = findViewById(R.id.editNumber2);

        Serie serie = new Serie();

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cantidad = Integer.valueOf(editNumber2.getText().toString());
                String cadena = "";
                switch(posicion) {
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
                tvNumeros2.setText(cadena);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        String aux = series[position];
        System.out.println(aux);
        posicion = position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
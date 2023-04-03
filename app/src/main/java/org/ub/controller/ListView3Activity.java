package org.ub.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


import org.ub.controller.models.Serie;

import java.util.ArrayList;
import java.util.List;

public class ListView3Activity extends AppCompatActivity {

    List<String> list = new ArrayList<>();
    EditText edit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view3);

        ListView listView3 = findViewById(R.id.listView3);

        edit3 = findViewById(R.id.edit3);


        ArrayAdapter arrayAdapter = new ArrayAdapter(ListView3Activity.this,
                android.R.layout.simple_list_item_1,
                list);
        listView3.setAdapter(arrayAdapter);


        list.add("Pares");
        list.add("Impares");
        list.add("Otros 1");
        list.add("Otres 2");

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                int cantidad = Integer.valueOf(edit3.getText().toString());
                Serie serie = new Serie();
                String cadena = "";
                if (position == 0) {
                     cadena = serie.generarPares(cantidad);
                } else if (position == 1) {
                     cadena = serie.generarImPares(cantidad);
                }
                Toast.makeText(ListView3Activity.this,cadena,Toast.LENGTH_LONG).show();

            }
        });
    }
}
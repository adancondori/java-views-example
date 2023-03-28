package org.ub.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class ListViewSimpleActivity extends AppCompatActivity {

    List<String> list = new ArrayList<>();
    EditText editNuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simple);
        list.add("Pares");
        list.add("Impares");
        list.add("ejercicio 3");
        list.add("ejercicio 4");

        ListView listView = findViewById(R.id.listview);
        editNuevo = findViewById(R.id.editNuevo);

        ArrayAdapter adapter = new ArrayAdapter(ListViewSimpleActivity.this,
                android.R.layout.simple_list_item_1,
                list);
        listView.setAdapter(adapter);
        Serie serie = new Serie();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                int cantidad = Integer.valueOf(editNuevo.getText().toString());
                String cadena = "";
                if(position==0){
                    //clicked apple
                    cadena = serie.generarPares(cantidad);
                    Toast.makeText(ListViewSimpleActivity.this,cadena,Toast.LENGTH_LONG).show();
                    //startActivity(new Intent(ListViewSimpleActivity.this,AppleActivity.class));
                }else if(position==1){
                    //clicked orange
                    //startActivity(new Intent(ListViewSimpleActivity.this,OrangeActivity.class));
                }else{

                }
            }
        });

    }
}
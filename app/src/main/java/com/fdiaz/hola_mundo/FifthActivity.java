package com.fdiaz.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class FifthActivity extends AppCompatActivity {

    private ListView lv1;
    private ArrayList<String> names;
    private TextView estaado;
    private Spinner spinner1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        lv1 = (ListView) findViewById(R.id.lv1);

        names = new ArrayList<String>();
        names.add("Veracruz");
        names.add("Tabasco");
        names.add("Chiapas");
        names.add("Campeche");
        names.add("Veracruz");
        names.add("Tabasco");
        names.add("Chiapas");
        names.add("Campeche");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        lv1.setAdapter(adapter);

        spinner1 = (Spinner) findViewById(R.id.spinner1);

        String [] opciones = {"opcion 1", "opcion 2", "opcion 3", "opcion 4", "opcion 5"};

        ArrayAdapter <String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);

        spinner1.setAdapter(adapter1);







    }

    
}
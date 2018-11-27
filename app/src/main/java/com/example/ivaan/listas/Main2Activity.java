package com.example.ivaan.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ListView lista;
    private List<Alumnos> alumnosclase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lista = (ListView) findViewById(R.id.alumnos2);
        alumnosclase = new ArrayList<Alumnos>();
        alumnosclase.add(new Alumnos("Paloma","paloma@gmail.com",""));
        alumnosclase.add(new Alumnos("Ivan","ivan@gmail.com",""));
        alumnosclase.add(new Alumnos("Jorge","jorge@gmail.com",""));
        alumnosclase.add(new Alumnos("Alex","alex@gmail.com",""));
        alumnosclase.add(new Alumnos("Pepe","pepe@gmail.com",""));
        alumnosclase.add(new Alumnos("Laura","laura@gmail.com",""));
        alumnosclase.add(new Alumnos("Javier","javier@gmail.com",""));
        alumnosclase.add(new Alumnos("Roberto","roberto@gmail.com",""));
        alumnosclase.add(new Alumnos("Carlos","carlos@gmail.com",""));

        Adaptador adaptador= new Adaptador(this,
                R.layout.activity_alumno_item,
                alumnosclase
        );

        lista.setAdapter(adaptador);
    }
}

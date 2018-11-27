package com.example.ivaan.listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {

    private ListView lista;
    private List<String> alumnosclase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.alumnos);
        alumnosclase = new ArrayList<String>();
        alumnosclase.add("Maria");
        alumnosclase.add("Jose");
        alumnosclase.add("Victor");
        alumnosclase.add("Jorge");
        alumnosclase.add("Paula");
        alumnosclase.add("Ivan");
        alumnosclase.add("Laura");
        alumnosclase.add("Pipe");
        alumnosclase.add("Alvaro");
        alumnosclase.add("Alex");
        alumnosclase.add("Marcos");
        alumnosclase.add("Antonio");
        alumnosclase.add("Miguel");

        ArrayAdapter<String> adaptadorclase= new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                alumnosclase
        );

        lista.setAdapter(adaptadorclase);
        lista.setOnItemClickListener(this);

    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"El alumno pulsado es: "+ alumnosclase.get(position),Toast.LENGTH_SHORT).show();

        Intent main2 = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(main2);
    }

    @Override
    public void onClick(View v) {


    }
}

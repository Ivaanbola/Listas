package com.example.ivaan.listas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import java.util.List;

public class Adaptador extends ArrayAdapter<Alumnos> {

    Context ctx;
    int layaoutTemplate;
    List<Alumnos> alumnosList;

    public Adaptador(@NonNull Context context, int resource, @NonNull List<Alumnos> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.layaoutTemplate = resource;
        this.alumnosList = objects;
    }


    public View getView(int position, @Nullable View convView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layaoutTemplate, parent, false);

        //Obtener la informacion del elemento de la lista que estoy iterando en el momento
        Alumnos elemAlumnos = alumnosList.get(position);

        //Rescatar los elementos de la UI de la template
        TextView textnombre = (TextView) v.findViewById(R.id.nombre);
        TextView textmail = (TextView) v.findViewById(R.id.email);
        ImageView imagefoto = (ImageView) v.findViewById(R.id.foto);


        //Hacer un set de la info del elemento en los elementos de la UI
        textnombre.setText(elemAlumnos.getNombre());
        textmail.setText(elemAlumnos.getMail());

        if(!elemAlumnos.getFoto().isEmpty()){
            Glide.with(ctx).
                    load(elemAlumnos.getFoto()).
                    into(imagefoto);
        }

        return v;
    }

}

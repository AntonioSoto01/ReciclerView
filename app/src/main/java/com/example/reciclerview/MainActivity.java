package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recView;
private ArrayList<Titular> datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recView=findViewById(R.id.recycler);
        datos=new ArrayList<Titular>();
        for(int i=0;i<50;i++) {
            datos.add(new Titular("Titulo" + i, "Subtitulo item" + i));
        }
            final AdaptadorTitulares adaptador=new AdaptadorTitulares(datos);
            recView.setHasFixedSize(true);
            recView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
            recView.setAdapter(adaptador);
        adaptador.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("MiApp","Pulsado"+recView.getChildAdapterPosition(v));

            }
        });
    }

}
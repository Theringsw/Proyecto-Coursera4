package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mascotas.adapter.AdaptadorMascota;
import com.example.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    private RecyclerView recicladorFav;
    private RecyclerView.LayoutManager layoutManagerFav;
    private RecyclerView.Adapter recyclerAdapterFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSub);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Favoritos.this, "Regresando", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Favoritos");

        ArrayList<Mascota> datosFav = new ArrayList<Mascota>();

        datosFav.add(new Mascota(R.drawable.a196t5in, "Uno",     0xFF10D94C));
        datosFav.add(new Mascota(R.drawable.ctyk9rzj, "Dos",      0xFF7a355b));
        datosFav.add(new Mascota(R.drawable.dpannzlo, "Tres",      0xFF426989));
        datosFav.add(new Mascota(R.drawable.ph7ux9yg, "Cuatro",  0xFF00FF00));
        datosFav.add(new Mascota(R.drawable.zzh05eaj, "Cinco",  0xFF45694C));

        recicladorFav = (RecyclerView) findViewById(R.id.ReciclerView_RecicladorFavorito);
        layoutManagerFav = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recicladorFav.setLayoutManager(layoutManagerFav);

        recyclerAdapterFav = new AdaptadorMascota(datosFav);
        recicladorFav.setAdapter(recyclerAdapterFav);

    }
}
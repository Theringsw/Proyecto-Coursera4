package com.example.mascotas.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mascotas.R;
import com.example.mascotas.adapter.AdaptadorMascota;
import com.example.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter recyclerAdapter;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        ArrayList<Mascota> datos = new ArrayList<Mascota>();

        datos.add(new Mascota(R.drawable.a196t5in, "Uno", 0xFF00FF00));
        datos.add(new Mascota(R.drawable.ctyk9rzj, "Dos", 0xFFa8285c));
        datos.add(new Mascota(R.drawable.dpannzlo, "Tres", 0xFF10D94C));
        datos.add(new Mascota(R.drawable.ph7ux9yg, "Cuatro", 0xFF45694C));
        datos.add(new Mascota(R.drawable.zzh05eaj, "Cinco", 0xFF426989));
        reciclador = (RecyclerView) v.findViewById(R.id.ReciclerView_Reciclador);
        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(layoutManager);

        recyclerAdapter = new AdaptadorMascota(datos);
        reciclador.setAdapter(recyclerAdapter);
        return v;
    }
}

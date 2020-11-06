package com.example.mascotas.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mascotas.adapter.AdaptadorPerfil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mascotas.R;
import com.example.mascotas.pojo.Perfil;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {
    public ArrayList<Perfil> datos;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        //ReciclerView
        datos = new ArrayList<Perfil>();
        datos.add(new Perfil(R.drawable.zzh05eaj,2));
        datos.add(new Perfil(R.drawable.dpannzlo,7));
        datos.add(new Perfil(R.drawable.ctyk9rzj,5));
        datos.add(new Perfil(R.drawable.ph7ux9yg,1));
        datos.add(new Perfil(R.drawable.ph7ux9yg,8));
        datos.add(new Perfil(R.drawable.ph7ux9yg,3));
        datos.add(new Perfil(R.drawable.ctyk9rzj,12));
        datos.add(new Perfil(R.drawable.ph7ux9yg,20));
        datos.add(new Perfil(R.drawable.ctyk9rzj,14));
        datos.add(new Perfil(R.drawable.zzh05eaj, 8));
        datos.add(new Perfil(R.drawable.dpannzlo, 3));
        datos.add(new Perfil(R.drawable.zzh05eaj, 12));
        datos.add(new Perfil(R.drawable.zzh05eaj,7));
        datos.add(new Perfil(R.drawable.ctyk9rzj,5));
        datos.add(new Perfil(R.drawable.ctyk9rzj,1));

        RecyclerView reciclador = (RecyclerView) v.findViewById(R.id.RecyclerView_gridPerfil);
        GridLayoutManager gridPerfil = new GridLayoutManager(getActivity(), 3);
        gridPerfil.setOrientation(GridLayoutManager.VERTICAL);
        reciclador.setLayoutManager(gridPerfil);
        AdaptadorPerfil recyclerAdapter = new AdaptadorPerfil(datos);
        reciclador.setAdapter(recyclerAdapter);

        return v;
    }
}

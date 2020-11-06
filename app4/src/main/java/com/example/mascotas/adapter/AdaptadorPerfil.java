package com.example.mascotas.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import com.example.mascotas.R;
import com.example.mascotas.pojo.Perfil;

import java.util.ArrayList;

public class AdaptadorPerfil extends RecyclerView.Adapter<AdaptadorPerfil.perfilViewHolder> {

    private ArrayList<Perfil> item;

    public AdaptadorPerfil(ArrayList<Perfil> item) {
        this.item = item;
    }

    @Override
    public perfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.perfil_cardview, parent, false);
        perfilViewHolder perfil = new perfilViewHolder(v);
        return perfil;
    }

    @Override
    public void onBindViewHolder(perfilViewHolder holder, int position) {
        holder.foto.setImageResource(item.get(position).getFoto());
        holder.meGusta.setText(String.valueOf(item.get(position).getMeGusta()));
    }

    @Override
    public int getItemCount() {
        return this.item.size();
    }

    public class perfilViewHolder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView meGusta;

        public perfilViewHolder(View itemView) {
            super(itemView);
            foto = (ImageView) itemView.findViewById(R.id.ImageView_fotoPerfil);
            meGusta = (TextView) itemView.findViewById(R.id.TextView_meGusta);
        }
    }
}
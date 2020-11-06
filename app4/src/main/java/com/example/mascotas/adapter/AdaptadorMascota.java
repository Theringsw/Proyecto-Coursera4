package com.example.mascotas.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mascotas.pojo.Mascota;
import com.example.mascotas.R;

import java.util.ArrayList;

public class AdaptadorMascota extends RecyclerView.Adapter<ViewHoldermascota> {

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptador_mascota);
*/
        private ArrayList<Mascota> item;

        public AdaptadorMascota(ArrayList<Mascota> item){
            this.item = item;
        }


        @Override
        public ViewHoldermascota onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascota_cardview,parent,false);
            ViewHoldermascota mascota = new ViewHoldermascota(v);
            return mascota;
        }

    @Override
        public void onBindViewHolder(ViewHoldermascota mascotaHolder, int position) {
            mascotaHolder.nombre.setText(this.item.get(position).getNombre());
            mascotaHolder.foto.setImageResource(this.item.get(position).getFoto());
            mascotaHolder.foto.setBackgroundColor(this.item.get(position).getColor());
        }

        @Override
        public int getItemCount() {
            return this.item.size();
        }
    }

package com.example.mascotas.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mascotas.R;

public class ViewHoldermascota extends RecyclerView.ViewHolder {
    public  TextView nombre;
    public ImageView foto;

    public ViewHoldermascota(View itemView) {
        super(itemView);
        nombre = (TextView) itemView.findViewById(R.id.TextView_Nombre);
        foto = (ImageView) itemView.findViewById(R.id.ImageViewMascota);
    }
}

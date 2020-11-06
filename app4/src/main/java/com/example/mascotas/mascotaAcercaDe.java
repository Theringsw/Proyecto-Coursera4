package com.example.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class mascotaAcercaDe extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota_acerca_de);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSub);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mascotaAcercaDe.this, "Regresando", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}
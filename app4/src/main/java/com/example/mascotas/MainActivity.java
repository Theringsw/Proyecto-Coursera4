package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import com.example.mascotas.adapter.AdaptadorMascota;
import com.example.mascotas.adapter.AdaptadorPagina;
import com.example.mascotas.fragment.PerfilFragment;
import com.example.mascotas.fragment.RecyclerViewFragment;
import com.example.mascotas.pojo.Mascota;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.barraSub);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

        if(toolbar != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Mi FloatingActionButton haciendo una accion",Snackbar.LENGTH_LONG).setAction("Accion", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.menuActionContacto){
            startActivity(new Intent(this, mascotaContacto.class));
            return true;
        }

        if(id == R.id.menuActionAcercaDe){
            startActivity(new Intent(this, mascotaAcercaDe.class));
            return true;
        }

        if(id == R.id.menuActionFavorito){
            startActivity(new Intent(MainActivity.this, Favoritos.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new AdaptadorPagina(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_mascotas);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_perfil);
    }
}
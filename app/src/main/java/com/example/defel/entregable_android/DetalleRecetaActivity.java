package com.example.defel.entregable_android;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleRecetaActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_receta);

        Intent unIntent = getIntent();
        Bundle unBundle = unIntent.getExtras();
        DetalleRecetaFragment detalleRecetaFragment = new DetalleRecetaFragment();
        pegarFragment(detalleRecetaFragment);
        detalleRecetaFragment.setArguments(unBundle);



    }

    public void pegarFragment(Fragment fragmentDetalle) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedor2, fragmentDetalle).commit();


    }


}

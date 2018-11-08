package com.example.defel.entregable_android;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements RecetasFragment.ListenerRecyclerViewFragment{

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Home_Fragment fragmentHome = new Home_Fragment();
        pegarFragment(fragmentHome);


        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawerlayout);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {


                    case R.id.item_recetas:
                        FragmentManager supportFragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.contenedor, new RecetasFragment()).commit();

                        break;
                    case R.id.item_about_us:
                        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction2 = supportFragmentManager2.beginTransaction();
                        fragmentTransaction2.replace(R.id.contenedor, new AboutUsFragment()).commit();

                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Opción inválida", Toast.LENGTH_SHORT).show();
                        break;
                }
                drawerLayout.closeDrawers();

                return false;
            }
        });




    }

    public void pegarFragment(Fragment fragmentHome) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedor, fragmentHome).commit();


    }


    @Override
    public void informarSeleccion(Receta receta) {

        Intent intent = new Intent(this,DetalleRecetaActivity.class);

        Bundle bundle = new Bundle();

        bundle.putSerializable(DetalleRecetaActivity.KEY_RECETA,receta);

        intent.putExtras(bundle);
        startActivity(intent);


    }
}
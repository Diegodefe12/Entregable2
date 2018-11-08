package com.example.defel.entregable_android;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecetasFragment extends Fragment  implements RecetaAdapter.ListenerRecetasAdapter{

    private RecyclerView recyclerViewRecetas;
    private ListenerRecyclerViewFragment listenerRecyclerViewFragment;



    public RecetasFragment() {
        // Required empty public constructor
    }

    public void onAttach(Context context){
        super.onAttach(context);
        this.listenerRecyclerViewFragment = (ListenerRecyclerViewFragment) context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recetas, container, false);

        recyclerViewRecetas = view.findViewById(R.id.recyclerViewRecetas);
        List<Receta> recetas = cargarRecetas();

        RecetaAdapter recetasAdapter = new RecetaAdapter(recetas,this);
        //creamos el layoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerViewRecetas.setLayoutManager(linearLayoutManager);
        recyclerViewRecetas.setAdapter(recetasAdapter);
        recyclerViewRecetas.setHasFixedSize(true);


    return view;
    }
    private List<Receta> cargarRecetas() {
        List<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta(R.drawable.tiramisu,"Tiramisu", "lalala", "lalala"));
        recetas.add(new Receta(R.drawable.chocotorta,"Chocotorta", "lalala", "lalala"));
        recetas.add(new Receta(R.drawable.flan,"Flan", "lalala", "lalala"));


        return recetas;
    }

    @Override
    public void informarSeleccionado(Receta receta) {
        listenerRecyclerViewFragment.informarSeleccion(receta);

    }

    public interface ListenerRecyclerViewFragment {
        public void informarSeleccion (Receta receta);
    }

}

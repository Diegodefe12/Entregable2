package com.example.defel.entregable_android;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class RecetaAdapter extends RecyclerView.Adapter {
    private List<Receta> listaDeRecetas;
    private ListenerRecetasAdapter listenerRecetasAdapter;

    public RecetaAdapter(List<Receta> listaDeRecetas,ListenerRecetasAdapter listenerRecetasAdapter) {
        this.listaDeRecetas = listaDeRecetas;
        this.listenerRecetasAdapter = listenerRecetasAdapter;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View viewCelda = inflador.inflate(R.layout.celda_receta,parent,false);
        RecetaViewHolder recetaViewHolder = new RecetaViewHolder(viewCelda);
        return recetaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    Receta receta = listaDeRecetas.get(position);
    RecetaViewHolder recetaViewHolder = (RecetaViewHolder) holder;
    recetaViewHolder.bind(receta);


    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }

    private class RecetaViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewFoto;
        private TextView textViewTitulo;
        private TextView textViewIngredientes;
        private TextView textViewPreparacion;
        private Receta receta;


        public RecetaViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageViewFoto = itemView.findViewById(R.id.celdaReceta_ImageView_foto);
            this.textViewTitulo = itemView.findViewById(R.id.celdaReceta_TextView_titulo);
            this.textViewIngredientes = itemView.findViewById(R.id.celdaReceta_TextView_ingredientes);
            this.textViewPreparacion = itemView.findViewById(R.id.celdaReceta_TextView_preparacion);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listenerRecetasAdapter.informarSeleccionado(receta);

                }
            });
        }

        public void bind (Receta unaReceta){
            this.receta = unaReceta;
            imageViewFoto.setImageResource(unaReceta.getFoto());
            textViewTitulo.setText(unaReceta.getTitulo());
            textViewIngredientes.setText(unaReceta.getIngredientes());
            
        }
    }
    public interface ListenerRecetasAdapter{
        public void informarSeleccionado(Receta receta);
    }
}

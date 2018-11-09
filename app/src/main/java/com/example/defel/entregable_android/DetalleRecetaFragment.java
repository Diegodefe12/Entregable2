package com.example.defel.entregable_android;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleRecetaFragment extends Fragment {

    public static final String KEY_RECETA = "object_receta";

    private ImageView imageViewFoto;
  //  private TextView textViewTitulo, textViewIngredientes, textViewPreparacion;



    public DetalleRecetaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vistaDelFragment = inflater.inflate(R.layout.fragment_detalle_receta, container, false);



        ImageView imageViewFoto = vistaDelFragment.findViewById(R.id.detalleFragment_ImageView_foto);
        TextView textViewTitulo = vistaDelFragment.findViewById(R.id.detalleFragment_TextView_titulo);
        TextView textViewIngredientes = vistaDelFragment.findViewById(R.id.detalleFragment_TextView_ingredientes);
        TextView textViewPreparacion = vistaDelFragment.findViewById(R.id.detalleFragment_TextView_preparacion);

        Bundle bundle = getArguments();
        Receta receta = (Receta) bundle.getSerializable(KEY_RECETA);

        imageViewFoto.setImageResource(receta.getFoto());
        textViewTitulo.setText(receta.getTitulo());
        textViewIngredientes.setText(receta.getIngredientes());
        textViewPreparacion.setText(receta.getPreparacion());


        return vistaDelFragment;




   }

}

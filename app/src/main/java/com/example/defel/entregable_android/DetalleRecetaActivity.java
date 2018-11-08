package com.example.defel.entregable_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleRecetaActivity extends AppCompatActivity {
    public static final String KEY_RECETA = "object_receta";
    private ImageView imageViewFoto;
    private TextView textViewTitulo, textViewIngredientes, textViewPreparacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_receta);

        imageViewFoto = findViewById(R.id.detalleActivity_ImageView_foto);
        textViewTitulo = findViewById(R.id.detalleActivity_TextView_titulo);
        textViewIngredientes = findViewById(R.id.detalleActivity_TextView_ingredientes);
        textViewPreparacion = findViewById(R.id.detalleActivity_TextView_preparacion);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Receta receta = (Receta) bundle.getSerializable(KEY_RECETA);

        imageViewFoto.setImageResource(receta.getFoto());
        textViewTitulo.setText(receta.getTitulo());
        textViewIngredientes.setText(receta.getIngredientes());
        textViewPreparacion.setText(receta.getPreparacion());


    }


}

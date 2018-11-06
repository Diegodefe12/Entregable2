package com.example.defel.entregable_android;

public class Receta {
    private Integer foto;
    private String titulo;
    private String ingredientes;
    private String preparacion;


    public Receta() {
    }

    public Receta(Integer foto, String titulo, String ingredientes, String preparacion) {
        this.foto = foto;
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}

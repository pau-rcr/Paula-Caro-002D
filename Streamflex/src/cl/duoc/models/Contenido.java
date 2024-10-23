/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
abstract class Contenido {
    private String codigo;
    private String titulo;
    private boolean esRecomendado;

    public Contenido() {}

    public Contenido(String codigo, String titulo, boolean esRecomendado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.esRecomendado = esRecomendado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEsRecomendado() {
        return esRecomendado;
    }

    public void setEsRecomendado(boolean esRecomendado) {
        this.esRecomendado = esRecomendado;
    }

    public abstract void mostrarDetalles();
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Contenido {
    private double calificacion;
    private int duracion;

    public Pelicula() {}

    public Pelicula(String codigo, String titulo, boolean esRecomendado, double calificacion, int duracion) {
        super(codigo, titulo, esRecomendado);
        this.calificacion = calificacion;
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Pelicula: " + getTitulo() + " (" + getCodigo() + "), Calificacion: " + calificacion + ", Duracion: " + duracion + " minutos");
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenido {
    private int duracion;
    private String enfoqueEducativo;

    public Documental() {}

    public Documental(String codigo, String titulo, boolean esRecomendado, int duracion, String enfoqueEducativo) {
        super(codigo, titulo, esRecomendado);
        this.duracion = duracion;
        this.enfoqueEducativo = enfoqueEducativo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEnfoqueEducativo() {
        return enfoqueEducativo;
    }

    public void setEnfoqueEducativo(String enfoqueEducativo) {
        this.enfoqueEducativo = enfoqueEducativo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo() + " (" + getCodigo() + "), Duracion: " + duracion + " minutos, Enfoque: " + enfoqueEducativo);
    }
}

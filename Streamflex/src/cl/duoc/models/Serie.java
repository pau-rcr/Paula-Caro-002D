/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenido {
    private int temporadas;
    private boolean estaFinalizada;

    public Serie() {}

    public Serie(String codigo, String titulo, boolean esRecomendado, int temporadas, boolean estaFinalizada) {
        super(codigo, titulo, esRecomendado);
        this.temporadas = temporadas;
        this.estaFinalizada = estaFinalizada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isEstaFinalizada() {
        return estaFinalizada;
    }

    public void setEstaFinalizada(boolean estaFinalizada) {
        this.estaFinalizada = estaFinalizada;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Serie: " + getTitulo() + " (" + getCodigo() + "), Temporadas: " + temporadas + ", Finalizada: " + (estaFinalizada ? "Si" : "No"));
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */

public class Plataforma implements Suscripcion {
    private List<Contenido> contenidos;
    private List<String> usuarios;

    public Plataforma() {
        contenidos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public boolean agregarContenido(Contenido contenido) {
        for (Contenido c : contenidos) {
            if (c.getCodigo().equals(contenido.getCodigo())) {
                return false; 
            }
        }
        contenidos.add(contenido);
        return true;
    }

    public void listarContenido() {
        for (Contenido c : contenidos) {
            c.mostrarDetalles();
        }
    }

    public void agregarUsuario(String usuario) {
        usuarios.add(usuario);
    }

    public int getTotalUsuarios() {
        return usuarios.size();
    }

    public int getTotalContenidos() {
        return contenidos.size();
    }

    @Override
    public double calcularCostoSuscripcion() {
        double costo = COSTO_BASE_SUSCRIPCION;
        for (Contenido c : contenidos) {
            if (c instanceof Pelicula) {
                Pelicula p = (Pelicula) c;
                if (p.getCalificacion() > 4.5) {
                    costo += COSTO_BASE_SUSCRIPCION * 0.10;
                }
            } else if (c instanceof Serie) {
                Serie s = (Serie) c;
                if (s.getTemporadas() > 3 && !s.isEstaFinalizada()) {
                    costo += COSTO_BASE_SUSCRIPCION * 0.08;
                }
            } else if (c instanceof Documental) {
                Documental d = (Documental) c;
                if (d.getDuracion() > 90) {
                    costo -= COSTO_BASE_SUSCRIPCION * 0.05;
                }
            }
        }
        return costo;
    }
}
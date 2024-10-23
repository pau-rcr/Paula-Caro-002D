/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflex;
import cl.duoc.models.Plataforma;
import cl.duoc.models.Pelicula;
import cl.duoc.models.Serie;
import cl.duoc.models.Documental;

/**
 *
 * @author Cetecom
 */
public class StreamFlexApp {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Pelicula p1 = new Pelicula("P001", "Inception", true, 4.6, 148);
        Pelicula p2 = new Pelicula("P002", "The Matrix", false, 4.4, 136);
        Pelicula p3 = new Pelicula("P003", "Interstellar", true, 4.7, 169);
        Serie s1 = new Serie("S001", "Breaking Bad", true, 5, true);
        Serie s2 = new Serie("S002", "Stranger Things", true, 4, false);
        Documental d1 = new Documental("D001", "Planet Earth", true, 120, "Naturaleza");
        Documental d2 = new Documental("D002", "Cosmos", false, 60, "Espacio");

        plataforma.agregarContenido(p1);
        plataforma.agregarContenido(p2);
        plataforma.agregarContenido(p3);
        plataforma.agregarContenido(s1);
        plataforma.agregarContenido(s2);
        plataforma.agregarContenido(d1);
        plataforma.agregarContenido(d2);

        plataforma.listarContenido();
         System.out.println("Cantidad total de contenidos: " + plataforma.getTotalContenidos());

        plataforma.agregarUsuario("Usuario1");
        plataforma.agregarUsuario("Usuario2");
        plataforma.agregarUsuario("Usuario3");
        plataforma.agregarUsuario("Usuario4");
        plataforma.agregarUsuario("Usuario5");

        System.out.println("Total usuarios suscritos: " + plataforma.getTotalUsuarios());
        System.out.println("Costo mensual de suscripcion: $" + plataforma.calcularCostoSuscripcion());
    }
}

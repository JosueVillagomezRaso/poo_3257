/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_composicion;

import dt.libro.Libro;
import ico.fes.datos.Autor;
import ico.fes.datos.Editorial;

/**
 *
 * @author Josuel
 */
public class Tarea_composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l1 = new Libro();
        System.out.println(l1);
        Libro l2 = new Libro("Maus", "Novela gráfica", 
                new Autor("Art Spiegelman", 1948), 
                new Editorial("Apex Novelties", 1977));
        System.out.println(l2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_herencia;

import ico.fes.poo.Electrodomestico;
import ico.fes.poo.Licuadora;
import ico.fes.poo.Refrigerador;

/**
 *
 * @author Josuel
 */
public class Tarea_herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico elc1 = new Electrodomestico("Koblenz", "Limpieza", 0.675f, true);
        System.out.println(elc1);
        
        Refrigerador rf1 = new Refrigerador(true, true, 1.68f, 57, "Mabe", "Cocina", 69f, true);
        System.out.println(rf1);
        rf1.abrir();
        rf1.cerrar();
        
        Licuadora li1 = new Licuadora("Vidrio", 7, 62f, 25000, "Philips", "Cocina", 0.3f, true);
        System.out.println(li1);
        li1.licuar();
        li1.velocidad();
    }
    
}

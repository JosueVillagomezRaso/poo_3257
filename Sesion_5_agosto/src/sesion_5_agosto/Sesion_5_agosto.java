/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_5_agosto;

import ico.fes.poo.Automovil;

/**
 *
 * @author Josuel
 */
public class Sesion_5_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miCarro =  new Automovil();
        miCarro.marca="Vw";
        miCarro.marca="Golf";
        miCarro.modelo=1990;
        miCarro.color="Gris";
        miCarro.avanzar(100);
    }
    
}

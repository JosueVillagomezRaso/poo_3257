/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_17_agosto;

import ico.fes.poo.Vehiculo;
import ico.fes.poo.VehiculoTerrestre;

/**
 *
 * @author Josuel
 */
public class Sesion_17_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Motorizado con adaptación a bicicleta", "BMX", "Metal");
        System.out.println(v1);
        Vehiculo v2 = new Vehiculo("Volador", "Desconocido", "Madera");
        System.out.println(v2);
        VehiculoTerrestre vt1 = new VehiculoTerrestre();
        System.out.println(vt1);
        vt1.usar();
        VehiculoTerrestre vt2 = new VehiculoTerrestre(0, "210");
        vt2.setDescripcion("Vehiculo semideportivo");
        vt2.setFabricante("Mazda co.");
        vt2.setMaterial("Metal y fibra de vidrio");
        System.out.println(vt2);        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_21_agosto;

import ico.fes.poo.Circulo;
import ico.fes.poo.Cuadrado;
import ico.fes.poo.Figura;

/**
 *
 * @author Josuel
 */
public class Sesion_21_agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.calcularArea();
        Cuadrado d1 = new Cuadrado(5, 10);
        int rest = d1.calcularArea();
        System.out.println("Area de cuadrado = " + rest);
        int opcion = 0;
        //capturar opcion
        switch (opcion) {
            case Figura.CIRCULO:
                System.out.println("Circulo");
                break;
            case Figura.CUADRADO:
                System.out.println("Cuadrado");
                break;
            case Figura.TRIANGULO:
                System.out.println("Triangulo");
                break;    
            default:
                throw new AssertionError();
        }
    }
    
}

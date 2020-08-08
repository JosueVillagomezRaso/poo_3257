/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_smartphone;

import ico.fes.poo.Smartphone;

/**
 *
 * @author Josuel
 */
public class Tarea_smartphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Smartphone cel = new Smartphone();
        cel.setMarca("Huawei");
        cel.setModelo("P30");
        cel.setColor("Azul");
        cel.setTamaño(7);
        System.out.println(cel);
        cel.llamar();
        cel.mensaje();
        cel.internet();
    }
        
}


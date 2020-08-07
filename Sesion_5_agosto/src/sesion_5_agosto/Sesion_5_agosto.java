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
        //miCarro.marca="VW";
        //miCarro.subMarca="Golf";
        //miCarro.modelo=1990;
        //miCarro.color="Gris";
        miCarro.setMarca("VW");
        miCarro.setSubMarca("Golf");
        miCarro.setModelo(1990);
        miCarro.setColor("Gris");
        System.out.println(miCarro);
        float x = miCarro.avanzar(1000);
        System.out.println("Avanzados = "+ x);
                
        Automovil miCarroDos = new Automovil();
        //miCarroDos.marca="Ford";
        //miCarroDos.subMarca="Mustang";
        //miCarroDos.modelo=2010;
        //miCarroDos.color="Amarillo";
        miCarroDos.setMarca("Ford");
        miCarroDos.setSubMarca("Mustang");
        miCarroDos.setModelo(2010);
        miCarroDos.setColor("Amarillo");
        System.out.println(miCarroDos);
        System.out.println("Avanzados = " + miCarroDos.avanzar(500) ); 
                
        Automovil miCarroTres = new Automovil();
        //miCarroTres.marca="Accura";
        //miCarroTres.subMarca="NSX";
        //miCarroTres.modelo=2013;
        //miCarroTres.color="Gris";
        miCarroTres.setMarca("Accura");
        miCarroTres.setSubMarca("NSX");
        miCarroTres.setModelo(2013);
        miCarroTres.setColor("Gris");
        System.out.println(miCarroTres);
        System.out.println("Avanzados = " + miCarroTres.avanzar(500) );
                  
        System.out.println(miCarro.toString());
    }
    
}

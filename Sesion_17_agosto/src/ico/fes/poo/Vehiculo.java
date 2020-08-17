/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author Josuel
 */
public class Vehiculo {
    private String descripcion;
    private String fabricante;
    private String material;

    public Vehiculo() {
    }

    public Vehiculo(String descripcion, String fabricante, String material) {
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.material = material;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return "Vehiculo (" + "descripcion = " + descripcion + ", fabricante = " + fabricante + ")";
    }
    
    public void usar(){
        System.out.println("Utilizando el vehiculo "+ descripcion);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}

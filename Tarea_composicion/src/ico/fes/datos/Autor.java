/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.datos;

/**
 *
 * @author Josuel
 */
public class Autor {
    private String nombre;
    private int nacimiento;

    public Autor() {
    }

    public Autor(String nombre, int nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "(" + "nombre = " + nombre + ", fecha de nacimiento = " + nacimiento + ")";
    }
    
    
    
}

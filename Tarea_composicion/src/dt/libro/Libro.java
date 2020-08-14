/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dt.libro;

import ico.fes.datos.Autor;
import ico.fes.datos.Editorial;

/**
 *
 * @author Josuel
 */
public class Libro {
    private String nombre;
    private String genLiterario;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String nombre, String genLiterario, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.genLiterario = genLiterario;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenLiterario() {
        return genLiterario;
    }

    public void setGenLiterario(String genLiterario) {
        this.genLiterario = genLiterario;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Datos del libro (" + "nombre = " + nombre + ", genero literario = " + genLiterario + ", autor = " + autor + ", editorial = " + editorial + ")";
    }
    
    
}

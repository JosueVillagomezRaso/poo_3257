/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Josuel
 */
public class Teclado {
    private String marca;
    private int numTeclas;
    private boolean multimedia;

    public Teclado() {
    }

    public Teclado(String marca, int numTeclas, boolean multimedia) {
        this.marca = marca;
        this.numTeclas = numTeclas;
        this.multimedia = multimedia;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numTeclas=" + numTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
}

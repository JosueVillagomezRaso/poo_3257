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
public class Refrigerador extends Electrodomestico{
    private boolean congelador;
    private boolean bateriaRespaldo;
    private float tamañoMetros;
    private int anchoCentimetros;

    public Refrigerador() {
    }

    public Refrigerador(boolean congelador, boolean bateriaRespaldo, float tamañoMetros, int anchoCentimetros) {
        this.congelador = congelador;
        this.bateriaRespaldo = bateriaRespaldo;
        this.tamañoMetros = tamañoMetros;
        this.anchoCentimetros = anchoCentimetros;
    }

    public Refrigerador(boolean congelador, boolean bateriaRespaldo, float tamañoMetros, int anchoCentimetros, String marca, String tipo, float wattsPorHora, boolean motor) {
        super(marca, tipo, wattsPorHora, motor);
        this.congelador = congelador;
        this.bateriaRespaldo = bateriaRespaldo;
        this.tamañoMetros = tamañoMetros;
        this.anchoCentimetros = anchoCentimetros;
    }

    public int getAnchoCentimetros() {
        return anchoCentimetros;
    }

    public void setAnchoCentimetros(int anchoCentimetros) {
        this.anchoCentimetros = anchoCentimetros;
    }

    public boolean isCongelador() {
        return congelador;
    }

    public void setCongelador(boolean congelador) {
        this.congelador = congelador;
    }

    public boolean isBateriaRespaldo() {
        return bateriaRespaldo;
    }

    public void setBateriaRespaldo(boolean bateriaRespaldo) {
        this.bateriaRespaldo = bateriaRespaldo;
    }

    public float getTamañoMetros() {
        return tamañoMetros;
    }

    public void setTamañoMetros(float tamañoMetros) {
        this.tamañoMetros = tamañoMetros;
    }
    
    public void abrir(){
        System.out.println("Abriendo...");
    }
    
    public void cerrar(){
        System.out.println("Cerrando...");
    }

    @Override
    public String toString() {
        return "Refrigerador(" + "congelador = " + congelador + ", bateria de respaldo = " + bateriaRespaldo + ", tamaño en metros = " + tamañoMetros + "m, ancho en centimetros = " + anchoCentimetros + "cm) " + super.toString();
    }
           
}

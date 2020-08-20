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
public class Licuadora extends Electrodomestico {
    private String materialVaso;
    private int numeroVelocidades;
    private float tamañoCentimetros;
    private int rpmMax;

    public Licuadora() {
    }

    public Licuadora(String materialVaso, int numeroVelocidades, float tamañoCentimetros, int rpmMax) {
        this.materialVaso = materialVaso;
        this.numeroVelocidades = numeroVelocidades;
        this.tamañoCentimetros = tamañoCentimetros;
        this.rpmMax = rpmMax;
    }

    public Licuadora(String materialVaso, int numeroVelocidades, float tamañoCentimetros, int rpmMax, String marca, String tipo, float wattsPorHora, boolean motor) {
        super(marca, tipo, wattsPorHora, motor);
        this.materialVaso = materialVaso;
        this.numeroVelocidades = numeroVelocidades;
        this.tamañoCentimetros = tamañoCentimetros;
        this.rpmMax = rpmMax;
    }

    public int getRpmMax() {
        return rpmMax;
    }

    public void setRpmMax(int rpmMax) {
        this.rpmMax = rpmMax;
    }

    public String getMaterialVaso() {
        return materialVaso;
    }

    public void setMaterialVaso(String materialVaso) {
        this.materialVaso = materialVaso;
    }

    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }

    public float getTamañoCentimetros() {
        return tamañoCentimetros;
    }

    public void setTamañoCentimetros(float tamañoCentimetros) {
        this.tamañoCentimetros = tamañoCentimetros;
    }
    
    public void licuar(){
        System.out.println("Licuando...");
    }
    
    public void velocidad(){
        System.out.println("Aumentando velocidad...");
    }

    @Override
    public String toString() {
        return "Licuadora(" + "Material del vaso = " + materialVaso + ", Numero de velocidades = " + numeroVelocidades + ", tamaño en centimetros = " + tamañoCentimetros + ", rpm maximo = " + rpmMax + ") ";
    }
    
    
}

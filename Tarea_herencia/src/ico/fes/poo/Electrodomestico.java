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
public class Electrodomestico {
    private String marca;
    private String tipo; //cocina, limpieza o higiene y belleza
    private float wattsPorHora;
    private boolean motor;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String tipo, float wattsPorHora, boolean motor) {
        this.marca = marca;
        this.tipo = tipo;
        this.wattsPorHora = wattsPorHora;
        this.motor = motor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getWattsPorHora() {
        return wattsPorHora;
    }

    public float setWattsPorHora(float wattsPorHora) {
        this.wattsPorHora = wattsPorHora;
        return 100;
    }
    
    public void encender(){
        System.out.println("Encendiendo...");
    }
    
    public void apagar(){
        System.out.println("Apagando...");
    }

    @Override
    public String toString() {
        return "Electrodomestico(" + "Marca = " + marca + ", Tipo = " + tipo + ", kilowatts por hora=" + wattsPorHora + "kWh, Motor = " + motor + ")";
    }
    
    
}

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
public class Smartphone {
    private String marca;
    private String modelo;
    private String color;
    private int tamaño;
    
    //metodos de acceso
    //Marca
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return this.marca;
    }
    
    //modelo
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    //color
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    
    //tamaño
    public void setTamaño(int mod){
        if(mod >= 4 && mod <= 8){
            this.tamaño=mod;
        }
        else{
            System.out.println("Tamaño no posible");
        }
    }
    public int getTamaño(){
        return this.tamaño;
    }
    
    //Metodos
    public void llamar(){
        System.out.println("Llamando...");
    }
    
    public void mensaje(){
        System.out.println("Mandando mensaje...");
    }
    
    public void internet(){
        System.out.println("Buscando red inalambrica...");
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + ", Modelo: " + this.modelo + ", Color: " + this.color + ", Tamaño en pulgadas: " + this.tamaño;
    }
    
    
}

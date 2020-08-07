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
public class Automovil{
    private String marca;
    private String subMarca;
    private int modelo;
    private String color;
    
    //metodos de acceso
    //Modelo
    public void setModelo(int mod){
        if(mod >= 1914 && mod <=2020){
            this.modelo=mod;
        }
        else{
            System.out.println("Ese modelo esta fuera de rango");
        }
    }
    
    public int getModelo(){
        return this.modelo;
    }
   
   //Marca
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    //SubMarca
    public void setSubMarca(String subMarca){
        this.subMarca=subMarca;
    }
    
    public String getSubMarca(){
        return this.subMarca;
    }
    
    //Color
    public void setColor(String color){
        this.color=color;
    }
    
    public String getColor(){
        return this.color;
    }
    
       public void encender(){
        System.out.println("Encendiendo el auto");
    }
    public void acelerar(){
        System.out.println("Acelerando...");        
    }
    
    public float avanzar(int metros){
        float reales=0.0f;
        reales = (float) Math.random()*(float)metros;
        System.out.println("Avanzando el auto " + this.marca);
        return reales;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + ", SubMarca: " + this.subMarca + ", Modelo: " + this.modelo + ", Color: " + this.color;
    }
    
    
    
    
}

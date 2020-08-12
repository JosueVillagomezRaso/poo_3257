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
public class Foco {
   private String material;
   private String tipo;
   private String marca;
   private boolean led;
   private float precio;

    public Foco() {
    }    

    public Foco(String m) {
        this.material = m;
    }

    public Foco(String material, String tipo, String marca, boolean led, float precio) {
        this.material = material;
        this.tipo = tipo;
        this.marca = marca;
        this.led = led;
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
   public void encender (){
       System.out.println("Encendiendo foco " + this.marca);
   }
   
   public void apagar(){
       System.out.println("Apagando el foco " + this.marca);
   }

    @Override
    public String toString() {
        return "Foco{" + "material=" + material + ", tipo=" + tipo + ", marca=" + marca + ", led=" + led + ", precio=" + precio + '}';
    }
   
   
}

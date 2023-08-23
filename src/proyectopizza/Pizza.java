/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopizza;

/**
 *
 * @author vina
 */
public class Pizza {
    
    private String nombre;
    private String tamano;
    private String masa;
    
    public Pizza()
    {
        
    }
    
    public Pizza(String nombre, String tamano, String masa)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }
    
    //mutadores y accesadores (insert code getter and setter y seleccionar todo)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    
    //toString
    @Override
    public String toString() {
        return "Pizza{" + "nombre=" + nombre + ", tamano=" + tamano + ", masa=" + masa + '}';
    }
    
    
    
    
    
    
    public void preparar()
    {
        System.out.println("Preparando.." + nombre + " de masa: "+masa);
    }
    
    public void calentar()
    {
        System.out.println("Calentando pizza tamano..." + tamano);
    }
}

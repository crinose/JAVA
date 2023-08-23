/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopizza;

/**
 *
 * @author vina
 */
public class Principal {

    public static void main(String[] args) {

        Pizza objPizza1 = new Pizza();

        //objPizza1.nombre = "Pepperoni";
        objPizza1.setNombre("pepperoni");
        //objPizza1.masa = "gruesa";
        objPizza1.setMasa("gruesa");
        //objPizza1.tamano ="grande";
        objPizza1.setTamano("grande");

        Pizza objPizza2 = new Pizza("napolitana", "Kids", "picante");

        //inicio comandos print
        objPizza1.preparar();
        objPizza1.calentar();

        System.out.println("********************");

        objPizza2.preparar();
        objPizza2.calentar();

        System.out.println("********************");

        System.out.println(objPizza1);
        System.out.println(objPizza2);
        System.out.println(objPizza1.getNombre());

        System.out.println("********************");

        System.out.println("Gracias por preferirnos!");
    }

}

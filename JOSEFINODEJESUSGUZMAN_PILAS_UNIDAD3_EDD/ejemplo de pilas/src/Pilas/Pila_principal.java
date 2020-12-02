/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author JOSE
 */
public class Pila_principal {
    public static void main(String[] args) {
        composicion_Pila p=new composicion_Pila();// se crea un objeto de la clase composicion_Pila
        p.ingresarPila();  //llamar el primer metodo ingresar pila
        p.ingresarPila();
        p.ingresarPila();
        p.ingresarPila();
        p.ingresarPila();
        System.out.println("\n la pila ingresada es:");// se introduce el mensaje para mostrar datos
        p.desplegarpila();// se inserta el elemento desplegar pila
    }
}

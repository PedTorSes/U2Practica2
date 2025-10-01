package com.ieschabas;
import java.util.Scanner;

/**
 * Clase en la cual vamos a solicitar un nombre y apellido, vamos a mostrar las iniciales en mayúsculas y separadas por un punto.
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Actividad09 {
        //Introducimos registros
        public static void main(String[] args) {
        Scanner registro = new Scanner(System.in);
        System.out.println("¿Cómo quieres que te llame? ");
        String nombre = registro.nextLine().trim().toUpperCase();
        System.out.println("¿Cuál es tu apellido?");
        String apellido = registro.nextLine().trim().toUpperCase();

        //Sacamos los caracteres
        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);

        //Mostramos en pantalla
        System.out.println("La primer inicial del nombre es: " +inicialNombre);
        System.out.println("La primera inicial del apellido es: " +inicialApellido);
        System.out.println("Las iniciales en conjunto son: " +inicialNombre+ ";"+inicialApellido );
        registro.close();




    }
}

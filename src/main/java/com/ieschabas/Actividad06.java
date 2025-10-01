package com.ieschabas;
import java.util.Scanner;

/**
 * Clase en la cual vamos a solicitar los datos de altura y radio para calcular el volumen de un cilindro
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Actividad06 {
    // Solicitud de datos

    /**
     * Solicitamos los datos de altura y radio del cilindro
     */
    public static void main(String[] args) {
        Scanner medidas = new Scanner(System.in);
        System.out.println("Vamos a calcular el volumen de un cilindro");
        System.out.println("Introduce el radio: ");
        double radio = medidas.nextDouble();
        System.out.println("Ahora, introduce la altura ");
        double altura = medidas.nextDouble();
        double pi = 3.1415;

        //Cálculos de área
        double area = radio*radio*pi*altura;

        System.out.println("El volumen de un cilindro de " +radio+ " cm de radio y de una altura de " +altura+ " cm de altura es de: " + area);
        medidas.close();


    }
}

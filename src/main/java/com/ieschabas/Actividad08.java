package com.ieschabas;
import java.util.Scanner;

/**
 * Clase en la cual vamos a separar los céntimos y los euros de una cantidad enorme de dinero ahorrado que tenemos
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Actividad08 {
    public static void main(String[] args) {

        //Solicitud de datos
        Scanner ahorros = new Scanner(System.in);
        System.out.println("¿Cuánto has conseguido ahorrar a lo largo de toda tu vida? ");
        double dinero = ahorros.nextDouble();

        //Cálculos
        /**
         * Pasamos todo el dinero a céntimos
         * Después tomamos el resultado de la división "todoCentimos/100" y nos muestra los euros que tenemos
         * Finalmente tomamos el resto de la división "todoCentimos%100" y nos muestra el valor de los céntimos restantes
         */

        int todoCentimos = (int) (dinero*100);
        int euros = todoCentimos/100;
        int centimos = todoCentimos%100;

        //Mostrar en pantalla

        System.out.println("En tu haber tienes: ");
        System.out.println("Esta exageración de euros: "+euros);
        System.out.println("Esta millonada de céntimos: "+centimos);
        ahorros.close();

    }
}

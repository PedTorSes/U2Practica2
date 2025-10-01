package com.ieschabas;
import java.util.Scanner;

/**
 * Solicitud de dos números para realizar la suma correspondiente
 * @author Pedro Torres Sesé
 * @version 1.0
 */

public class Actividad02 {
    public static void main(String[] args) {
        System.out.println("¿Cuál es el primer número que quieres utilizar par la suma? ");
        Scanner numeroSolicitado = new Scanner(System.in);
        double num1 = numeroSolicitado.nextDouble();
        System.out.println("¿Cuál va a ser el segundo?");
        double num2 = numeroSolicitado.nextDouble();
        double suma = num1 + num2;
        System.out.println("El resultado de la suma entre " + num1 + " y " +num2+ " es igual a: " + suma);
        numeroSolicitado.close();
    }
}

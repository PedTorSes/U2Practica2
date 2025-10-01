package com.ieschabas;
import java.util.Scanner;

/**
 * Cálculo de la media de tres números
 * @author Pedro Torres Sesé
 * @version 1.0
 */

public class Actividad03 {
    public static void main(String[] args) {
        Scanner numerito = new Scanner(System.in);
        System.out.println("¿Qué nota has sacado? ");
        double num1 = numerito.nextDouble();
        double num2 = numerito.nextDouble();
        double num3 = numerito.nextDouble();

        System.out.println("Veamos qué nota media sale a raíz de: el "  +num1+ " ,el "+ num2+ " y el" + num3);
       double media = (num1+num2+num3)/3;
        System.out.println("La media es: " + media);
        numerito.close();
    }
}

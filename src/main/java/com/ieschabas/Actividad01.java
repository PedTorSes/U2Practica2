package com.ieschabas;
import java.util.Scanner;
/**
 * Actividad 1 Eco con guiones
 * @author Pedro Enrique
 * @version 1.0
 */

public class Actividad01 {
    public static void main(String[] args) {
        System.out.println("¿Qué palabra quieres que diga el loro? ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
        System.out.println("La palabra elegida es: " + palabra + " El loro te dirá: -" + palabra + "-" +palabra+ "-" +palabra+ "-");
        scanner.close();
    }
}

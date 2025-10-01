package com.ieschabas;
import java.util.Scanner;
/**
 * Conversor de temperatura desde los grados Celsius para convertirlos en Fahrenheit y en Kelvin
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */
public class Actividad04 {
    public static void main(String[] args) {
        System.out.println("¿Qué temperatura en ºC deseas convertir? ");
        Scanner celsius = new Scanner(System.in);
        double temperatura = celsius.nextDouble();
        double fahrenheit = temperatura*1.8;
        double kelvin = temperatura+273.15;
        System.out.println("La temperatura " + temperatura+ " ºC equivale a " +fahrenheit+ " en grados fahrenheit");
        System.out.println("La temperatura " + temperatura+" ºC equivale a " +kelvin+ " en grados kelvin");
        celsius.close();
    }
}

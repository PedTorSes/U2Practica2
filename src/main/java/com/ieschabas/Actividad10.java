package com.ieschabas;
import java.util.Scanner;

/**
 * En la siguiente clase vamos a solicitar tres datos: Día, Mes y Año y vamos a establecer que por pantalla nos lo muestre con el siguiente formato: AAAA-MM-DD
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Actividad10 {
    public static void main(String[] args) {
        Scanner registro = new Scanner(System.in);

        System.out.println("¿En qué día del mes estamos?");
        int dia = registro.nextInt();

        System.out.println("¿En qué mes del año nos encontramos?");
        int mes = registro.nextInt();

        System.out.println("¿De qué año hablamos? ");
        int año = registro.nextInt();
    }
}

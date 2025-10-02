package com.ieschabas;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

/**
 * En la siguiente clase vamos a solicitar tres datos: Día, Mes y Año y vamos a establecer que por pantalla nos lo muestre con el siguiente formato: AAAA-MM-DD
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Actividad10 {
    public static void main(String[] args) {
        //Solicitud de datos
        Scanner registro = new Scanner(System.in);

        System.out.println("¿En qué día del mes estamos?");
        int dia = Integer.parseInt(registro.nextLine());

        System.out.println("¿En qué mes del año nos encontramos?");
        int mes = Integer.parseInt(registro.nextLine());

        System.out.println("¿De qué año hablamos? ");
        int año = Integer.parseInt(registro.nextLine());

        //Variables
        /**
         * En estas variables hemos puesto el IF por si el valor introducido fuera menor a 10, que añada un cero hasta rellenar el formato
         */

        String diaConCeros;
        if (dia < 10){
            diaConCeros= "0"+dia;
                 } else {
           diaConCeros=""+dia;
        }
        String mesConCeros;
        if (mes < 10){
           mesConCeros= "0"+mes;
        } else {
            mesConCeros= ""+mes;
        }
        String añoConCeros;
        if (año < 1000 && año >100){
          añoConCeros = "0"+año;
        } else if (año <100 && año >10){
            añoConCeros = "00"+año;
        } else if (año <10) {
            añoConCeros = "000"+año;
        }else {
            añoConCeros=""+año;
        }
        //Mostrar en pantalla

        System.out.println("La fecha elegida en formato YYYY:MM:DD es: " + añoConCeros + ":" + mesConCeros + ":" + diaConCeros );
    }
}


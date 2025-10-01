package com.ieschabas;
import java.util.Scanner;

/**
 * Clase en la cual sumamos las duraciones y las mostramos con formato MM:SS
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Actividad07 {
    /**
     * Solicitamos los datos en minutos y segundos de las canciones
     */
    public static void main(String[] args) {
        Scanner medidas = new Scanner(System.in);
        System.out.println("¿Cuántos minutos dura la primera canción? ");
        int minutos = medidas.nextInt();
        System.out.println("¿Cuántos segundos dura la primera canción?");
        int segundos = medidas.nextInt();
        System.out.println("¿Cuántos minutos dura la segunda canción?");
        int minutos2 = medidas.nextInt();
        System.out.println("Cuántos segundos dura la segunda canción?");
        int segundos2 = medidas.nextInt();

        //Cálculos
        /**
         * Sumamos la cantidad de minutos y la cantidad de segundos totales
         */
        int totalMinutos = minutos+minutos2;
        int totalSegundos = segundos+segundos2;

        /**
         * Pasamos los segundos a minutos
         * Aquí indicamos que si el total de segundos es mayor o igual a 60 que sume el resultado de la división de segundos entre 60 a los minutos
         * Para indicar los segundos restantes, tomamos el resto (%) de la división de los segundos totales entre 60
         */
        if (totalSegundos >=60) {
            totalMinutos += totalSegundos/60;
            totalSegundos = totalSegundos % 60;
        }
        System.out.println("La duración total de la Jam session es de: " +totalMinutos+":"+totalSegundos);





    }
}

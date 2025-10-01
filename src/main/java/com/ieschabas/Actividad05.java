package com.ieschabas;
import java.util.Scanner;

/**
 * Clase en la cual solicitamos al usuario dos medidas y calculamos el perímetro y el área
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Actividad05 {
    public static void main(String[] args) {
        Scanner medida = new Scanner(System.in);
        System.out.println("Vamos a calcular el área y perímetro de un rectángulo");
        System.out.println("¿Qué valor le damos a la altura? ");
                double alto = medida.nextDouble();
        System.out.println("¿Qué valor le damos a la base? ");
        double ancho = medida.nextDouble();

        //Cálculos
        double area = alto*ancho;
        double perimetro = alto+alto+ancho+ancho;

        //Mostrar en pantalla
        System.out.println("El área del rectángulo es "+area);
        System.out.println("El perímetro del rectángulo es "+perimetro);
        medida.close();
    }
}

//4. Programa que permita llenar en un vector 10 números enteros, posteriormente determinar 
//y mostrar lo siguiente:
//-       Cuantos son menores que 15.
//-       Cuantos son mayores de 50.
//-       Cuantos están comprendidos entre 25 y 50.

package Estructuras_de_datos.Arreglos_unidimensionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int arreglo[] = new int[10]; // Inicializar el arreglo

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLlena un vector con 10 numeros enteros:");
        // Solicitar y almacenar los 10 números
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();

        }

        // Imprimir los elemnetos del vector
        System.out.println("\nElementos del vector:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("numero " + (i + 1) + " = " + arreglo[i]);
        }

        // Cantidad de numeros <15
        System.out.println("\nCantidad de numeros menores de 15:");
        int cantidadMenores15 = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 15) {
                cantidadMenores15++;
            }
        }
        System.out.println(cantidadMenores15);

        // Cantidad de numeros mayores de 50
        System.out.println("\nCantidad de numeros mayores de 50:");
        int cantidadMayores50 = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 50) {
                cantidadMayores50++;
            }
        }
        System.out.println(cantidadMayores50);

        // Cantidad comprendida entre 25 y 50
        System.out.println("\nCantidad de numeros comprendida entre 25 y 50:");
        int cantidadEntre25y50 = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= 25 && arreglo[i] <= 50) {
                cantidadEntre25y50++;
            }
        }
        System.out.println(cantidadEntre25y50);

        // Cerrar Scanner
        scanner.close();
    }

}

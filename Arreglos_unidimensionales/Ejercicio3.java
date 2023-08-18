//3. Programa que llene un vector con números enteros y posteriormente mostrar los elementos 
//del vector y al final la cantidad de números pares y la cantidad de números impares, 
//así como la suma total de todos los elementos del vector.

package Arreglos_unidimensionales;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int arreglo[] = new int[5]; // Inicializar el arreglo

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLlena un vector con 5 numeros enteros:");
        // Solicitar y almacenar los 5 números
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();

        }

        // Imprimir los elemnetos del vector
        System.out.println("\nElementos del vector:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("numero " + (i + 1) + " = " + arreglo[i]);
        }

        // Cantidad de numeros pares del vector
        System.out.println("\nCantidad de numeros pares del vector:");
        int cantidadPares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                cantidadPares++;
            }
        }
        System.out.println(cantidadPares);

        // Cantidad de numeros impares del vector
        System.out.println("\nCantidad de numeros impares del vector:");
        int cantidadImpares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 1) {
                cantidadImpares++;
            }
        }
        System.out.println(cantidadImpares);

        // Calcular la suma total de los números en el arreglo
        System.out.println("\nLa suma total de los numeros del vector es:");
        int sumaTotal = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaTotal += arreglo[i];
        }
        System.out.println(sumaTotal);

        // Cerrar Scanner
        scanner.close();
    }

}

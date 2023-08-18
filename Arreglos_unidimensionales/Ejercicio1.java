//1. Programa que lea 10 números por teclado, los almacene en un array y los ordene 
//   de menor a mayor y los muestre
package Arreglos_unidimensionales;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        int arreglo[] = new int[10]; // Inicializar el arreglo

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n***Programa que ordena 10 numeros de menor a mayor***");
        // Solicitar y almacenar los 10 números
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Ordenar el arreglo de menor a mayor
        Arrays.sort(arreglo);

        // Imprimir los elemnetos del arreglo
        System.out.println("\n***Numero organizados de menor a mayor:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }

        // Cerrar Scanner
        scanner.close();
    }
}

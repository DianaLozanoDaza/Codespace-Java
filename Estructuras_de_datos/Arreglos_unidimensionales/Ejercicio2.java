//2. Programa que lea 5 números por teclado, los copie a otro array
//  multiplicados por 2 y muestre el segundo array.

package Estructuras_de_datos.Arreglos_unidimensionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int arreglo[] = new int[5]; // Inicializar el arreglo

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n***Programa que muestra 5 numeros multiplicados por 2***");
        // Solicitar y almacenar los 5 números
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numeroIngresado = scanner.nextInt();
            arreglo[i] = numeroIngresado * 2;

        }

        // Imprimir los elemnetos del arreglo
        System.out.println("\nNumeros ingresados multiplicados por 2:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("numero " + (i + 1) + " = " + arreglo[i]);
        }

        // Cerrar Scanner
        scanner.close();
    }

}

//Realice un programa que utilizando un menú permita unificar en un solo programa cada uno de los puntos
// solicitados, recuerde hacer uso de funciones y paso de parámetros; el programa deberá:

//1. Permitir generar dos matrices de números enteros de cualquier tamaño, insertarle elementos e 
//imprimirlos con sus respectivas posiciones.

//2. Permitir con las matrices insertadas (punto 1), realizar la suma y la resta de las matrices 
//validando sus condiciones para realizar esta operación.

//3. Permitir con una de las matrices ya insertadas (punto 1), solicitar un número entero y calcular 
//el producto escalar resultado del número ingresado.

//4. Permitir realizar la multiplicación de las matrices insertadas (punto 1), validando sus 
//condiciones para realizar esta operación.

//5. Salir del programa.

package Estructuras_de_datos.Arreglos_multidimensionales;

import java.util.*;

public class Actividad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matriz1[][] = null;
        int matriz2[][] = null;

        int opcion;

        do {

            System.out.println("\n");
            System.out.println("***MENU***");
            System.out.println("1. Suma de matrices.");
            System.out.println("2. Resta de matrices.");
            System.out.println("3. Producto por un escalar de una matriz.");
            System.out.println("4. multiplicacion de matrices.");
            System.out.println("5. Salir.");

            System.out.println("Seleccione una de las opciones del menu: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println(
                            "\nPara poder sumar matrices, estás deben tener el mismo número de filas y de columas.");
                    matriz1 = generarMatriz("Matriz 1");
                    matriz2 = generarMatriz("Matriz 2");
                    mostrarMatriz(matriz1, "Matriz 1");
                    mostrarMatriz(matriz2, "Matriz 2");
                    int[][] matrizSuma = sumarMatrices(matriz1, matriz2);
                    System.out.println("\n");
                    mostrarMatriz(matrizSuma, "El resultado de la suma entre las 2 matrices es:");

                    break;

                case 2:
                    System.out.println(
                            "\nPara poder restar matrices, estás deben tener el mismo número de filas y de columas.");
                    matriz1 = generarMatriz("Matriz 1");
                    matriz2 = generarMatriz("Matriz 2");
                    mostrarMatriz(matriz1, "Matriz 1");
                    mostrarMatriz(matriz2, "Matriz 2");
                    int[][] matrizResta = restarMatrices(matriz1, matriz2);
                    System.out.println("\n");
                    mostrarMatriz(matrizResta, "El resultado de la resta entre las 2 matrices es:");
                    break;

                case 3:
                    System.out.println(
                            "\nProducto Escalar.");
                    matriz1 = generarMatriz("Matriz 1");
                    matriz2 = generarMatriz("Matriz 2");
                    mostrarMatriz(matriz1, "Matriz 1");
                    mostrarMatriz(matriz2, "Matriz 2");

                    System.out.println("\nMATRIZ 1");
                    int[][] matrizProductoEscalar1 = productoEscalar(matriz1);
                    mostrarMatriz(matrizProductoEscalar1, "Matriz 1 Producto Escalar");

                    System.out.println("\nMATRIZ 2");
                    int[][] matrizProductoEscalar2 = productoEscalar(matriz2);
                    mostrarMatriz(matrizProductoEscalar2, "Matriz 2 Producto Escalar");

                    break;

                case 4:
                    System.out.println(
                            "\nPara poder multiplicar dos matrices, la primera debe tener el mismo número de columnas que filas la segunda.");
                    matriz1 = generarMatriz("Matriz 1");
                    matriz2 = generarMatriz("Matriz 2");
                    mostrarMatriz(matriz1, "Matriz 1");
                    mostrarMatriz(matriz2, "Matriz 2");
                    int[][] matrizMultiplicacion = multiplicarMatrices(matriz1, matriz2);
                    System.out.println("\n");
                    mostrarMatriz(matrizMultiplicacion, "El resultado de la multiplicación entre las 2 matrices es:");
                    break;

            }

        } while (opcion != 5);
    }

    public static int[][] generarMatriz(String nombre) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese el número de filas para " + nombre + ": ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para " + nombre + ": ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor en la posición (" + i + ", " + j + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz, String nombre) {
        System.out.println(nombre + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultadoSumaMatrices = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultadoSumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultadoSumaMatrices;
    }

    public static int[][] restarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultadoRestaMatrices = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultadoRestaMatrices[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        return resultadoRestaMatrices;
    }

    public static int[][] productoEscalar(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultadoProductoEscalar = new int[filas][columnas];

        System.out.println("Ingrese el escalar(numero real) por el cual desea multiplicar la matriz:");
        int escalar = scanner.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultadoProductoEscalar[i][j] = matriz[i][j] * escalar;
            }
        }

        return resultadoProductoEscalar;
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultadoMultiplicarMatrices = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultadoMultiplicarMatrices[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        return resultadoMultiplicarMatrices;
    }
}

package Analisis_de_algoritmos.Act3OrdenamientoYBusquedad;

import java.util.Random;

public class BurbujaCadenaDeCaracteres {

    public static void main(String[] args) {
        String[] data100 = generateRandomStrings(100);
        String[] data1000 = generateRandomStrings(1000);
        String[] data10000 = generateRandomStrings(10000);

        // Medir el tiempo de ejecución para 100 datos
        long startTime100 = System.nanoTime();
        bubbleSort(data100);
        long endTime100 = System.nanoTime();
        double executionTime100 = (endTime100 - startTime100) / 1e9;

        // Medir el tiempo de ejecución para 1000 datos
        long startTime1000 = System.nanoTime();
        bubbleSort(data1000);
        long endTime1000 = System.nanoTime();
        double executionTime1000 = (endTime1000 - startTime1000) / 1e9;

        // Medir el tiempo de ejecución para 10000 datos
        long startTime10000 = System.nanoTime();
        bubbleSort(data10000);
        long endTime10000 = System.nanoTime();
        double executionTime10000 = (endTime10000 - startTime10000) / 1e9;

        System.out.println("\n");
        System.out.println("------------TIEMPOS DE EJECUCIÓN-------------");
        System.out.println("\n");
        System.out.println("Tiempo de ejecución para 100 datos: " + executionTime100 + " segundos");
        System.out.println("Tiempo de ejecución para 1000 datos: " + executionTime1000 + " segundos");
        System.out.println("Tiempo de ejecución para 10000 datos: " + executionTime10000 + " segundos");
    }

    public static String[] generateRandomStrings(int size) {
        String[] data = new String[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int strLength = random.nextInt(10) + 1; // Longitud de cadena aleatoria entre 1 y 10 caracteres
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strLength; j++) {
                char randomChar = (char) (random.nextInt(26) + 'a'); // Caracter aleatorio en minúscula
                sb.append(randomChar);
            }
            data[i] = sb.toString();
        }
        return data;
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

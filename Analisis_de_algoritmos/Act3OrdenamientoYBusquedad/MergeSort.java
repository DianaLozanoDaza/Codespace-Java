package Analisis_de_algoritmos.Act3OrdenamientoYBusquedad;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] data100 = generateRandomData(100);
        int[] data1000 = generateRandomData(1000);
        int[] data10000 = generateRandomData(10000);

        // Medir el tiempo de ejecución para 100 datos
        long startTime100 = System.nanoTime();
        mergeSort(data100);
        long endTime100 = System.nanoTime();
        double executionTime100 = (endTime100 - startTime100) / 1e9;

        // Medir el tiempo de ejecución para 1000 datos
        long startTime1000 = System.nanoTime();
        mergeSort(data1000);
        long endTime1000 = System.nanoTime();
        double executionTime1000 = (endTime1000 - startTime1000) / 1e9;

        // Medir el tiempo de ejecución para 10000 datos
        long startTime10000 = System.nanoTime();
        mergeSort(data10000);
        long endTime10000 = System.nanoTime();
        double executionTime10000 = (endTime10000 - startTime10000) / 1e9;

        System.out.println("\n");
        System.out.println("------------TIEMPOS DE EJECUCIÓN-------------");
        System.out.println("\n");
        System.out.println("Tiempo de ejecución para 100 datos: " + executionTime100 + " segundos");
        System.out.println("Tiempo de ejecución para 1000 datos: " + executionTime1000 + " segundos");
        System.out.println("Tiempo de ejecución para 10000 datos: " + executionTime10000 + " segundos");
    }

    public static int[] generateRandomData(int size) {
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(10000);
        }
        return data;
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, mid, right, 0, right.length);

        mergeSort(left);
        mergeSort(right);

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}



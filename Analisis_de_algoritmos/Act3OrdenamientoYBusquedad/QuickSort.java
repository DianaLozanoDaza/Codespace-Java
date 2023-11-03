package Analisis_de_algoritmos.Act3OrdenamientoYBusquedad;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] data100 = generateRandomData(100);
        int[] data1000 = generateRandomData(1000);
        int[] data10000 = generateRandomData(10000);

        // Medir el tiempo de ejecución para 100 datos
        long startTime100 = System.nanoTime();
        quickSort(data100, 0, data100.length - 1);
        long endTime100 = System.nanoTime();
        double executionTime100 = (endTime100 - startTime100) / 1e9;

        // Medir el tiempo de ejecución para 1000 datos
        long startTime1000 = System.nanoTime();
        quickSort(data1000, 0, data1000.length - 1);
        long endTime1000 = System.nanoTime();
        double executionTime1000 = (endTime1000 - startTime1000) / 1e9;

        // Medir el tiempo de ejecución para 10000 datos
        long startTime10000 = System.nanoTime();
        quickSort(data10000, 0, data10000.length - 1);
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

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}



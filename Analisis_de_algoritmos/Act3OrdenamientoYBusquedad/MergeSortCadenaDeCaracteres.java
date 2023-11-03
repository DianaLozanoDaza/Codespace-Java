package Analisis_de_algoritmos.Act3OrdenamientoYBusquedad;

import java.util.Random;

public class MergeSortCadenaDeCaracteres {

    public static void main(String[] args) {
        String[] data100 = generateRandomStrings(100);
        String[] data1000 = generateRandomStrings(1000);
        String[] data10000 = generateRandomStrings(10000);

        // Medir el tiempo de ejecución para 100 datos
        long startTime100 = System.nanoTime();
        mergeSort(data100, 0, data100.length - 1);
        long endTime100 = System.nanoTime();
        double executionTime100 = (endTime100 - startTime100) / 1e9;

        // Medir el tiempo de ejecución para 1000 datos
        long startTime1000 = System.nanoTime();
        mergeSort(data1000, 0, data1000.length - 1);
        long endTime1000 = System.nanoTime();
        double executionTime1000 = (endTime1000 - startTime1000) / 1e9;

        // Medir el tiempo de ejecución para 10000 datos
        long startTime10000 = System.nanoTime();
        mergeSort(data10000, 0, data10000.length - 1);
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

    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] L = new String[n1];
        String[] R = new String[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}


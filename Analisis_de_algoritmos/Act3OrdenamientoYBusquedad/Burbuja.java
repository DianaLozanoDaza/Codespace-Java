package Analisis_de_algoritmos.Act3OrdenamientoYBusquedad;
import java.util.Random;

public class Burbuja {

    public static void main(String[] args) {
        int[] data100 = generateRandomData(100);
        int[] data1000 = generateRandomData(1000);
        int[] data10000 = generateRandomData(10000);

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

    public static int[] generateRandomData(int size) {
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(100);
        }
        return data;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}






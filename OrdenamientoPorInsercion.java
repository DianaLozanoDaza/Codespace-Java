public class OrdenamientoPorInsercion {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int clave = arr[i];
            int j = i - 1;

            // Mover los elementos mayores que la clave a la derecha
            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insertar la clave en su posición correcta
            arr[j + 1] = clave;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Arreglo original:");
        imprimirArray(arr);

        insertionSort(arr);

        System.out.println("Arreglo ordenado:");
        imprimirArray(arr);
    }

    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

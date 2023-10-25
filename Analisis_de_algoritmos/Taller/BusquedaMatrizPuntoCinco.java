package Analisis_de_algoritmos.Taller;

public class BusquedaMatrizPuntoCinco {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int elementoABuscar = 5;

        buscarElementoEnMatriz(matriz, elementoABuscar);
    }

    public static void buscarElementoEnMatriz(int[][] matriz, int elementoABuscar) {
        int n = matriz.length; // Tamaño de la matriz (n x n)

        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (matriz[fila][columna] == elementoABuscar) {
                    System.out.println("Elemento encontrado en la fila " + fila + ", columna " + columna);
                    return; // Terminamos la búsqueda una vez que se encuentra el elemento
                }
            }
        }

        // El elemento no se encontró en la matriz
        System.out.println("Elemento no encontrado en la matriz.");
    }
}


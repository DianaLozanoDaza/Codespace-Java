package Analisis_de_algoritmos.Act1NotacionAsintotica;

public class SumaDosMatrices {
    public static int[][] sumMatrices(int[][] A, int[][] B) {
        int n = A.length; // Número de filas o columnas
        int[][] C = new int[n][n]; // Matriz resultado

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C; // Devolver la matriz resultado
    }

    public static void main(String[] args) {
        int n = 3; // Tamaño de las matrices (3x3 en este caso)
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] C = sumMatrices(A, B);

        // Imprimir la matriz resultante C
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}


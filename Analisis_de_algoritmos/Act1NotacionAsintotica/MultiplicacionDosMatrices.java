package Analisis_de_algoritmos.Act1NotacionAsintotica;

public class MultiplicacionDosMatrices {
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int n = A.length; // Número de filas
        int[][] result = new int[n][n]; // Matriz resultado

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }  
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] C = multiplyMatrices(A, B);

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}


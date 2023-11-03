package Analisis_de_algoritmos.DividirYConquistar;

public class SumaDosMatricesRecursiva {

    public static int[][] sumarMatrices(int[][] A, int[][] B) {
        int filas = A.length;
        int columnas = A[0].length;
        int[][] resultado = new int[filas][columnas];
        sumarMatricesRecursivo(A, B, resultado, 0, 0, 0, 0, filas, columnas);
        return resultado;
    }

    private static void sumarMatricesRecursivo(int[][] A, int[][] B, int[][] resultado,
            int filaA, int columnaA, int filaB, int columnaB,
            int filas, int columnas) {
        if (filaA == filas || columnaA == columnas) {
            return; // Caso base: Matrices completamente sumadas
        }

        // Suma las celdas correspondientes de A y B y almacena el resultado en la
        // matriz resultado.
        resultado[filaA][columnaA] = A[filaA][columnaA] + B[filaB][columnaB];

        // Calcula las siguientes coordenadas de fila y columna.
        int siguienteColumnaA = columnaA + 1;
        int siguienteColumnaB = columnaB + 1;
        int siguienteFilaA = filaA + (siguienteColumnaA == columnas ? 1 : 0);
        int siguienteFilaB = filaB + (siguienteColumnaB == columnas ? 1 : 0);

        // Llama recursivamente con las nuevas coordenadas.
        sumarMatricesRecursivo(A, B, resultado, siguienteFilaA, siguienteColumnaA, siguienteFilaB, siguienteColumnaB,
                filas, columnas);
    }

    public static void main(String[] args) {
        int[][] matrizA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrizB = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        int[][] resultado = sumarMatrices(matrizA, matrizB);

        // Imprime la matriz resultado
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}

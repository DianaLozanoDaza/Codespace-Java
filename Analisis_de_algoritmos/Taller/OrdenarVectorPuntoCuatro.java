package Analisis_de_algoritmos.Taller;
 
//metodo de ordenación por Inserción(donde M es menor a 100)

public class OrdenarVectorPuntoCuatro {
    public static void main(String[] args) {
        int[] vector = {10, 1, 34, 0, 22, -8};

        ordenarPorInsercion(vector);

        // Imprimir el vector ordenado
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    public static void ordenarPorInsercion(int[] vector) {
        int n = vector.length;
        for (int i = 1; i < n; i++) {
            int elementoActual = vector[i];
            int j = i - 1;

            // Mover los elementos mayores que el elemento actual a la derecha
            while (j >= 0 && vector[j] > elementoActual) {
                vector[j + 1] = vector[j];
                j--;
            }

            // Colocar el elemento actual en su posición correcta
            vector[j + 1] = elementoActual;
        }
    }
}

package Analisis_de_algoritmos.Taller;

public class CollatzPuntoUno {
    public static void main(String[] args) {
        int n = 55; 
        System.out.println("Secuencia de Collatz para " + n + ":");
        int pasos = collatz(n);
        System.out.println("\nNúmero de pasos: " + pasos);
    }

    public static int collatz(int n) {
        System.out.print(n + " ");

        // la secuencia termina cuando n llegue a 1, aqui no se cuenta el paso
        if (n == 1) {
            return 0;
        }

        // Si n es par, divídelo por 2; si es impar, multiplica por 3 y sumale 1
        if (n % 2 == 0) {
            return 1 + collatz(n / 2); //cuenta el paso actual y sigue recursivamente
        } else {
            return 1 + collatz(3 * n + 1); //cuenta el paso actual y sigue recursivamente
        }
    }
}


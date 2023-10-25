package Analisis_de_algoritmos.Taller;

import java.util.Scanner;
import java.math.BigDecimal;

//Se usa un bucle iterativo en el método calcularPotencia para evitar la recursión y mejorar el rendimiento,
// especialmente para exponentes grandes o negativos. La precisión se establece en 20 decimales
// y se utiliza BigDecimal.ROUND_HALF_UP para redondear correctamente.


public class Exponenciacion_rapidaPuntoDos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Introduce la base: ");
            int base = teclado.nextInt();
            System.out.print("Introduce el exponente: ");
            int exponente = teclado.nextInt();
            teclado.close();

            if (exponente < 0) {
                System.out.println("El exponente debe ser un número no negativo.");
            } else {
                BigDecimal resultado = calcularPotencia(base, exponente);
                System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Debes ingresar números enteros válidos.");
        }
    }

    private static BigDecimal calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return BigDecimal.ONE;  // Cualquier número elevado a 0 es 1.
        } else {
            BigDecimal resultado = BigDecimal.ONE;
            BigDecimal baseDecimal = new BigDecimal(base);

            for (int i = 0; i < Math.abs(exponente); i++) {
                resultado = resultado.multiply(baseDecimal);
            }

            if (exponente < 0) {
                resultado = BigDecimal.ONE.divide(resultado, 20, BigDecimal.ROUND_HALF_UP);
            }

            return resultado;
        }
    }
}


package Analisis_de_algoritmos.DividirYConquistar;

public class BusquedaCadenaEnOtraCadena {

    public static boolean buscarCadena(String x, String y) {
        int m = x.length();
        int n = y.length();

        // Caso base: Si la cadena a buscar es vacía, entonces ya la encontramos.
        if (m == 0) {
            return true;
        }

        // Si la cadena más corta es más larga que la cadena en la que estamos buscando,
        // no podemos encontrarla.
        if (n < m) {
            return false;
        }

        // Comparamos la cadena x con una subcadena de y que tiene la misma longitud que
        // x.
        for (int i = 0; i <= n - m; i++) {
            if (y.substring(i, i + m).equals(x)) {
                return true;
            }
        }

        // Si no la encontramos en la subcadena actual, llamamos recursivamente a la
        // función
        // con la subcadena restante de y (sin el primer carácter).
        return buscarCadena(x, y.substring(1));
    }

    public static void main(String[] args) {
        String cadenaLarga = "Esto es una cadena de ejemplo para buscar una subcadena.";
        String subcadena = "ejemplo";

        if (buscarCadena(subcadena, cadenaLarga)) {
            System.out.println("La subcadena fue encontrada en la cadena larga.");
        } else {
            System.out.println("La subcadena no fue encontrada en la cadena larga.");
        }
    }
}

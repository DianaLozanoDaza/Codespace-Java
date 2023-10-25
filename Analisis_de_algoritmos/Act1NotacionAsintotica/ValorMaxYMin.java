package Analisis_de_algoritmos.Act1NotacionAsintotica;

public class ValorMaxYMin {

    public static class Result {
        int max;
        int min;
    }

    public static Result findMaxMin(int[] arr) {
        Result result = new Result();

        int n = arr.length;
        int i;

        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                result.max = arr[0];
                result.min = arr[1];
            } else {
                result.max = arr[1];
                result.min = arr[0];
            }
            i = 2;
        } else {
            result.max = arr[0];
            result.min = arr[0];
            i = 1;
        }

        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > result.max) {
                    result.max = arr[i];
                }
                if (arr[i + 1] < result.min) {
                    result.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > result.max) {
                    result.max = arr[i + 1];
                }
                if (arr[i] < result.min) {
                    result.min = arr[i];
                }
            }
            i += 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 8, 4, 6, 2, 9, 5 };
        Result result = findMaxMin(arr);

        System.out.println("Máximo: " + result.max);
        System.out.println("Mínimo: " + result.min);
    }
}

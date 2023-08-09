package Calculadora;
import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int opcion;

    do {
      System.out.println("****CALCULADORA****");
      System.out.println("1. SUMA");
      System.out.println("2. RESTA");
      System.out.println("3. MULTIPLICACION");
      System.out.println("4. DIVISION");
      System.out.println("5. SALIR");

      System.out.println("Por favor selecciona una opcion: ");
      opcion = scanner.nextInt();

      switch (opcion) {

        case 1:
          System.out.println("Seleccionaste la opcion suma. ");
          System.out.println("Por favor ingresa el primer numero: ");
          int numero1Suma = scanner.nextInt();

          System.out.println("Por favor ingresa el segundo numero: ");
          int numero2Suma = scanner.nextInt();

          int resultadoSuma = sumar(numero1Suma, numero2Suma);
          System.out.println("La suma es: " + resultadoSuma);
          break;

        case 2:
          System.out.println("Seleccionaste la opcion resta. ");
          System.out.println("Por favor ingresa el primer numero: ");
          int numero1Resta = scanner.nextInt();

          System.out.println("Por favor ingresa el segundo numero: ");
          int numero2Resta = scanner.nextInt();

          int resultadoResta = restar(numero1Resta, numero2Resta);
          System.out.println("La resta es: " + resultadoResta);
          break;

        case 3:
          System.out.println("Seleccionaste la opcion multiplicacion. ");
          System.out.println("Por favor ingresa el primer numero: ");
          int numero1Multip = scanner.nextInt();

          System.out.println("Por favor ingresa el segundo numero: ");
          int numero2Multip = scanner.nextInt();

          int resultadoMultip = multiplicar(numero1Multip, numero2Multip);
          System.out.println("La multiplicacion es: " + resultadoMultip);
          break;

        case 4:
          System.out.println("Seleccionaste la opcion division. ");
          System.out.println("Por favor ingresa el primer numero: ");
          int numero1Division = scanner.nextInt();

          System.out.println("Por favor ingresa el segundo numero: ");
          int numero2Division = scanner.nextInt();

          int resultadoDivision = dividir(numero1Division, numero2Division);
          System.out.println("La division es: " + resultadoDivision);
          break;
      }
      System.out.println("\n");
    } while (opcion != 5);
  }

  public static int sumar(int a, int b) {
    return a + b;
  }

  public static int restar(int a, int b) {
    return a - b;
  }

  public static int multiplicar(int a, int b) {
    return a * b;
  }

  public static int dividir(int a, int b) {
    return a / b;
  }
}
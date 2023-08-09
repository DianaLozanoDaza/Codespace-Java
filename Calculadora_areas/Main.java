package Calculadora_areas;
import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int opcion;

    do {
      System.out.println("****CALCULADORA DE AREAS****");
      System.out.println("1. CUADRADO");
      System.out.println("2. TRIANGULO");
      System.out.println("3. CIRCULO");
      System.out.println("4. TRAPEZOIDE");
      System.out.println("5. SALIR");

      System.out.println("Recuerda que las longitudes deben ser en centimetros. ");

      System.out.println("Por favor selecciona una opcion: ");
      opcion = scanner.nextInt();

      switch (opcion) {

        case 1:
          System.out.println("Seleccionaste la opcion cuadrado. ");
          System.out.println("Por favor ingresa el primer lado del cuadrado: ");
          double lado1Cuadrado = scanner.nextDouble();

          System.out.println("Por favor ingresa el segundo lado del cuadrado: ");
          double lado2Cuadrado = scanner.nextDouble();

          double resultadoAreaCuadrado = areaCuadrado(lado1Cuadrado, lado2Cuadrado);
          System.out.println("El area del cuadrado es: " + resultadoAreaCuadrado + " cm2");
          break;

        case 2:
          System.out.println("Seleccionaste la opcion triangulo. ");
          System.out.println("Por favor ingresa la base del triangulo: ");
          double baseTriangulo = scanner.nextDouble();

          System.out.println("Por favor ingresa la altura del triangulo: ");
          double alturaTriangulo = scanner.nextDouble();

          double resultadoAreaTriangulo = areaTriangulo(baseTriangulo, alturaTriangulo);
          System.out.println("El area del triangulo es: " + resultadoAreaTriangulo + " cm2");
          break;

        case 3:
          System.out.println("Seleccionaste la opcion circulo. ");
          System.out.println("Por favor ingresa el radio del circulo: ");
          double radioCirculo = scanner.nextDouble();

          double resultadoAreaCirculo = areaCirculo(radioCirculo);
          System.out.println("El area del circulo es: " + resultadoAreaCirculo + " cm2");
          break;

        case 4:
          System.out.println("Seleccionaste la opcion trapezoide. ");
          System.out.println("Por favor ingresa la base mayor: ");
          double baseMayor = scanner.nextDouble();

          System.out.println("Por favor ingresa la base menor: ");
          double baseMenor = scanner.nextDouble();

          System.out.println("Por favor ingresa la altura: ");
          double altura = scanner.nextDouble();

          double resultadoTrapezoide = trapezoide(baseMayor, baseMenor, altura);
          System.out.println("El area del trapezoide es: " + resultadoTrapezoide + " cm2");
          break;
      }
      System.out.println("\n");
    } while (opcion != 5);
  }

  public static double areaCuadrado(double a, double b) {
    return a * b;
  }

  public static double areaTriangulo(double a, double b) {
    return (a * b)/2;
  }

  public static double areaCirculo(double a) {
    return (a * a)* 3.14159265;
  }

  public static double trapezoide(double a, double b, double c) {
    return (((a + b)/2)*c);
  }
}
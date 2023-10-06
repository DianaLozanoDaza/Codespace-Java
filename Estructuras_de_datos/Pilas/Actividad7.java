package Estructuras_de_datos.Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Actividad7 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Stack<Articulos> pilaArticulos = new Stack<>();

        int opcion;
        
        do{
            System.out.println("**********MENÚ DEL PROGRAMA**********");
            System.out.println("1. INSERTAR UN ARTICULO.");
            System.out.println("2. MOSTRAR LOS ELEMENTOS DE LA PILA EN ORDEN LIFO.");
            System.out.println("0. SALIR.");
            System.out.println("********************");

            System.out.println("\nSelecciona una opción del menú:");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                System.out.print("\nIngrese el código del artículo: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();  // Consume la nueva línea
                System.out.print("Ingrese el nombre del artículo: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el detalle del artículo: ");
                String detalle = scanner.nextLine();
                System.out.print("Ingrese el valor del artículo: ");
                double valor = scanner.nextDouble();

                Articulos nuevoArticulo = new Articulos(codigo, nombre, detalle, valor);
                pilaArticulos.push(nuevoArticulo);
                System.out.println("EL ARTICULO SE HA AGREGADO A LA PILA\n");
                break;

                case 2:
                System.out.println("\nELEMENTOS DE LA PILA EN ORDEN LIFO:");
                    while (!pilaArticulos.isEmpty()) {
                        Articulos articulos = pilaArticulos.pop();
                        System.out.println(articulos);
                        System.out.println("----------");
                    }
                    System.out.println("\n");
                    break;

                case 0:
                    System.out.println("\nSaliendo del programa");
                    System.out.println("********************");
                    break;

                default:
                System.out.println("\nLa opción ingresada no es válida\n");
        
            }
        }while (opcion!=0);
        scanner.close();
    }

}

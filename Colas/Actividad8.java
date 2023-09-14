package Colas;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

//DESPACHO DE CAMIONES
public class Actividad8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Camion> colaCamiones = new LinkedList<>();

        int opcion;

        do {
            System.out.println("**********MENÚ PRINCIPAL**********");
            System.out.println("1. INSERTAR ENTRADA DEL CAMIÓN.");
            System.out.println("2. MOSTRAR LOS CAMIONES.");
            System.out.println("3. SALIR.");
            System.out.println("********************");

            System.out.println("\nSelecciona una opción del menú:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el código del Camión: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Consume la nueva línea
                    System.out.print("Ingrese la placa del camión: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese el nombre del chofer: ");
                    String nombreChofer = scanner.nextLine();

                    Camion nuevoCamion = new Camion(codigo, placa, nombreChofer);
                    colaCamiones.offer(nuevoCamion); // Agrega el camion a la cola
                    System.out.println("EL CAMIÓN SE HA AGREGADO A LA COLA\n");
                    break;

                case 2:
                    System.out.println("\nCAMIONES EN ORDEN DE ENTRADA (FIFO):");
                    while (!colaCamiones.isEmpty()) {
                        Camion camiones = colaCamiones.poll();
                        System.out.println(camiones);
                        System.out.println("----------");
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("\nSaliendo del programa");
                    System.out.println("********************");
                    break;

                default:
                    System.out.println("\nLa opción ingresada no es válida\n");

            }
        } while (opcion != 3);
        scanner.close();
    }

}

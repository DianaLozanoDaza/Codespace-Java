package Estructuras_de_datos.ListasEnlazadas;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaProfesor listaProfesor = new ListaProfesor();

        while (true) {
            System.out.println("-----MENÚ-----");
            System.out.println("1. Registrar profesor.");
            System.out.println("2. Mostrar listado de profesores.");
            System.out.println("3. Buscar profesor por codigo.");
            System.out.println("4. Eliminar profesor por codigo.");
            System.out.println("5. Salir.");

            System.out.println("Elija una opción del menú: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.println("Ingrese el codigo del profesor: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del profesor: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido del profesor: ");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el celular del profesor: ");
                    String celular = scanner.nextLine();
                    Profesor nuevoProfesor = new Profesor(codigo, nombre, apellido, celular);
                    listaProfesor.registrarProfesor(nuevoProfesor);
                    System.out.println("\n");
                    break;

                case 2:
                    listaProfesor.mostrarListadoProfesores();
                    break;

                case 3:
                    System.out.println("\n");
                    System.out.println("Ingrese el codigo del profesor que quiere buscar: ");
                    int codigoBuscar = scanner.nextInt();
                    listaProfesor.buscarProfesorCodigo(codigoBuscar);
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("\n");
                    System.out.println("Ingrese el codigo del profesor que quiere eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    listaProfesor.eliminarProfesorCodigo(codigoEliminar);
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("\n");
                    System.out.println("---Saliendo del programa...---");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo");
                    break;
            }
        }
    }
}

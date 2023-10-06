package Estructuras_de_datos.ListasDoblementeEnlazadas;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaPacientes listaPaciente = new ListaPacientes();
        ListaPacientes lista = new ListaPacientes();
        ListaPacientes listaPacientes = new ListaPacientes();

        while (true) {
            System.out.println("-----MENÚ-----");
            System.out.println("1. Registrar paciente.");
            System.out.println("2. Mostrar listado ascendente por codigo.");
            System.out.println("3. Mostrar listado descendente por codigo.");
            System.out.println("4. Actualizar pacientes.");
            System.out.println("5. Buscar paciente por edad.");
            System.out.println("6. Eliminar datos de paciente.");
            System.out.println("7. Salir.");
            System.out.println("-----------------------");

            System.out.println("Elija una opción del menú: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.print("Ingrese el código del paciente: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.print("Ingrese los nombres del paciente: ");
                    String nombres = scanner.nextLine();
                    System.out.print("Ingrese los apellidos del paciente: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese la dirección del paciente: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del paciente: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese la edad del paciente: ");
                    int edad = scanner.nextInt();

                    Paciente nuevoPaciente = new Paciente(codigo, telefono, nombres, apellidos, direccion, edad);
                    listaPaciente.registrarPaciente(nuevoPaciente);
                    System.out.println("Paciente registrado correctamente.");
                    System.out.println("\n");
                    break;

                case 2:
                    // Mostrar Listado Ascendente por Código
                    System.out.println("\n");
                    listaPaciente.mostrarListaAscendente();
                    System.out.println("\n");
                    break;

                case 3:
                    // Mostrar Listado Descendente por Código
                    System.out.println("\n");
                    listaPaciente.mostrarListaDescendente();
                    System.out.println("\n");
                    break;

                case 4:
                    // Actualizar Pacientes
                    System.out.print("Ingrese el código del paciente a actualizar: ");
                    int codigoActualizar = scanner.nextInt();
                    ListaPacientes.actualizarPaciente(listaPaciente, codigoActualizar, scanner);
                    break;

                case 5:
                    // Buscar Paciente por Edad
                    System.out.println("\n");
                    System.out.print("Ingrese la edad a buscar: ");
                    int edadBuscada = scanner.nextInt();
                    listaPaciente.buscarPorEdad(edadBuscada);
                    System.out.println("\n");
                    break;

                case 6:
                    // Eliminar Datos de Paciente
                    System.out.println("\n");
                    System.out.print("Ingrese el código del paciente a eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    listaPaciente.eliminarPaciente(codigoEliminar);
                    System.out.println("\n");
                    break;

                case 7:
                    // Salir
                    System.out.println("\n");
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("Opción no válida. Intente nuevamente.");
                    System.out.println("\n");
                    break;
            }
        }
    }

}

package ListasDoblementeEnlazadas;

import java.util.Scanner;

public class Actividad6 {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        ListaPacientes listaPaciente = new ListaPacientes();

        while (true) {
            System.out.println("-----MENÚ-----");
            System.out.println("1. Registrar paciente.");
            System.out.println("2. Mostrar listado ascendente por codigo.");
            System.out.println("3. Mostrar listado descendente por codigo.");
            System.out.println("4. Actualizar pacientes.");
            System.out.println("5. Buscar paciente por edad.");
            System.out.println("5. Eliminar datos de paciente.");
            System.out.println("5. Salir.");
            System.out.println("-----------------------");

            System.out.println("Elija una opción del menú: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                System.out.print("Ingrese el código del paciente: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea
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
                break;
            
            case 2:
                // Mostrar Listado Ascendente por Código
                listaPaciente.mostrarListaAscendente();
                break;
            
            case 3:
                // Mostrar Listado Descendente por Código
                listaPaciente.mostrarListaDescendente();
                break;
            
            case 4:
                // Actualizar Pacientes
                // Implementar la lógica de actualización aquí
                break;
            
            case 5:
                // Buscar Paciente por Edad
                System.out.print("Ingrese la edad a buscar: ");
                int edadBuscada = scanner.nextInt();
                listaPaciente.buscarPorEdad(edadBuscada);
                break;
            
            case 6:
                // Eliminar Datos de Paciente
                System.out.print("Ingrese el código del paciente a eliminar: ");
                int codigoEliminar = scanner.nextInt();
                listaPaciente.eliminarPaciente(codigoEliminar);
                break;
            
            case 7:
                // Salir
                System.out.println("Saliendo del programa.");
                scanner.close();
                System.exit(0);
                break;
            
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
            }
        }
    }

}

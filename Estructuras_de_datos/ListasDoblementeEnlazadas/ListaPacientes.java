package Estructuras_de_datos.ListasDoblementeEnlazadas;

import java.util.Scanner;

public class ListaPacientes {

    Scanner scanner = new Scanner(System.in);

    Nodo2 inicio;
    Nodo2 fin;

    ListaPacientes() {
        inicio = null;
        fin = null;
    }

    public void registrarPaciente(Paciente paciente) {
        Nodo2 nuevoNodo = new Nodo2(paciente);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.anterior = fin;
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    void mostrarListaAscendente() {
        Nodo2 actual = inicio;
        while (actual != null) {
            System.out.println("Código: " + actual.paciente.codigo);
            System.out.println("Nombres: " + actual.paciente.nombres);
            System.out.println("Apellidos: " + actual.paciente.apellidos);
            System.out.println("Dirección: " + actual.paciente.direccion);
            System.out.println("Teléfono: " + actual.paciente.telefono);
            System.out.println("Edad: " + actual.paciente.edad);
            System.out.println("-------------------------");
            actual = actual.siguiente;
        }
    }

    void mostrarListaDescendente() {
        Nodo2 actual = fin;
        while (actual != null) {
            System.out.println("Código: " + actual.paciente.codigo);
            System.out.println("Nombres: " + actual.paciente.nombres);
            System.out.println("Apellidos: " + actual.paciente.apellidos);
            System.out.println("Dirección: " + actual.paciente.direccion);
            System.out.println("Teléfono: " + actual.paciente.telefono);
            System.out.println("Edad: " + actual.paciente.edad);
            System.out.println("-------------------------");
            actual = actual.anterior;
        }
    }

    static void actualizarPaciente(ListaPacientes lista, int codigo, Scanner scanner) {
        Nodo2 actual = lista.inicio;
        while (actual != null) {
            if (actual.paciente.codigo == codigo) {
                // El paciente se encontró, muestra sus datos actuales
                System.out.println("Datos actuales del paciente:");
                System.out.println("Código: " + actual.paciente.codigo);
                System.out.println("Nombres: " + actual.paciente.nombres);
                System.out.println("Apellidos: " + actual.paciente.apellidos);
                System.out.println("Dirección: " + actual.paciente.direccion);
                System.out.println("Teléfono: " + actual.paciente.telefono);
                System.out.println("Edad: " + actual.paciente.edad);

                // Solicita los nuevos datos al usuario
                System.out.print("Ingrese los nuevos nombres del paciente: ");
                String nuevosNombres = scanner.nextLine();
                System.out.print("Ingrese los nuevos apellidos del paciente: ");
                String nuevosApellidos = scanner.nextLine();
                System.out.print("Ingrese la nueva dirección del paciente: ");
                String nuevaDireccion = scanner.nextLine();
                System.out.print("Ingrese el nuevo teléfono del paciente: ");
                String nuevoTelefono = scanner.nextLine();
                System.out.print("Ingrese la nueva edad del paciente: ");
                int nuevaEdad = scanner.nextInt();

                // Actualiza los datos del paciente
                actual.paciente.nombres = nuevosNombres;
                actual.paciente.apellidos = nuevosApellidos;
                actual.paciente.direccion = nuevaDireccion;
                actual.paciente.telefono = nuevoTelefono;
                actual.paciente.edad = nuevaEdad;

                System.out.println("Paciente actualizado correctamente.");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No se encontró ningún paciente con ese código.");
    }

    void buscarPorEdad(int edad) {
        Nodo2 actual = inicio;
        while (actual != null) {
            if (actual.paciente.edad == edad) {
                System.out.println("Paciente encontrado:");
                System.out.println("Código: " + actual.paciente.codigo);
                System.out.println("Nombres: " + actual.paciente.nombres);
                System.out.println("Apellidos: " + actual.paciente.apellidos);
                System.out.println("Dirección: " + actual.paciente.direccion);
                System.out.println("Teléfono: " + actual.paciente.telefono);
                System.out.println("Edad: " + actual.paciente.edad);
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No se encontró ningún paciente con esa edad.");
    }

    void eliminarPaciente(int codigo) {
        Nodo2 actual = inicio;
        while (actual != null) {
            if (actual.paciente.codigo == codigo) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    inicio = actual.siguiente;
                }
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    fin = actual.anterior;
                }
                System.out.println("Paciente eliminado.");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No se encontró ningún paciente con ese código.");
    }
}

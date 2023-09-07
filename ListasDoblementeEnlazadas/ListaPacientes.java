package ListasDoblementeEnlazadas;

public class ListaPacientes {

    Nodo2 inicio;
    Nodo2 fin;

    ListaPacientes() {
        inicio = null;
        fin = null;
    }

    public void registrarPaciente(Paciente paciente){
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


package ListasEnlazadas;

public class ListaProfesor {

    Nodo primerNodo;

    public ListaProfesor() {
        this.primerNodo = null;
    }

    // 1. REGISTRAR PROFESOR
    public void registrarProfesor(Profesor profesor) {
        Nodo nuevoNodo = new Nodo(profesor);
        nuevoNodo.siguiente = primerNodo;
        primerNodo = nuevoNodo;
        System.out.println("Profesor registrado exitosamente.");
    }

    // 2. MOSTRAR LISTADO DE PROFESORES
    public void mostrarListadoProfesores() {
        Nodo nodoActual = primerNodo;
        System.out.println("Listado de profesores:");
        while (nodoActual != null) {
            System.out.println("Codigo: " + nodoActual.profesor.codigo);
            System.out.println("Nombre: " + nodoActual.profesor.nombre);
            System.out.println("Apellido: " + nodoActual.profesor.apelido);
            System.out.println("Celular: " + nodoActual.profesor.celular);
            System.out.println("-----------------------");
            nodoActual = nodoActual.siguiente;

        }
    }

    // 3. BUSCAR PROFESOR POR CODIGO
    public void buscarProfesorCodigo(int codigo) {
        Nodo nodoActual = primerNodo;
        while (nodoActual != null) {
            if (nodoActual.profesor.codigo == codigo) {
                System.out.println("Profesor encontrado: ");
                System.out.println("Codigo: " + nodoActual.profesor.codigo);
                System.out.println("Nombre: " + nodoActual.profesor.nombre);
                System.out.println("Apellido: " + nodoActual.profesor.apelido);
                System.out.println("Celular: " + nodoActual.profesor.celular);
                return;
            }
            nodoActual = nodoActual.siguiente;
        }
        System.out.println("Profesor con codigo " + codigo + " no encontrado.");
    }

    //ELIMINAR PROFESOR POR CODIGO
    public void eliminarProfesorCodigo(int codigo){
        Nodo nodoActual = primerNodo;
        Nodo nodoAnterior = null;

        while (nodoActual != null){
            if(nodoActual.profesor.codigo == codigo){
                if(nodoAnterior == null){
                    primerNodo = nodoActual.siguiente;
                }else{
                    nodoAnterior.siguiente = nodoActual.siguiente;
                }
                System.out.println("Profesor con codigo " + codigo + " fue eliminado.");
                return;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        }
        System.out.println("Profesor con codigo " + codigo + " no encontrado");
    }
}

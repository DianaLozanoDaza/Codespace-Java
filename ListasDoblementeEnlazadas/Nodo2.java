package ListasDoblementeEnlazadas;

public class Nodo2 {
    
    Paciente paciente;
    Nodo2 siguiente;
    Nodo2 anterior;

    public Nodo2 (Paciente paciente){
        this.paciente = paciente;
        this.siguiente = null;
        this.anterior = null;
    }
}

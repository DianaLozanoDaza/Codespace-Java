package ListasEnlazadas;

public class Nodo {
    
    Profesor profesor;
    Nodo siguiente;

    public Nodo(Profesor profesor) {
        this.profesor = profesor;
        this.siguiente = null;
    }  
}

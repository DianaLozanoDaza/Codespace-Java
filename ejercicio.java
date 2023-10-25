import java.util.ArrayList;
import java.util.List;
public class ejercicio {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class GestionDePersonas {
    public static void main(String[] args) {
        List<Persona> listaDePersonas = new ArrayList<>();

        // Agregar personas a la lista
        listaDePersonas.add(new Persona("Juan", 25));
        listaDePersonas.add(new Persona("María", 30));
        listaDePersonas.add(new Persona("Pedro", 40));

        // Actualizar una persona en la lista
        for (Persona persona : listaDePersonas) {
            if (persona.nombre.equals("María")) {
                persona.edad = 31; // Actualiza la edad de María
                break; // Sale del bucle después de la actualización
            }
        }

        // Borrar una persona de la lista
        for (Persona persona : listaDePersonas) {
            if (persona.nombre.equals("Pedro")) {
                listaDePersonas.remove(persona); // Elimina a Pedro de la lista
                break; // Sale del bucle después de la eliminación
            }
        }

        // Mostrar la lista actualizada
        for (Persona persona : listaDePersonas) {
            System.out.println("Nombre: " + persona.nombre + ", Edad: " + persona.edad);
        }
    }
}
}

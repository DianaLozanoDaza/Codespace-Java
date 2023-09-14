package DatosPermanentes;

import java.io.Serializable;

class RegistroProfesor implements Serializable {
    int codigo;
    String nombre;
    String apellido;
    String celular;

    public RegistroProfesor(int codigo, String nombre, String apellido, String celular) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
}

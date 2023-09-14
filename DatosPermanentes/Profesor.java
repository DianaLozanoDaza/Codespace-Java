package DatosPermanentes;

import java.io.Serializable;

class Profesor implements Serializable {
    RegistroProfesor registro;

    public Profesor(int codigo, String nombre, String apellido, String celular) {
        this.registro = new RegistroProfesor(codigo, nombre, apellido, celular);
    }

    @Override
    public String toString() {
        return "Código: " + registro.codigo + "\nNombre: " + registro.nombre + "\nApellido: " + registro.apellido
                + "\nCelular: " + registro.celular;
    }
}

package Estructuras_de_datos.ListasDoblementeEnlazadas;

public class Paciente {
    
    int codigo, edad;
    String nombres, apellidos, direccion, telefono;

    public Paciente(int codigo, String telefono,  String nombres, String apellidos, String direccion, int edad) {
        this.codigo = codigo;
        this.telefono = telefono;
        this.edad = edad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }   
}

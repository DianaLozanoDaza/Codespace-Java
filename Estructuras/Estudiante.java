package Estructuras;

import java.util.*;

public class Estudiante {

    Scanner scanner = new Scanner(System.in);

    //Atributos
    private int codigo, edad;
    private String nombre, apellido, fecha_nac, direccion;
    private float nota1, nota2, nota3, promedio;

    //Metodos setters y getters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void ingresarInformacionEstudiante(){
        System.out.println("Ingresa el codigo del estudiante:");
        setCodigo(scanner.nextInt());
        scanner.nextLine();
        
        System.out.println("Ingresa el nombre del estudiante:");
        setNombre(scanner.nextLine());
        
        System.out.println("Ingresa el apellido del estudiante:");
        setApellido(scanner.nextLine());

        System.out.println("Ingresa la edad del estudiante:");
        setEdad(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Ingresa la fecha de nacimiento del estudiante (dia, mes, año):");
        setFecha_nac(scanner.nextLine());
        
        System.out.println("Ingresa la direccion del estudiante (dirección, estrato, barrio y ciudad):");
        setDireccion(scanner.nextLine());

        System.out.println("Ingresa la nota 1 del estudiante:");
        setNota1(scanner.nextFloat());
        scanner.nextLine();

        System.out.println("Ingrese la nota 2 del estudiante:");
        setNota2(scanner.nextFloat());
        scanner.nextLine();

        System.out.println("Ingrese la nota 3 del estudiante:");
        setNota3(scanner.nextFloat());
        scanner.nextLine();

        setPromedio((getNota1()+getNota2()+getNota3())/3);
        System.out.printf("El promedio de las notas del estudiante es: %.2f%n",  promedio );
        
    }
}

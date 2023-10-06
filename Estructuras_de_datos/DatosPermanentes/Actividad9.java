package Estructuras_de_datos.DatosPermanentes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Profesor> listaProfesores = new ArrayList<>();

        int opcion;

        do {
            System.out.println("********************");
            System.out.println("     MENÚ     ");
            System.out.println("1. REGISTRAR PROFESOR.");
            System.out.println("2. MOSTRAR LISTADO PROFESORES.");
            System.out.println("3. CREAR Y GUARDAR LISTADO PROFESORES.");
            System.out.println("4. RECUPERAR DATOS DEL ARCHIVO.");
            System.out.println("5. BUSCAR PROFESORES POR CODIGO.");
            System.out.println("6. ELIMINAR PROFESOR POR CODIGO.");
            System.out.println("7. SALIR.");

            System.out.println("\nSELECCIONE UNA OPCIÓN DEL MENÚ: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.println("Ingrese el codigo del profesor: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del profesor: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el apellido del profesor: ");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el celular del profesor: ");
                    String celular = scanner.nextLine();
                    Profesor nuevoProfesor = new Profesor(codigo, nombre, apellido, celular);
                    listaProfesores.add(nuevoProfesor);
                    System.out.println("\n");
                    break;

                case 2:
                    listaProfesores.forEach(profesor -> System.out.println(profesor.toString()));
                    break;

                case 3:
                    guardarProfesoresEnArchivo(listaProfesores);
                    System.out.println("Listado de Profesores guardado en el archivo.");
                    break;

                case 4:
                    List<Profesor> profesoresRecuperados = recuperarProfesoresDeArchivo();
                    if (profesoresRecuperados != null) {
                        listaProfesores = profesoresRecuperados;
                        System.out.println("Datos recuperados del archivo.");
                    } else {
                        System.out.println("No se pudo recuperar ningún dato del archivo.");
                    }
                    break;

                case 5:
                    System.out.println("\n");
                    System.out.println("Ingrese el codigo del profesor que quiere buscar: ");
                    int codigoBuscar = scanner.nextInt();
                    listaProfesores.stream()
                            .filter(profesor -> profesor.registro.codigo == codigoBuscar)
                            .forEach(profesor -> System.out.println(profesor.toString()));
                    System.out.println("\n");
                    break;

                case 6:
                    System.out.println("\n");
                    System.out.println("Ingrese el codigo del profesor que quiere eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    listaProfesores.removeIf(profesor -> profesor.registro.codigo == codigoEliminar);
                    System.out.println("---Profesor con codigo " + codigoEliminar + " fue eliminado---");
                    System.out.println("\n");
                    break;

                case 7:
                    System.out.println("\n");
                    System.out.println("---Saliendo del programa...---");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo");
                    break;
            }
        } while (opcion != 7);

    }
    private static void guardarProfesoresEnArchivo(List<Profesor> profesores) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("profesores.dat"))) {
            oos.writeObject(profesores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Profesor> recuperarProfesoresDeArchivo() {
        List<Profesor> profesores = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("profesores.dat"))) {
            profesores = (List<Profesor>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return profesores;
    }
}

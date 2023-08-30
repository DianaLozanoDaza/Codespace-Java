package Estructuras;

import java.util.*;

public class EstructurasConArreglos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];

        // 3. Mostrar los datos del estudiante que obtuvo el promedio mayor.
        Estudiante estudianteConPromedioMasAlto = null;
        double promedioMasAlto = 0.0;

        //4. Mostrar los datos del estudiante que obtuvo la nota más baja en promedio.
        Estudiante estudianteConPromedioMasBajo = null;
        float promedioMasBajo = Float.MAX_VALUE;

        //5. Mostrar los datos del estudiante que obtuvo la nota más baja en el campo nota1
        Estudiante estudianteConNota1MasBaja = null;
        float nota1MasBaja = Float.MAX_VALUE;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            estudiantes[i] = new Estudiante();
            estudiantes[i].ingresarInformacionEstudiante();

            // 3. Mostrar los datos del estudiante que obtuvo el promedio mayor.
            float promedioAltoEstudiante = estudiantes[i].getPromedio();
            if (promedioAltoEstudiante > promedioMasAlto) {
                promedioMasAlto = promedioAltoEstudiante;
                estudianteConPromedioMasAlto = estudiantes[i];
            }

            //4. Mostrar los datos del estudiante que obtuvo la nota más baja en promedio.
            float promedioBajoEstudiante = estudiantes[i].getPromedio();
            if (promedioBajoEstudiante < promedioMasBajo){
                promedioMasBajo = promedioBajoEstudiante;
                estudianteConPromedioMasBajo = estudiantes[i];
            }

            //5. Mostrar los datos del estudiante que obtuvo la nota más baja en el campo nota1
            float nota1BajaEstudiante = estudiantes[i].getNota1();
            if (nota1BajaEstudiante < nota1MasBaja){
                nota1MasBaja = nota1BajaEstudiante;
                estudianteConNota1MasBaja = estudiantes[i];
            }
        }

        // 1. Calcular y mostrar el promedio de las edades de todos los estudiantes.
        double sumaEdades = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaEdades += estudiante.getEdad();
        }

        double promedioEdades = sumaEdades / cantidadEstudiantes;
        System.out.println("\nEL PROMEDIO DE LAS EDADES DE TODOS LOS ESTUDIANTES ES: " + promedioEdades);

        // 2. Mostrar los datos de los estudiantes mayores de edad (edad >= 18).
        mostrarEstudiantesMayoresDeEdad(estudiantes);

        // 3. Mostrar los datos del estudiante que obtuvo el promedio mayor.
        if (estudianteConPromedioMasAlto != null) {
            System.out.println("\nDATOS DEL ESTUDIANTE CON EL PROMEDIO MAS ALTO:");
            System.out.println("Código: " + estudianteConPromedioMasAlto.getCodigo());
            System.out.println("Nombre: " + estudianteConPromedioMasAlto.getNombre());
            System.out.println("Apellido: " + estudianteConPromedioMasAlto.getApellido());
            System.out.println("Edad: " + estudianteConPromedioMasAlto.getEdad());
            System.out.println("Fecha de nacimiento: " + estudianteConPromedioMasAlto.getFecha_nac());
            System.out.println("Dirección: " + estudianteConPromedioMasAlto.getDireccion());
            System.out.println("Notas: " + estudianteConPromedioMasAlto.getNota1() + ", "
                    + estudianteConPromedioMasAlto.getNota2() + ", " + estudianteConPromedioMasAlto.getNota3());
            System.out.printf("Promedio de las notas: %.2f%n", estudianteConPromedioMasAlto.getPromedio());
        }

        //4. Mostrar los datos del estudiante que obtuvo la nota más baja en promedio.
         if (estudianteConPromedioMasBajo != null) {
            System.out.println("\nDATOS DEL ESTUDIANTE CON EL PROMEDIO MAS BAJO:");
            System.out.println("Código: " + estudianteConPromedioMasBajo.getCodigo());
            System.out.println("Nombre: " + estudianteConPromedioMasBajo.getNombre());
            System.out.println("Apellido: " + estudianteConPromedioMasBajo.getApellido());
            System.out.println("Edad: " + estudianteConPromedioMasBajo.getEdad());
            System.out.println("Fecha de nacimiento: " + estudianteConPromedioMasBajo.getFecha_nac());
            System.out.println("Dirección: " + estudianteConPromedioMasBajo.getDireccion());
            System.out.println("Notas: " + estudianteConPromedioMasBajo.getNota1() + ", "
                    + estudianteConPromedioMasBajo.getNota2() + ", " + estudianteConPromedioMasBajo.getNota3());
            System.out.printf("Promedio de las notas: %.2f%n", estudianteConPromedioMasBajo.getPromedio());
        }

        //5. Mostrar los datos del estudiante que obtuvo la nota más baja en el campo nota1
        if (estudianteConNota1MasBaja != null) {
            System.out.println("\nDATOS DEL ESTUDIANTE CON LA NOTA 1 MAS BAJA:");
            System.out.println("Código: " + estudianteConNota1MasBaja.getCodigo());
            System.out.println("Nombre: " + estudianteConNota1MasBaja.getNombre());
            System.out.println("Apellido: " + estudianteConNota1MasBaja.getApellido());
            System.out.println("Edad: " + estudianteConNota1MasBaja.getEdad());
            System.out.println("Fecha de nacimiento: " + estudianteConNota1MasBaja.getFecha_nac());
            System.out.println("Dirección: " + estudianteConNota1MasBaja.getDireccion());
            System.out.println("Notas: " + estudianteConNota1MasBaja.getNota1() + ", "
                    + estudianteConNota1MasBaja.getNota2() + ", " + estudianteConNota1MasBaja.getNota3());
            System.out.printf("Promedio de las notas: %.2f%n", estudianteConNota1MasBaja.getPromedio());
        }


    }

    // 2. Mostrar los datos de los estudiantes mayores de edad (edad >= 18).
    public static void mostrarEstudiantesMayoresDeEdad(Estudiante[] estudiantes) {
        System.out.println("\nDATOS DE LOS ESTUDIANTES MAYORES DE EDAD:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEdad() >= 18) {
                System.out.println("Codigo: " + estudiante.getCodigo());
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Apellido: " + estudiante.getApellido());
                System.out.println("Edad: " + estudiante.getEdad());
                System.out.println("Fecha de nacimiento: " + estudiante.getFecha_nac());
                System.out.println("Dirección: " + estudiante.getDireccion());
                System.out.println("NOmbre: " + estudiante.getNombre());
                System.out.println("Notas: " + estudiante.getNota1() + ", " + estudiante.getNota2() + ", "
                        + estudiante.getNota3());
                System.out.printf("Promedio de las notas: %.2f%n" , estudiante.getPromedio(), "\n");
            }
        }
    }

}

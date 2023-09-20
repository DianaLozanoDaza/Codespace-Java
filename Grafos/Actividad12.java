package Grafos;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVertices = 0;
        int numEdges = 0;
        Graph graph = null;

        while (true) {
            System.out.println("\n********************** BIENVENIDOS ***************************");

            System.out.println("1. Crear grafo");
            System.out.println("2. Mostrar Matriz de Adyacencia");
            System.out.println("3. Mostrar Matriz de Incidencia");
            System.out.println("4. Mostrar Matriz de Arcos");
            System.out.println("5. Mostrar Matriz de Distancia");
            System.out.println("6. Salir");

            System.out.println("Escoja la opción:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Número de vértices en el grafo: ");
                    numVertices = scanner.nextInt();
                    graph = new Graph(numVertices);
                    System.out.print("Número de aristas: ");
                    numEdges = scanner.nextInt();
                    for (int i = 0; i < numEdges; i++) {
                        System.out.println("Arista " + (i + 1));
                        System.out.print("Origen: ");
                        int src = scanner.nextInt();
                        System.out.print("Destino: ");
                        int dest = scanner.nextInt();
                        System.out.print("Peso: ");
                        int weight = scanner.nextInt();
                        graph.addEdge(src, dest, weight);
                    }
                    break;

                case 2:
                    if (graph != null) {
                        graph.displayAdjacencyMatrix();
                    } else {
                        System.out.println("Cree un grafo primero.");
                    }
                    break;

                case 3:
                    if (graph != null) {
                        graph.displayIncidenceMatrix();
                    } else {
                        System.out.println("Cree un grafo primero.");
                    }
                    break;

                case 4:
                    if (graph != null) {
                        graph.displayArcMatrix();
                    } else {
                        System.out.println("Cree un grafo primero.");
                    }
                    break;

                case 5:
                    if (graph != null) {
                        graph.calculateDistanceMatrix();
                        graph.displayDistanceMatrix();
                    } else {
                        System.out.println("Cree un grafo primero.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

package Grafos;

public class Graph {
    private int[][] adjacencyMatrix;
    private int[][] incidenceMatrix;
    private int[][] arcMatrix;
    private int[][] distanceMatrix;
    private int numVertices;
    private int numEdges;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.numEdges = 0;
        this.adjacencyMatrix = new int[numVertices][numVertices];
        this.incidenceMatrix = new int[numVertices][numEdges];
        this.arcMatrix = new int[numVertices][numVertices];
        this.distanceMatrix = new int[numVertices][numVertices];
    }

        public void addEdge(int src, int dest, int weight) {
            adjacencyMatrix[src][dest] = weight;
            adjacencyMatrix[dest][src] = weight;
    
            // Actualizamos incidenceMatrix solo cuando se agrega la primera arista
            if (numEdges == 0) {
                incidenceMatrix = new int[numVertices][1];
            } else {
                int[][] newIncidenceMatrix = new int[numVertices][numEdges + 1];
                for (int i = 0; i < numVertices; i++) {
                    for (int j = 0; j < numEdges; j++) {
                        newIncidenceMatrix[i][j] = incidenceMatrix[i][j];
                    }
                }
                incidenceMatrix = newIncidenceMatrix;
            }
    
            incidenceMatrix[src][numEdges] = 1;
            incidenceMatrix[dest][numEdges] = 1;
    
            arcMatrix[src][dest] = 1;
            arcMatrix[dest][src] = 1;
    
            numEdges++;
        }
    

    public void calculateDistanceMatrix() {
        // Implementa el cálculo de la matriz de distancia (por ejemplo, algoritmo de Floyd-Warshall).
    }

    public void displayAdjacencyMatrix() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayIncidenceMatrix() {
        System.out.println("Matriz de Incidencia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numEdges; j++) {
                System.out.print(incidenceMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayArcMatrix() {
        System.out.println("Matriz de Arcos:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(arcMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayDistanceMatrix() {
        System.out.println("Matriz de Distancia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(distanceMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

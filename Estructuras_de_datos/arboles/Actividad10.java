package Estructuras_de_datos.arboles;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n************ MENÚ PRINCIPAL *****************");
            System.out.println("1. Insertar elemento en el árbol");
            System.out.println("2. Mostrar elementos del árbol");
            System.out.println("3. Buscar elemento en el árbol");
            System.out.println("4. Eliminar nodo del árbol");
            System.out.println("5. Salir");
            System.out.println("************************************************");
            System.out.print("Seleccione una opción: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el elemento a insertar (Número entero): ");
                    int insertValue = scanner.nextInt();
                    tree.insert(insertValue);
                    break;

                case 2:
                    System.out.print("Elementos del árbol: ");
                    tree.display();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Ingrese el elemento a buscar: ");
                    int searchValue = scanner.nextInt();
                    if (tree.search(searchValue)) {
                        System.out.println("El elemento " + searchValue + " se encuentra en el árbol.");
                    } else {
                        System.out.println("El elemento " + searchValue + " no se encuentra en el árbol.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el elemento a eliminar: ");
                    int deleteValue = scanner.nextInt();
                    tree.delete(deleteValue);
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

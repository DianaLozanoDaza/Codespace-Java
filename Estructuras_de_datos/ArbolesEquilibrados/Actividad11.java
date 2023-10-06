package Estructuras_de_datos.ArbolesEquilibrados;

public class Actividad11 {

    public static void main(String[] args) {
        int[] keys = { 100, 29, 71, 82, 48, 39, 101, 22, 46, 17, 3, 20, 25, 10 };
        AVLTree avlTree = new AVLTree();

        System.out.println("Árbol AVL inicial:");
        for (int key : keys) {
            avlTree.insert(key);
        }
        avlTree.inorder();

        System.out.println("\n\nEliminando claves consecutivamente:");
        for (int key : keys) {
            avlTree.delete(key);
            System.out.print("Eliminando " + key + ": ");
            avlTree.inorder();
            System.out.println();
        }
    }
}

package Estructuras_de_datos.ArbolesEquilibrados;

public class AVLTree {
    private TreeEquilNode root;

    public AVLTree() {
        this.root = null;
    }

    private int height(TreeEquilNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private int balanceFactor(TreeEquilNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private TreeEquilNode rightRotate(TreeEquilNode y) {
        TreeEquilNode x = y.left;
        TreeEquilNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private TreeEquilNode leftRotate(TreeEquilNode x) {
        TreeEquilNode y = x.right;
        TreeEquilNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeEquilNode insertRec(TreeEquilNode node, int data) {
        if (node == null) {
            return new TreeEquilNode(data);
        }

        if (data < node.data) {
            node.left = insertRec(node.left, data);
        } else if (data > node.data) {
            node.right = insertRec(node.right, data);
        } else {
            return node; // No permitir duplicados
        }

        int balance = balanceFactor(node);

        // Casos de rotación
        if (balance > 1) {
            if (data < node.left.data) {
                return rightRotate(node);
            } else if (data > node.left.data) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (balance < -1) {
            if (data > node.right.data) {
                return leftRotate(node);
            } else if (data < node.right.data) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private TreeEquilNode deleteRec(TreeEquilNode root, int data) {
        // Eliminación estándar de BST
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if ((root.left == null) || (root.right == null)) {
                TreeEquilNode temp = null;
                if (temp == root.left) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }

                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                TreeEquilNode temp = minValueNode(root.right);
                root.data = temp.data;
                root.right = deleteRec(root.right, temp.data);
            }
        }

        // Si el árbol tenía solo un nodo, devolvemos ese nodo
        if (root == null) {
            return root;
        }

        // Actualizar la altura del nodo actual
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // Verificar el equilibrio del nodo actual
        int balance = balanceFactor(root);

        // Rotaciones según el equilibrio
        if (balance > 1 && balanceFactor(root.left) >= 0) {
            return rightRotate(root);
        }

        if (balance > 1 && balanceFactor(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && balanceFactor(root.right) <= 0) {
            return leftRotate(root);
        }

        if (balance < -1 && balanceFactor(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private TreeEquilNode minValueNode(TreeEquilNode node) {
        TreeEquilNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(TreeEquilNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

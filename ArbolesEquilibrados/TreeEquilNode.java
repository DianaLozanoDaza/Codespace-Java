package ArbolesEquilibrados;

public class TreeEquilNode {
    int data;
    TreeEquilNode left;
    TreeEquilNode right;
    int height;

    public TreeEquilNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}

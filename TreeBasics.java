class Node {
    int key;
    Node right, left;

    public Node(int item) {
        key = item;
        right = left = null;
    }
}

public class TreeBasics {

    Node root;

    TreeBasics(int item) {
        root = new Node(item);
    }

    TreeBasics() {
        root = null;
    }

    public static void main(String[] args) {
        TreeBasics tree = new TreeBasics();
        tree.root = new Node(2);
        
        tree.root.left = new Node(3);
        tree.root.right = new Node(4);

        tree.root.left.left = new Node(5);
        
    }
}
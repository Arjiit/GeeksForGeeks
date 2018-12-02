class Node{
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        right = left = null;
    }
}

public class printLevel {
    Node root;

    public printLevel(int item) {
        root = new Node(item);
    }

    public printLevel() {
        root = null;
    }

    public void printLevelOrder(){
        int h = height(root);
        int i;
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i);
        }
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);

            return 1 + Math.max(lheight, rheight);
        }
    }

    public void printGivenLevel(Node root, int level) {
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.key);
        }
        else if (level > 1) { 
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        printLevel tree = new printLevel();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Level order traversal is");
        tree.printLevelOrder();
    }
}
public class bstBasics {

// search and insert O(h) (h is the height of BST)

// inorder traversal always produces sorted output.



    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

// constructor
    bstBasics() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }

        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

// function to do inorder traversal in BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public Node search(Node root, int key) {
        if (root == null || root.key = key) {
            return root;
        }

        if (root.key > key) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    
    public static void main(String[] args) {
        bstBasics tree = new bstBasics();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();

    }

}
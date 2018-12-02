import java.util.Queue;
import java.util.LinkedList;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        right = left = null;
    }
}



public class levelTraversalBinaryTree {
    Node root;

    levelTraversalBinaryTree(int item) {
        root = new Node(item);
    }
    
    levelTraversalBinaryTree() {
        root = null;
    }
    
    public void levelTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root);

        while(!q1.isEmpty() || !q2.isEmpty()) {
            while(!q1.isEmpty()) {
                root = q1.poll();
                System.out.println(root.key);
                if (root.left != null) {
                    q2.add(root.left);
                }
                if (root.right != null) {
                    q2.add(root.right);
                }
            }
            System.out.println();
            while (!q2.isEmpty()) {
                root = q2.poll(); // Poll - Retrieves and removes the head of this queue, or returns null if this queue is empty.
                System.out.println(root.key);
                if (root.left != null) {
                    q1.add(root.left);
                }
                if (root.right != null) {
                    q1.add(root.right);
                }
            }
            System.out.println();
        }
    }

    public void levelByLevelOneQueueUsingCount(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            root = q.poll();
            if (root != null) {
            System.out.println(root.key);
            if (root.left != null) {
                q.add(root.left);
            }

            if (root.right != null) {
                q.add(root.right);
            }
            }
            else {
                if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                }
            }
        }
    }



    public static void main(String[] args) {
    
}
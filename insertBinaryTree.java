import java.util.LinkedList;
import java.util.Queue;

public class insertBinaryTree {

static class Node {
    int key;
    Node left, right;
Node (int item) {
    key = item;
    right = left = null;
}
}

    static Node root;
    static Node temp = root;

// inorder traversal of binary tree
    static void inorder(Node temp) {
        if (temp == null) {
            return;
        }

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }

    // inserting into first null left/ right child of node
    static void insert(Node temp, int key) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while(!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }
    }

    public static void deleteNode(Node root, int key) {
        Node temp = root;
        Queue<Node> q = new LinkedList<Node>();
        Node temp2 = null;
        q.add(temp);

        if (temp.left == null && temp.right == null) {
            temp = null;
            System.out.print("No nodes in the tree!");
        }

        while(!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.key == key) {
                temp2 = temp;
            }

            if (temp.left != null) {
                q.add(temp.left);
            }

            if (temp.right != null) {
                q.add(temp.right);
            }  
        }

        int x = temp.key;
        deleteDeepestNode(root, temp);
        temp2.key = x;
    }

    public static void deleteDeepestNode(Node root, Node deepNode) {
        Node temp = root;
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while(!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.right != null) {
                if (temp.right == deepNode) {
                    temp.right = null;
                }
                else {
                    q.add(temp.right);
                }

                if (temp.left != null) {
                    if (temp.left == deepNode) {
                        temp.left = null;
                    }
                    else {
                        q.add(temp.left);
                    }
                }
            }
        }
    }


    
    public static void main(String[] args) {
        root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root);

        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        inorder(root);
        System.out.println();
        deleteNode(root, 15);
        inorder(root);
    }
}
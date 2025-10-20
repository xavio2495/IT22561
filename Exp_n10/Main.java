class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class Main {
    Node root;
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {root.left = insert(root.left, data);}
        else if (data > root.data) {root.right = insert(root.right, data);}
        return root;
    }
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
    boolean search(Node root, int key) {
        if (root == null) {return false;}
        if (root.data == key) {return true;}
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    Node delete(Node root, int key) {
        if (root == null) {return null;}
        if (key < root.data) {root.left = delete(root.left, key);}
        else if (key > root.data) {root.right = delete(root.right, key);}
        else {
            if (root.left == null) {return root.right;}
            else if (root.right == null) {return root.left;}
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        Main bst = new Main();
        System.out.println("\tBinary Search Tree Operations\n");
        int[] elements = {50, 30, 70, 20, 40, 60, 80};
        for (int num : elements) {bst.root = bst.insert(bst.root, num);}
        System.out.print("Inorder Traversal:   ");
        bst.inorder(bst.root);
        System.out.println();
        System.out.print("Preorder Traversal:  ");
        bst.preorder(bst.root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        bst.postorder(bst.root);
        System.out.println();
        int key = 40;
        System.out.println("\nSearching for " + key + ": " + (bst.search(bst.root, key)? "Found" : "Not Found"));
        System.out.println("\nDeleting 20...");
        bst.root = bst.delete(bst.root, 20);
        System.out.print("Inorder after deletion: ");
        bst.inorder(bst.root);
        System.out.println();
        System.out.println("Deleting 30...");
        bst.root = bst.delete(bst.root, 30);
        System.out.print("Inorder after deletion: ");
        bst.inorder(bst.root);
        System.out.println();
        System.out.println("Deleting 50...");
        bst.root = bst.delete(bst.root, 50);
        System.out.print("Inorder after deletion: ");
        bst.inorder(bst.root);
    }
}

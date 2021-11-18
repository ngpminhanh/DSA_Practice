package Week10;

import java.util.Scanner;

public class InsertaNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insertANode(root, data);
        }

    }

    private static Node insertANode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node tmp;
            if (data <= root.data) {
                tmp = insertANode(root.left, data);
                root.left = tmp;
            } else {
                tmp = insertANode(root.right, data);
                root.right = tmp;
            }
        }
        return root;
    }
}

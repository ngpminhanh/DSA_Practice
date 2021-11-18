package Week10;

import java.util.Scanner;

public class HeightofaBinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        int height = heightofaBinaryTree(root);
        System.out.println(height);
    }

    private static int heightofaBinaryTree(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(heightofaBinaryTree(root.left), heightofaBinaryTree(root.right));
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node tmp;
            if (data <= root.data) {
                tmp = insert(root.left, data);
                root.left = tmp;
            } else {
                tmp = insert(root.right, data);
                root.right = tmp;
            }
        }
        return root;
    }


}

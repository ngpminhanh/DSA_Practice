package Week10;

import java.util.Scanner;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insertANode(root, data);
        }
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);

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

    public static Node lca(Node root, int v1, int v2) {
        if (root == null) {
            return null;
        }
        if (v1 == root.data || v2 == root.data) {
            return root;
        }
        if (v1 < root.data && v2 < root.data) {
            return lca(root.left, v1, v2);
        }
        if (v1 > root.data && v2 > root.data) {
            return lca(root.right, v1, v2);
        }
        else {
            return root;
        }
    }
}

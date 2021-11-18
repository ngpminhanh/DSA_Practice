package Week10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BSTCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            root = insertANode(root, data);
        }
        List<Integer> array = new ArrayList<>();
        arrayAdd(root, array);
        if (checkBST(root, array)) {
            System.out.println("Yes");
        } else {
            System.out.println("Yes");
        }
    }

    private static boolean checkBST(Node root, List<Integer> array) {
        for (int i = 0; i < array.size() -1; i++) {
            if (array.get(i) >= array.get(i+1)) {
                return false;
            }
        }
        return true;
    }

    private static void arrayAdd(Node root, List<Integer> array) {
        if (root == null) {
            return;
        }
        arrayAdd(root.left, array);
        array.add(root.data);
        arrayAdd(root.right, array);
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

package Week9;

import java.util.*;
import java.io.*;


class OrderTraversal {

    /*

    class Node
        int data;
        Node left;
        Node right;
    */
    public static void levelOrder(Node root) {
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root);
        while(!q1.isEmpty() || !q2.isEmpty()) {
            while(!q1.isEmpty()) {
                Node mid = q1.poll();
                if(mid.left != null) {
                    q2.add(mid.left);
                }
                if(mid.right != null) {
                    q2.add(mid.right);
                }
                System.out.print(mid.data + " ");
            }
            while(!q2.isEmpty()) {
                Node mid = q2.poll();
                if(mid.left != null) {
                    q1.add(mid.left);
                }
                if(mid.right != null) {
                    q1.add(mid.right);
                }
                System.out.print(mid.data + " ");
            }
        }

    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}
package Week4;

import LinkedList.SList;

public class SinglyLinkedList {
    Node head;
    Node new_head;
    Node tmp;

    public void insertNode(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(data, null);
        }

    }

    public void insertNodeAtHead(int data) {
        if (head == null) {
            head = new Node(data, null);
        } else {
            Node newNode = new Node(data, head);
            head = newNode;

        }
    }

    public void insertANodeAtaSpecificPos(int data, int position) {
        Node newNode = new Node(data, null);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position -1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteANode(int position) {
        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position -1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public void printInReverse(Node head) {
       /* int[] array = new int[n];
        Node current = head;
        int i = 0;
        while (current != null) {
            array[i] = current.data;
            current = current.next;
            i++;
        }
        for (i = n-1; i >= 0; i--) {
            System.out.println(array[i]);
        } */
        if (head == null) {

        } else {
            printInReverse(head.next);
            System.out.println(head.data);
        }


    }

    public void reverseALinkedList(Node head) {
        if (head.next == null) {
            new_head = new Node(head.data, null);
            tmp = new_head;
        } else if (head == null) {

        } else {
            reverseALinkedList(head.next);
            tmp.next = new Node(head.data, null);
            tmp = tmp.next;
        }

    }

    public static boolean compareTwoLinkedList(Node head1, Node head2) {
        if (head1 == null && head2 == null) return true;
        if (head1 == null || head2 == null) return false;
        if (head1.data == head2.data) {
            return compareTwoLinkedList(head1.next, head2.next);
        }
        return false;

    }

    public static int getNode(Node head, int positionFromTail) {
        // Write your code here
        Node current = head;
        Node tmp = head;
        for (int i = 0 ;i <= positionFromTail; i++) {
            current = current.next;
        }
        while (current != null) {
            current = current.next;
            tmp = tmp.next;
        }
        return tmp.data;


    }




    public void printLinkedlist(Node head) {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private class Node {
        int data;
        Node next;
        Node (int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}

package Week4;

import edu.princeton.cs.algs4.StdIn;

public class CompareTwoLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        int n = StdIn.readInt();
        for (int i = 0; i < n; i++) {
            list1.insertNode(StdIn.readInt());
        }
        int m = StdIn.readInt();
        for (int i = 0; i < m; i++) {
            list2.insertNode(StdIn.readInt());
        }
        if (SinglyLinkedList.compareTwoLinkedList(list1.head, list2.head)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }


}

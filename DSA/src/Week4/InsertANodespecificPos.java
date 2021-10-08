package Week4;

import edu.princeton.cs.algs4.StdIn;
public class InsertANodespecificPos {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        int n = StdIn.readInt();
        int position = StdIn.readInt();
        while (position > n || position < 0) {
            position = StdIn.readInt();
        }
        for (int i = 1; i <= n; i++) {
            list.insertNode(StdIn.readInt());
        }
        list.insertANodeAtaSpecificPos(5, position);
        list.printLinkedlist(list.head);

    }
}

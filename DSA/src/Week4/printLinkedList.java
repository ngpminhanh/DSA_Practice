package Week4;


import edu.princeton.cs.algs4.StdIn;

    public class printLinkedList {
        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();
            int n = StdIn.readInt();
            for (int i = 1; i <= n; i++) {
                list.insertNode(StdIn.readInt());
            }
            list.printLinkedlist(list.head);


        }
    }



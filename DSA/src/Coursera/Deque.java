package Coursera;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int nodetotal;
    // construct an empty deque
    public Deque() {
        nodetotal = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return nodetotal == 0;
    }

    // return the number of items on the deque
    public int size() {
        return nodetotal;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) throw new IllegalArgumentException("input must be not null");
        Node newNode = new Node(item);
        if (first == null) {
            first = newNode;
            last = first;
            nodetotal = nodetotal + 1;
            return;
        }
        Node oldFirst = first;
        first = newNode;
        first.right = oldFirst;
        first.right.left = first;
        nodetotal = nodetotal + 1;
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) throw new IllegalArgumentException("input must be not null");
        Node newNode = new Node(item);
        if (first == null) {
            first = newNode;
            last = first;
            nodetotal = nodetotal + 1;
            return;
        }
        Node oldLast = last;
        last = newNode;
        last.left = oldLast;
        last.left.right = last;
        nodetotal = nodetotal + 1;

    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("Coursera.Deque underflow");
        Item item = first.item;
        nodetotal = nodetotal - 1;
        if (isEmpty()) {
            first = null;
            last = null;
        } else {
            first = first.right;
            first.left = null;
        }
        return item;
    }


    // remove and return  public Iterator<Item> iterator() {}
    //
    //    // unit testing (required) the item from the back
    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException("Coursera.Deque underflow");
        Item item = last.item;
        nodetotal = nodetotal - 1;
        if (isEmpty()) {
            first = null;
            last = null;
        } else {
            last = last.left;
            last.right = null;
        }
        return item;

    }
    @Override
    public Iterator<Item> iterator() {
        return new llIterator();
    }

    // return an iterator over items in order from front to back

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        deque.addFirst(1);
        deque.removeLast();
        System.out.println(deque.isEmpty());
    }

    private class Node {
        private Item item;
        private Node left;
        private Node right;

        public Node (Item item) {
            this.item = item;
            left = null;
            right = null;
        }


    }

    private class llIterator implements Iterator<Item> {
        private Node cur = first;
        public boolean hasNext() {
            if (cur != null) {
                return true;
            }
            return false;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = cur.item;
            cur = cur.right;
            return item;

        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
package Coursera;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {

    // construct an empty randomized queue
    private Item[] array;
    private int n;
    public RandomizedQueue() {
        n = 0;
        array = (Item[]) new Object[2];
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return n == 0;
    }

    // return the number of items on the randomized queue
    public int size() {
        return n;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) throw new IllegalArgumentException();
        if (array.length == n) {
            resize(2 * array.length);
        }
        array[n] = item;
        n = n + 1;
    }


    private void resize(int i) {
        Item []cur = (Item[]) new Object[i];
        for (int j = 0; j < n; j++) {
            cur[j] = array[j];
        }
        array = cur;
    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        if (n == array.length/4 && n > 0) {
            resize(array.length/2);
        }
        int random = StdRandom.uniform(n);
        Item item = array[random];
        n = n - 1;
        array[random] = array[n];
        array[n] = null;
        return item;
    }


    // return a random item (but do not remove it)
    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException();
        return array[StdRandom.uniform(n)];
    }


        // return an independent iterator over items in random order
        public Iterator<Item> iterator() {
            return new qiterator();
        }

        // unit testing (required)
        public static void main(String[] args) {
            RandomizedQueue<Integer> queue = new RandomizedQueue<>();
            for (int i = 0; i < 10; i++) {
                queue.enqueue(i);
            }
            System.out.println(queue.size());
            for (Integer i : queue) {
                System.out.println(i);
            }
            System.out.println("sample:" + queue.sample());
            System.out.println("dequeue");
            while (!queue.isEmpty()) System.out.println(queue.dequeue());
            System.out.println(queue.size());
        }

    private class qiterator implements Iterator<Item> {
        private int i;
        private int[] randomIndices;
        public qiterator() {
            i = 0;
            randomIndices = new int[n];
            for (int j = 0; j < n; j++) {
                randomIndices[j] = j;
            }
            StdRandom.shuffle(randomIndices);
        }

        @Override
        public boolean hasNext() {
            return i < n;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return array[randomIndices[i++]];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }
    }


    // remove and return a random item



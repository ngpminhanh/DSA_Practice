package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class PriorityQueue {
    Scanner scanner = new Scanner(System.in);
    private int Q = scanner.nextInt();
    private List<Integer> array = new ArrayList<>();

    public void insert(int n) {
        while(this.array.size() < this.Q) {
            array.add(n);
        }
    }

    public int deleteMin() {
        int min = array.get(0);
        for(int i = 1; i < array.size(); i++) {
            if(min > array.get(i)) {
                min = array.get(i);
            }
        }
        return min;
    }
}
public class Main {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.insert(1);
        q.insert(2);
        q.insert(9);
        q.insert(5);
        System.out.println(q.deleteMin());

    }
}

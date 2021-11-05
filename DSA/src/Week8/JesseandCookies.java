package Week8;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseandCookies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int []array = new int[n];
        for (int i = 0; i < array.length; i++) {
            queue.add(scanner.nextInt());
        }
        int cont = 0;
        while (queue.size() > 1 && queue.peek() < k) {
            int val1 = queue.poll();
            int val2 = queue.poll();
            int result = val1 + (2 * val2);
            queue.add(result);
            cont++;
        }

        if (queue.size() == 1 && queue.peek() < k) {
            System.out.println(-1);
        } else {
            System.out.println(cont);
        }

    }
}

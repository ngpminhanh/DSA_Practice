package Week8;

import java.util.*;

public class FindTheRunningMedian {
    public static List<Double> runningMedian(List<Integer> a) {
        List<Double> result = new ArrayList<>();
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> max = new PriorityQueue<>();
        result.add((double)a.get(0));
        if (a.size() == 1) {
            return result;
        }
        min.add(Math.min(a.get(0), a.get(1)));
        max.add(Math.max(a.get(0), a.get(1)));
        result.add((double)(a.get(0) + a.get(1))/2);
        for(int i = 2; i < a.size(); i++) {
            if (a.get(i) >= max.peek()) {
                max.add(a.get(i));
            }
            else {
                min.add(a.get(i));
            }
            if (Math.abs(max.size() - min.size()) > 1) {
                if (min.size() > max.size()) {
                    max.add(min.poll());
                } else {
                    min.add(max.poll());
                }
            }

            if (max.size() == min.size()) {
                result.add((double)(max.peek() + min.peek())/2); }
            else if (max.size() > min.size()) {
                result.add((double) max.peek());}
            else {
                result.add((double) min.peek());
        }

        }
        return result;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        List<Double> result = runningMedian(array);
        for(int i = 0; i < result.size(); i++) {
            System.out.printf("%.1f\n", (double) result.get(i));
        }
    }
}

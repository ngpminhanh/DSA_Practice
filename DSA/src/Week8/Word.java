package Week8;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        PriorityQueue<String> pq = new PriorityQueue<>();
        String word = "";
        for(int i = 0; i < a.length(); i++) {
            char kytu = a.charAt(i);
            if (!Character.isSpace(kytu)) {
                word = word + kytu;
            }
            else {
                pq.add(word);
                word = "";
            }
        }
        pq.add(word);
        String first_word = pq.poll();
        int count1 = 1;
        List<Integer> count = new ArrayList<>();
        List<String> dic = new ArrayList<>();
        while (pq.size() != 0) {
            while (first_word.equalsIgnoreCase(pq.peek())) {
                count1++;
                pq.poll();
            }
            if (pq.size() == 1) {
                count.add(1);
                dic.add(pq.peek());
                break;
            }
            count.add(count1);
            dic.add(first_word);
            first_word = pq.poll();
            count1 = 1;
        }
        for (int i = 0; i < count.size(); i++) {
            System.out.println(dic.get(i) + ": " + count.get(i));
        }



    }
}

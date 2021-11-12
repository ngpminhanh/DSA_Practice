package Week9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> name = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            String s = s1 + " " + s2;
                name.add(s);
                System.out.println(name.size());

        }
    }


}

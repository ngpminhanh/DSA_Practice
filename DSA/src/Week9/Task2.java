package Week9;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap people = new HashMap();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int telephone = scanner.nextInt();
            people.put(name, telephone);
            scanner.nextLine();
        }
        while(scanner.hasNext())
        {
            String s = scanner.nextLine();
            if(people.containsKey(s)) {
                System.out.println(s + "=" + people.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }

    }
}

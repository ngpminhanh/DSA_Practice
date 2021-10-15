package Week5;

import edu.princeton.cs.algs4.StdIn;


public class SelectionSort {
    public static void main(String[] args) {
        String s = StdIn.readString();
        Stack<Character> stack = new Stack<>();
        int m = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    m = 0;
                    break;
                } else {
                    char ch = stack.pop();
                    if (c != ')' && ch == '(' || c != '}' && ch == '{' || c != ']' && ch == '[') {
                        m = 0;
                        break;
                    }
                }
            }
        }
        if (m == 1 && stack.isEmpty()) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

}

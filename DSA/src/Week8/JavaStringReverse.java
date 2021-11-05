package Week8;
import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n = A.length();
        boolean palindrome = true;
        for(int i = 0; i < n; i++) {
            if(A.charAt(i) != A.charAt(n-1-i)) {
                palindrome = false;
                break;
            }
        }
        if(palindrome) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }

    }
}




package Week7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class QuickSort_Partition {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        equal.add(arr.get(0));
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(0) < arr.get(i)) {
                right.add(arr.get(i));
            }
            else if(arr.get(0) > arr.get(i)) {
                left.add(arr.get(i));
            }
            else {
                equal.add(arr.get(i));
            }
        }
        for(int j = 0; j < left.size(); j++) {
            result.add(left.get(j));
        }
        for(int j = 0; j < equal.size(); j++) {
            result.add(equal.get(j));
        }
        for(int j = 0; j < right.size(); j++) {
            result.add(right.get(j));
        }

        return result;

    }

}

   class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        List<Integer> result = QuickSort_Partition.quickSort(arr);
        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}


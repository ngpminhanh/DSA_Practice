package Week9;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class ClosetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sort(arr, 0, arr.length - 1);
        int min = arr[1] - arr[0];
        for(int i = 2; i < n; i++) {
            if (min > (arr[i] - arr[i-1])) {
                min = arr[i] - arr[i-1];
            }
        }
        for(int i = 1; i < n; i++) {
            int dis = arr[i] - arr[i-1];
            if (min == dis) {
               System.out.println(arr[i-1] + " " + arr[i]);
            }
        }
    }
    public static void sort(int []arr, int l, int r) {
        if(l < r) {
            int mid = l + (r -l)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void merge(int []arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int []left = new int[n1];
        for(int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        int []right = new int[n2];
        for(int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if(left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}

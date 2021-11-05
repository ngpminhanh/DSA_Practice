package Week7;



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Median {


    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    static void Swap(int[]array, int position1, int position2){
        // Swaps elements in an array

        // Copy the first position's element
        int temp = array[position1];

        // Assign to the second element
        array[position1] = array[position2];

        // Assign to the first element
        array[position2] = temp;
    }

    /* This function takes last element as
    pivot, places the pivot element at its
    correct position in sorted array, and
    places all smaller (smaller than pivot)
    to left of pivot and all greater elements
    to right of pivot */
    static int partition(int []arr, int low,
                         int high)
    {
        int pivot = arr[high];

        // Index of smaller element
        int i = (low - 1);

        for (int j = low; j <= high- 1; j++)
        {
            // If current element is smaller
            // than or equal to pivot
            if (arr[j] <= pivot)
            {
                i++; // increment index of
                // smaller element
                Swap(arr, i, j);
            }
        }
        Swap(arr, i + 1, high);
        int n = arr.length;
        return (i + 1);
    }

    /* The main function that
       implements QuickSort
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    static void quickSort(int []arr, int low,
                          int high)
    {
        if (low < high)
        {
        /* pi is partitioning index,
        arr[p] is now at right place */
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /* Function to print an array */

    static public void median(int[] arr, int n) {
        int mid = n/2;
        System.out.print(arr[mid]);
    }
    // Driver Code
    static public void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, n-1);
        median(arr,n);

    }
}


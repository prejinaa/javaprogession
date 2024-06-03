package Arraylist.HashData;

// Java code for the approach

import java.util.*;

public class MissingElement {
    // Function to find and print missing
    // elements in the given range
    static void findMissing(int[] arr, int n, int low,
                            int high)
    {
        // Loop through the range of numbers from low to
        // high
        for (int i = low; i <= high; i++) {
            boolean found = false;
            // Loop through the array to check if i exists
            // in it
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            // If i is not found in the array, print it
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }

    // Driver's code
    public static void main(String[] args)
    {
        // Input array
        int[] arr = { 1, 3, 5, 4 };
        int n = arr.length;
        int low = 8, high = 10;

        // Function call
        findMissing(arr, n, low, high);
    }
}


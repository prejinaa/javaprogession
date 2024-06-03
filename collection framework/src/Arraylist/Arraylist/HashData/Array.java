package Arraylist.HashData;

import java.util.HashSet;

public class Array {// Java program for the union of two arrays using Set



        static void getUnion(int[] a, int[] b)
        {

            // Defining set container s
            HashSet<Integer> s = new HashSet<>();

            // Inserting array elements in s
            for (int i = 0; i < 9; i++)
                s.add(a[i]);

            for (int i = 0; i < 10; i++)
                s.add(b[i]);
            System.out.print(
                    "Number of elements after union operation: "
                            + s.size() + "\n");
            System.out.print("The union set of both arrays is :"
                    + "\n");

            System.out.print(
                    s.toString()
                            + " "); // s will contain only distinct
            // elements from array a and b
        }

        // Driver Code
        public static void main(String[] args)
        {
            int[] a = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
            int[] b = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

            getUnion(a, b);
        }
    }




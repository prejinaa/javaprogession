package Arraylist.HashData;

// Java program to count distinct
// elements in a given array

class GFG {

    static int countDistinct(int arr[], int n)
    {
        int res = 1;

        // Pick all elements one by one
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                res++;
        }
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 20,30,40,50,60,60,70,60 };
        int n = arr.length;
        System.out.println(countDistinct(arr, n));
    }
}

// This code is contributed by Code_Mech.


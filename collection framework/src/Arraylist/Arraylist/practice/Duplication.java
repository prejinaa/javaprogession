package Arraylist.practice;

import java.util.*;

public class Duplication {
    public static void main(String[] args) {
        // Example input list
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 8, 9);

        // Convert the list to a set
        Set<Integer> uniqueSet = new HashSet<>(inputList);

        // Print the set
        System.out.println("Set: " + uniqueSet);
    }
    }

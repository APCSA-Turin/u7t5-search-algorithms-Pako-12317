package com.example.project.Binary_Search;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if not found
    public static int binarySearch(int[] elements, int target) {
        // int loopCounter = 0; // for testing
        int leftIdx = 0;  // Start of the search range
        int rightIdx = elements.length - 1;  // End of the search range

        while (leftIdx <= rightIdx) {  // Continue while there are elements to search
            // loopCounter++; // for testing
            // System.out.print(loopCounter + " "); // for testing
            int middleIdx = leftIdx + (rightIdx - leftIdx) / 2;  // Calculate the middle index

            // Compare the middle element with the target
            if (elements[middleIdx] == target) {
                return middleIdx;  // Target found, return its index
            } else if (elements[middleIdx] < target) {
                leftIdx = middleIdx + 1;  // Target is in the right half
            } else {
                rightIdx = middleIdx - 1;  // Target is in the left half
            }
        }
        return -1; // Target not found
    }
}
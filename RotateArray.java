// Given an array arr[] . Rotate the array to the left (counter-clockwise direction) 
// by d steps, where d is a positive integer. 
// Do the mentioned change in the array in place.

// Note: Consider the array as circular.

// Examples :

// Input: arr[] = [1, 2, 3, 4, 5], d = 2
// Output: [3, 4, 5, 1, 2]
// Explanation: when rotated by 2 elements, it becomes [3, 4, 5, 1, 2].

// Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
// Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
// Explanation: when rotated by 3 elements, it becomes [8, 10, 12, 14, 16, 18, 20, 2, 4, 6].

// Input: arr[] = [7, 3, 9, 1], d = 9
// Output: [3, 9, 1, 7]
// Explanation: when we rotate 9 times, we'll get [3, 9, 1, 7] as resultant array.

import java.util.*;

class RotateArray{

    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d %= n;

        int[] temp = new int[n];

        for (int i = 0; i < n - d; i++) {
            temp[i] = arr[d + i];
        }

        for (int i = 0; i < d; i++) {
            temp[n - d + i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {  // array input
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();          // rotation steps

        rotateArr(arr, d);

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}
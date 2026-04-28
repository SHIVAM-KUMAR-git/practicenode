/*Given an array of positive integers arr[], return the second largest element 
from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.*/

import java.util.*;

class Second_Largest {

    public int getSecondLargest(int[] arr) {

        int max = -1;
        int smax = -1;

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        return smax;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        System.out.println(obj.getSecondLargest(arr));
    }
}
/*Given an array arr[] and an integer target. You have to find the 
number of pairs in the array whose sum is strictly less than the target.

Examples:

Input: arr[] = [7, 2, 5, 3], target = 8
Output: 2
Explanation: There are 2 pairs with sum less than 8: (2, 5) and (2, 3).

Input: arr[] = [5, 2, 3, 2, 4, 1], target = 5
Output: 4
Explanation: There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).

Input: arr[] = [2, 1, 8, 3, 4, 7, 6, 5], target = 7
Output: 6
Explanation: There are 6 pairs whose sum is less than 7: (2, 1), (2, 3), (2, 4), (1, 3), (1, 4) and (1, 5).*/


import java.util.*;

class Count_Pairs {
    int countPairs(int arr[], int target) {
        int i = 0;
        int j = arr.length - 1;
        int c = 0;

        Arrays.sort(arr);
        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum < target) {
                c += (j - i);
                i++;
            } else {
                j--;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.countPairs(arr, target));
    }
}
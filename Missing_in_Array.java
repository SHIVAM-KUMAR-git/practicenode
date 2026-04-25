/*You are given an array arr[] of size n - 1 that contains distinct 
integers in the range from 1 to n (inclusive). This array represents 
a permutation of the integers from 1 to n with one element missing. 
Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.*/

import java.util.*;
import java.math.BigInteger;

class Missing_in_Array {

    BigInteger missingNum(int arr[]) {
        int n = arr.length + 1;

        BigInteger sum = BigInteger.ZERO;

        for (int num : arr) {
            sum = sum.add(BigInteger.valueOf(num));
        }

        BigInteger N = BigInteger.valueOf(n);

        BigInteger total = N.multiply(N.add(BigInteger.ONE))
                            .divide(BigInteger.valueOf(2));

        return total.subtract(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        System.out.println(obj.missingNum(arr));
    }
}
package tests;

import java.util.Arrays;

/*
Given an array of integers. Find the numbers whose occurence in the array is odd.
Note: Integers are from 0 to 100 and length of array is greater than the max value in Array
 */

public class P3OddOccurrence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{1, 3, 4, 2, 4, 1, 4})));
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{1, 2, 2, 1, 3})));
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{0, 1, 1, 2, 2, 2, 3, 3, 3})));
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{1, 2, 2, 1, 3, 3})));
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{0, 1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{100, 100, 0, 0, 50, 50, 25, 25, 25})));
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{0, 0, 100, 100, 50, 50, 50})));
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{99, 99, 99})));
        System.out.println(Arrays.toString(numbersWithOddOccurrence(new int[]{0, 0, 100, 100, 50})));
    }

    public static int[] numbersWithOddOccurrence(int[] nums) {
//        Using XOR operation here to identify the odd occurrence ->> (0 XOR n = n)  and (n XOR n=0)
//        storing result of XOR in array

//        As given that numbers can be from 0 to 100 (every location will be initialized to 0)
//        Initialising arr with 101 size -> purpose is to store the result of operation at elements location
        int[] arr = new int[101];
//        using resultSize variable to find the size of result while traversing the nums itself
//        so that separate for loop is not required
        int resultSize = 0;
        for (int i = 0; i < nums.length; i++) {
//            Initially arr[nums[i]]=0 (0 XOR 1=1)
//            Doing XOR of exiting element in arr at location of element and 1
            arr[nums[i]] = arr[nums[i]] ^ 1;
            if (arr[nums[i]] == 1) {
                resultSize++;
            } else {
                resultSize--;
            }
        }
//        if elements in arr is 1 -> means that location was occurred odd times
        int[] result = new int[resultSize];
        for (int i = 0, j = 0; i < arr.length && j < result.length; i++) {
            if (arr[i] == 1) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }

}
package tests;
import java.util.Arrays;
import java.util.HashMap;

/*
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
 */

public class P2KthLargestElement {
    public static void main(String[] args) {
        System.out.println(kthLargestElement(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(kthLargestElement(new int[]{2, 1}, 2));
        System.out.println(kthLargestElement(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        System.out.println(kthLargestElement(new int[]{7, 10, 4, 3, 20, 15}, 1));
        System.out.println(kthLargestElement(new int[]{1, 1, 1, 1}, 4));
        System.out.println(kthLargestElement(new int[]{10, 7, 8, 9, 6, 5, 4, 3}, 6));

    }

    public static int kthLargestElement(int[] nums, int k) {
        if (k > nums.length) {
            return -1;
        }
//        Bubble sort for sorting the array in descending order
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums[k - 1];
    }
}
import java.util.Arrays;

public class Solution {
    /*Problem 2 :-

    Given an integer array nums and an integer k, return the kth largest element in the array.

    Note that it is the kth largest element in the sorted order, not the kth distinct element.

    Example 1:

    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5
    Example 2:

    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    Output: 4*/

    public static void main(String[] args) {
        System.out.printf(findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4) + "");
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
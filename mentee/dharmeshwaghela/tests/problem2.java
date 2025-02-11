// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
// Example 2:

// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4



// brute force is being applied to this as i dont want to lie 
import java.util.Arrays;

class problem2{
    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int [] nums2 = {3,2,3,1,2,4,5,5,6};
        
        int k1 = 2;
        int k2 = 4;
        int result1 = klargest(nums1,k1);
        int result2 = klargest(nums2,k2);
        System.out.println("The " + k1 + "th largest element is " + result1); 
        System.out.println("The " + k2 + "th largest element is " + result2); 
    }

    public static int klargest(int[] nums, int k){
        Arrays.sort(nums);
        return  nums[nums.length - k];
    }
}


import java.util.*;

public class Findkth_highestElement{
    public static void main(String[] args){
        int [] a ={3,2,1,5,6,4};
         System.out.println(findKthLargest(a,2));
    }

    
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        // After sorting all the numbers are at their respective postiion 
        // Highest at last and lowest at first 
        // Now let kth element be 2 and meaning second largest element
        //  k=2  n=10  basically meaning idx 9 = largest element
                                    //   idx 8 = second element
                                    // n =10 k=2  10 - 2 = 8 
                                    // we get the idx of the required second largest element [8]
        return nums[nums.length-k];
        //Used Leetcode to solve and pass testcases

    }
}


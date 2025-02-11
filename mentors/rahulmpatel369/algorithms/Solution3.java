import java.util.*;

public class Solution {
/*    Problem 3:-

    Given an array of integers. Find the numbers whose occurence in the array is odd.

    Note: Integers are from 0 to 100 and length of array is greater than the max value in Array

    For eg:
    Input: [1,3,4,2,4,1,4]

    Output: [3,4,2]; Since 3 & 2 is repeated once, 4 is repeated three times.*/

    public static void main(String[] args) {
        System.out.printf(Arrays.toString(findOddOcc(new int[] {1,3,4,2,4,1,4})));
    }

    public static int[] findOddOcc(int[] num) {
        SortedSet<Integer> set = new TreeSet<>();
        for(int i : num) {
            if(set.contains(i)) set.remove(i);
            else set.add(i);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
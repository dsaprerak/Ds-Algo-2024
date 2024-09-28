// Problem 3:-

// Given an array of integers. Find the numbers whose occurence in the array is odd. 

// Note: Integers are from 0 to 100 and length of array is greater than the max value in Array

// For eg: 
// Input: [1,3,4,2,4,1,4]

// Output: [3,4,2]; Since 3 & 2 is repeated once, 4 is repeated three times.


// this is the brute force only
public class problem3 {
    static int getOddOccurrence(int[] arr, int arr_size){
        // int i, j; 
        for(int i=0;i<arr_size;i++){
            int count = 0;
            for(int j=0;j<arr_size;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
        }
            if(count%2!=0){
                return arr[i];
            }
        }
            return -1;
    }
    public static void main(String[] args){
        int arr[] = new int[] {1,3,4,2,4,1,4};
        int n = arr.length;
        System.out.println(getOddOccurrence(arr, n));

    }
}
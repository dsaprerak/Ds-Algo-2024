Problem1:
import java.util.*;
Scanner sc = new Scanner(System.in);
public static void main(String[] args){
        int n = sc.nextInt();
        if (n=1 || n=0){
              System.out.println(1);
        }
        int one = 1;
        int two = 1;
        int temp = one;
        for(int i = 0; i<n-1; i++){
            temp = one;
            one = one+two;
            two = temp;
        }
        System.out.println(one);
}

Problem2:
int kthLargestElement(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
}

Problem3:
class Problem3 {
    List<Integer> NumberWithOddOccurence(int arr[]){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> ans = new ArrayList<>();
        
        for(int i =0 ; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i], val+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(Integer res : map.keySet()){
            if(map.get(res)%2!=0){
                ans.add(res);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,2,4,1,4};
        Problem3 p3 = new Problem3();
        
        System.out.println(p3.NumberWithOddOccurence(arr));
        
    }
}




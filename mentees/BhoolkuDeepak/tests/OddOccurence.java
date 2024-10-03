

import java.util.*;
public class OddOccurence {
    public static void main(String[] args) {
        System.out.println();
        int [] a={1,3,4,2,4,1,4};
        System.err.println(countOddOccurence(a));
    }

    public static List<Integer> countOddOccurence(int [] arr){
        int count = 0;
        int [] counter = new int [arr.length];
        
        List<Integer> ans = new ArrayList<>();
        for(int i:arr){
            counter[i]++;
        }

        for(int k=0;k<counter.length;k++){
            if(counter[k]%2!=0){
                count++;
                //System.err.println(counter[k]);
                ans.add(k);
            }
        }


        

        return ans;

        
    }
}

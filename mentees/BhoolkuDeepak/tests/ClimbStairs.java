public class ClimbStairs {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));

    }

    public static int climbStairs(int n) {
        
    //f(n) = f(n-1) + f(n-2);
        return helper(n);
    }

    public static int helper(int n){
        
        if(n==1 || n==0){
            return 1;
        }


        return (helper(n-1)+helper(n-2));
        //In this soltuion we wil exceed the time limit 
        //as for threshold of Leetcode It gave TIme limit at n = 45
    }


    
        //I HAVE COMMENTED THE DP SOLUTION BCZ I HAD SOLVED OR CAN SAY MEMORIZED THIS DP QUESTION EARILER 
        // THUS TO AVOID THE PERCEPTION THAT I KNOW DP I AM COMMENTING THE DP SOLUTION

        // int[] dp=new int [n+1];
        // dp[0]=1;
        // dp[1]=1;

        // for(int i=2;i<dp.length;i++){
        //     dp[i]=dp[i-1]+dp[i-2];

        // }

        // return dp[n];

    // }
}

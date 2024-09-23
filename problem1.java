import java.util.Scanner;

public class problem1{
//to calculate no. of distinct ways to reach top
    public static int climbstairs(int n){
        if(n==1){
            return 1;
        }
        
        int[] ways=new int[n+1];//array to store no. of ways to reach each step
        ways[1]=1;  
        ways[2]=2;  
      // filling array using eqn:ways[i]=ways[i-1]+ways[i-2]
        for (int i=3;i<=n;i++){
            ways[i]=ways[i-1]+ways[i-2];
        }
        return ways[n];//return no. of ways to reach top.
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//input for the number of steps.
        System.out.print("Enter no. of steps: ");
        int n=sc.nextInt();
        System.out.println("No. of ways to reach the top: " + climbstairs(n));
        sc.close();
    }
}

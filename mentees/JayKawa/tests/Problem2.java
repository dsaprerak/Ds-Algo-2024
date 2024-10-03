import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want : ");
        int n=sc.nextInt();
        int a[]= new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" element :");
            a[i]=sc.nextInt();
        }

        System.out.println("The array is :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }


        System.out.println("Enter the _ largest element you want :");
        int f=sc.nextInt();

        System.out.println("The "+f+" largest element is :"+a[f-1]);

        sc.close();
    }
    
}

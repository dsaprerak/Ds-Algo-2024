import java.util.*;

public class Bubble_sort {
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want :");
        int n=sc.nextInt();
        int a[]= new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" element :");
            a[i]=sc.nextInt();
        }

        System.out.println("The non-sorted line is :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i]>=a[j])
                {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

        System.out.println("The sorted line is :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        
        sc.close();
    }
}

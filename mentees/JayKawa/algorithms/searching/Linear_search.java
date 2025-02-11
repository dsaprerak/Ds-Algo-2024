import java.util.*;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n, f, found;

        System.out.println("Enter the number of elements you want:");
        n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the " + (i + 1) + " element:");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to find:");
        f = sc.nextInt();

        found = 0; 

        for (int i = 0; i < n; i++) 
        {
            if (a[i] == f) 
            {
                System.out.println("Element " + f + " found at position " + (i + 1) + ".");
                found = 1;  
                break; 
            }
        }

        if (found == 0) 
        {

            System.out.println("Element not found.");
        }

        sc.close();  
    }
}


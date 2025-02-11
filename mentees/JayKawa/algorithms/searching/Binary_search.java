
import java.util.*;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the " + (i + 1) + " element:");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to find:");
        int f = sc.nextInt();

        Arrays.sort(a);

        int low = 0, high = n - 1;
        int mid=-1;
        boolean found = false;

        while (low <= high) 
        {
            mid = (low + high) / 2;

            if (a[mid] == f) 
            {
                found = true;
                break;
            } 
            else if (f < a[mid]) 
            {
                high = mid - 1;
            } 
            else 
            {
                low = mid + 1;
            }
        }

        if (found) 
        {
            System.out.println("Element found at position " + mid + ".");
        } 
        else 
        {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}

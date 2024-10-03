import java.util.*;

public class Quick_sort {

    public void quickSort(int arr[], int begin, int end) 
    {
        if (begin < end) 
        {
            int partitionindex = partition(arr, begin, end);
    
            quickSort(arr, begin, partitionindex-1);
            quickSort(arr, partitionindex+1, end);
        }
    }

    private int partition(int arr[], int begin, int end) 
    {
        int pivot = arr[end];
        int i = (begin-1);
    
        for (int j = begin; j < end; j++) 
        {
            if (arr[j] <= pivot) 
            {
                i++;
    
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
    
        return i+1;
    }
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

        Quick_sort sorter = new Quick_sort();

        sorter.quickSort(a, 0, n - 1); 

        System.out.println("\nThe sorted array is:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + "\t");
        }

        sc.close();
}
}

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean[] processed = new boolean[n]; 

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the " + (i+1) + " element :");
            int input = sc.nextInt();

            while (input >= n) {
                System.out.println("Enter a number less than " + n + ":");
                input = sc.nextInt();
            }

            a[i] = input;
        }

        System.out.println("The array is :");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (processed[i]) 
            {
                continue; 
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] == a[j]) 
                {
                    count++;
                    processed[j] = true;
                }
            }

            if (count % 2 != 0) 
            {
                c.add(a[i]);
            }

            processed[i] = true;
        }

        System.out.println(c);
        sc.close();
    }
}

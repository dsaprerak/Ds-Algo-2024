import java.util.*;

public class Problem1 {

    public int combination(int n, List<Integer> c) 
    {

        if (n == 0) 
        {
            return 1;
        }

        int count =0;

        if (n >= 1) 
        {
            c.add(1);
            count = count + combination(n - 1, c);
            c.remove(c.size() - 1); 
        }

        if (n >= 2) 
        {
            c.add(2);
            count = count +combination(n - 2, c);
            c.remove(c.size() - 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element:");
        int n = sc.nextInt();

        Problem1 p = new Problem1();
        List<Integer> c = new ArrayList<>(); 


        int count = p.combination(n, c);
        System.out.println("Total combinations : "+count);

        sc.close();
    }
}

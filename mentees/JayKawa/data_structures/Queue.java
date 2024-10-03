import java.util.*;

public class Queue 
{
    final static int max = 7;
    int[] a = new int[max];
    int f = -1;
    int r = -1;

    public void enqueue(int x) 
    {
        if ((r == max - 1 && f == 0) || (r + 1 == f)) 
        {
            System.out.println("Overflow of queue\n");
            return;
        } 
        else if (f == -1 && r == -1) 
        {
            f = 0;
            r = 0;
            a[r] = x;
        } 
        else 
        {
            if (r == max - 1 && f != 0) 
            {
                r = 0;
            } 
            else 
            {
                r++;
            }

            a[r] = x;
        }
        System.out.println("The element added to queue is " + x + "\n");
    }

    public void dequeue() 
    {
        if (f == -1) 
        {
            System.out.println("Underflow of queue\n");
            return;
        } 
        else if (f == r) 
        {
            System.out.println("Final element of queue is removed, which is " + a[f] + "\n");
            a[f] = 0;
            f = -1;
            r = -1;
        } 
        else 
        {
            System.out.println("The element removed is " + a[f] + "\n");
            a[f] = 0;
            if (f == max - 1) 
            {
                f = 0;
            } 
            else 
            {
                f++;
            }
        }
    }

    public void display() 
    {
        if (f == -1) 
        {
            System.out.println("Queue is empty\n");
            return;
        }
        System.out.println("The elements of the queue are:");
        int i = f;
        while (true) 
        {
            System.out.println(a[i]);
            if (i == r) 
            {
                break;
            }
            if (i == max - 1) 
            {
                i = 0;
            } else 
            {
                i++;
            }
        }
    }

    public static void main(String[] args) 
    {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            int n, c;
            System.out.println("Enter the operation you want to perform:\n 1. Display\n 2. Add an element in queue\n 3. Remove the element\n 4. Exit\n");
            n = sc.nextInt();
            switch (n) 
            {
                case 1:
                    q.display();
                    break;
                case 2:
                    System.out.println("Enter the element to be entered in queue:");
                    c = sc.nextInt();
                    q.enqueue(c);
                    break;
                case 3:
                    q.dequeue();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
                    break;
            }
        }
    }
}

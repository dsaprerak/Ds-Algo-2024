import java.util.*;

public class Stack
{
    final static int size = 8;
    int top = -1;
    int[] stack = new int[size];

    public void push(int a) 
    {
        if (top == size - 1) 
        {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = a;
        System.out.println("Inserted number is " + a);
    }

    public void pop() 
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Number removed is " + stack[top]);
        stack[top] = 0;
        top--;
    }

    public void peek() 
    {
        if (top == -1) 
        {
            System.out.println("There is no element in the stack");
            return;
        }
        System.out.println("The last entered element is " + stack[top]);
    }

    public void display() 
    {
        if (top == -1) 
        {
            System.out.println("There is no element in the stack");
            return;
        }
        for (int i = 0; i <= top; i++) 
        {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) 
    {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice, a;
        int exit = 1;


        while (exit == 1) {
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\n");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter the number to be inserted");
                    a = sc.nextInt();
                    s.push(a);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    exit = 0;
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }
}

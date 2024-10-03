import java.util.*;

class Node 
{
    int data;
    Node next;

    Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList 
{
    Node head = null;

    public void insert(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
        }
        else 
        {
            Node temp = head;
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted: " + data);
    }

    public void delete(int data) 
    {
        if (head == null) 
        {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) 
        {
            head = head.next;
            System.out.println("Deleted: " + data);
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) 
        {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found");
        } 

        else 
        {
            temp.next = temp.next.next;
            System.out.println("Deleted: " + data);
        }
    }

    public void display() 
    {
        if (head == null) 
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.println("Elements in the list:");
        while (temp != null) 
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("1. Insert\n2. Delete\n3. Display\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter value to insert:");
                    int value = sc.nextInt();
                    list.insert(value);
                    break;
                case 2:
                    System.out.println("Enter value to delete:");
                    int delValue = sc.nextInt();
                    list.delete(delValue);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

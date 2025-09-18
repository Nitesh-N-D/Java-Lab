## Singly Linked List in Java
Implements a **singly linked list** with operations to **add, delete, search, and display** elements using a menu-less demonstration in main().
public class LinkedList {
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        private Node head;
        public void add(int data) {
        Node newNode = new Node(data);
            if (head == null) {
            head = newNode;
        } else {
            Node current = head;
 
            while (current.next != null) {
                current = current.next;
            }
 current.next = newNode;
        }

 System.out.println("Added: " + data);
    }
public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted: " + data);
            return;
        }

        Node current = head;

        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found: " + data);
        } else {
            current.next = current.next.next;
            System.out.println("Deleted: " + data);
        }
    }

    
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    
    public void search(int data) {
        Node current = head;
        int position = 1;

        while (current != null) {
            if (current.data == data) {
                System.out.println("Found " + data + " at position " + position);
                return;
            }

            current = current.next;
            position++;
        }

        System.out.println("Value " + data + " not found in the list.");
    }

       public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.display();           
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();            
        list.search(20);           
        list.search(40);           

        list.delete(10);         
        list.display();            

        list.delete(30);         
        list.display();            

        list.delete(40);           
    }
}

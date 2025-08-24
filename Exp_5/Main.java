
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListFunc {

    Node head;

    void create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of nodes: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            insert(sc.nextInt());
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        display();
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        display();
    }

    void deleteList() {
        head = null;
    }

    void search(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Value: " + key + "\nPosition: " + pos);
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Value: " + key + "\nPosition: Not found in the list");
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListFunc list = new ListFunc();
        while (true) {
            System.out.println("""
                    \tSingly Linked List Operations
                    Menu:
                    1. Create new list
                    2. Insert value into list
                    3. Delete last value from list
                    4. Delete list
                    5. Display list
                    6. Search for a value
                    7. Exit""");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Create new list operation selected.");
                    list.create();
                }
                case 2 -> {
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.insert(val);
                }
                case 3 -> {
                    System.out.println("Delete last node operation selected.");
                    list.deleteLast();
                }
                case 4 -> {
                    list.deleteList();
                    System.out.println("List deleted.");
                }
                case 5 ->
                    list.display();
                case 6 -> {
                    System.out.print("Enter value to search: ");
                    int searchVal = sc.nextInt();
                    list.search(searchVal);
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

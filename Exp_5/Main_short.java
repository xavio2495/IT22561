
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class Main_short {

    Node head;

    public Main_short() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public boolean delete(int key) {
        Node curr = head;
        Node prev = null;
        if (curr != null && curr.data == key) {
            head = curr.next;
            return true;
        }
        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            return false;
        }
        prev.next = curr.next;
        return true;
    }

    public boolean search(int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void display() {
        Node curr = head;
        System.out.print("List: ");
        if (curr == null) {
            System.out.println("empty");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main_short list = new Main_short();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
        list.delete(20);
        list.display();
        System.out.println("Search for 30: " + list.search(30));
    }
}

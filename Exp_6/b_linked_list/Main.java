public class Main {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top;
    Main() {this.top = null;}
    boolean isEmpty() {return top == null;}
    void push(int data) {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
        System.out.println("Pushed " + data);
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, Cannot pop.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        System.out.println("Popped " + poppedData);
        return poppedData;
    }
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = top;
        System.out.println("Stack elements are:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main stack = new Main();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        stack.display();
    }
}


public class Main {

    private int[] stackArray;
    private int top;
    private int maxSize;

    public Main(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow: Cannot push, stack is full.");
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop, stack is empty.");
            return -1;
        }
        int poppedValue = stackArray[top--];
        System.out.println(poppedValue + " popped from stack.");
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, no element to peek.");
            return -1;
        }
        return stackArray[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main stack = new Main(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println("Top element: " + stack.peek());
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.display();
    }
}

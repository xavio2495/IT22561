public class Main {
    int[] arr;
    int f = -1, r = -1, c = 0, cap; 
    public Main(int s) {
        cap = s;
        arr = new int[s];
    }
    boolean isEmpty() { return c == 0; }
    boolean isFull() { return c == cap; }
    public void Disp() {
        if (isEmpty()) {
            System.out.println("[] (Empty)");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < c; i++) {
            int index = (f + i) % cap;
            System.out.print(arr[index] + (i < c - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
    public void EnQ(int i) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }   
        if (isEmpty()) f = 0;
        r = (r + 1) % cap;
        arr[r] = i;
        c++;
        System.out.print("Enqueued: ");
        Disp();
    }

    public void DeQ() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int data = arr[f];
        f = (f + 1) % cap;
        c--;
        
        if (isEmpty()) {
            f = -1;
            r = -1;
        }
        System.out.print("Dequeued: " + data + " : ");
        Disp();
    }

    public static void main(String[] args) {
        Main q = new Main(3);
        q.EnQ(10);
        q.EnQ(20);
        q.DeQ();
        q.EnQ(30);
        q.EnQ(40);
        q.EnQ(50);
        q.DeQ();
        q.EnQ(50);
    }
}
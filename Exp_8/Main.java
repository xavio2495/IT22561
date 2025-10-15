public class Main {
    int[] arr;
    int f = 0, r = -1, c = 0, cap;
    public Main(int s) {
        cap = s;
        arr = new int[s];
    }
    boolean isEmpty() {
        return c == 0;}
    boolean isFull() {
        return c == cap;}
    public void Disp() {
        if (isEmpty()) {
            System.out.println("[] (Empty)");
            return;
        }
        System.out.print("[");
        for (int i = f; i <= r; i++) {
            System.out.print(arr[i] + (i < r ? ", " : ""));
        }
        System.out.println("]");
    }
    public void EnQ(int i) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        arr[++r] = i;
        c++;
        System.out.print("Enqueued: ");
        Disp();
    }
    public void DeQ() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int data = arr[f++];
        c--;
        if (isEmpty()) {
            r = -1;
        }
        System.out.print("Dequeued: "+ data +" : ");
        Disp();
    }
    public static void main(String[] args) {
        Main q = new Main(2);
        q.EnQ(12);
        q.EnQ(10);
        q.EnQ(25);
        q.DeQ();
        q.DeQ();
    }
}
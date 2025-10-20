public class Main {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; ++i) {System.out.print(arr[i] + " ");}
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,14,6,1,-17,2,-1,4};
        int n = arr.length;
        System.out.println("\t QUICK SORT\nOriginal array:");
        printArray(arr, n);
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        printArray(arr, n);
    }
}

public class Main {
    static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {L[i] = arr[left + i];}
        for (int j = 0; j < n2; j++) {R[j] = arr[mid + 1 + j];}
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {System.out.print(arr[i] + " ");}
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {5,14,6,-9,1,10,2,4,-11};
        int n = arr.length;
        System.out.println("\t MERGE SORT\nOriginal Array:");
        printArray(arr, n);
        mergeSort(arr, 0, n - 1);
        System.out.println("\nSorted Array:");
        printArray(arr, n);
    }
}

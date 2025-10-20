class Main {
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {return mid;}
            if (arr[mid] < target) {left = mid + 1;}
            else {right = mid - 1;}
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 5;
        int binaryResult = binarySearch(arr, target);
        System.out.println("Binary Search: " + (binaryResult != -1 ? "Element found at index " + binaryResult : "Element not found in the array"));
    }
}
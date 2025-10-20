class Main {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {if (arr[i] == target) {return i;}}
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 10, 12, 14, 16};
        int target = 10;
        int linearResult = linearSearch(arr, target);
        System.out.println("Linear Search: " + (linearResult != -1 ? "Element found at index " + linearResult : "Element not found in the array"));
    }
}
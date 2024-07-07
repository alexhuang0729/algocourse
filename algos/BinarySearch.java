package algos;

public class BinarySearch {
    static int high;
    static int mid;
    static int low;

    public static int search(int[] arr, int x) {
        high = arr.length - 1;
        low = 0;
        while (high >= low) {
            mid = (int) low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(search(arr, 9));
    }
}

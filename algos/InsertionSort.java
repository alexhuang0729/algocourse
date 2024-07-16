package algos;

public class InsertionSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1 ,3, 2, 7, 5, 6, 10, 9};
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        sort(nums);
        for (int num:nums) {
            System.out.print(num + " ");
        }
    }
}

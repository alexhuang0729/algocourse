package algos;

public class ShellSort {
    public static int[] sort(int[] arr) {
        int h = 1;
        while (h < arr.length / 3)
            h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    int temp = arr[j - h];
                    arr[j - h] = arr[j];
                    arr[j] = temp;
                }
            }
            h = h / 3;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 7, 5, 6, 10, 9 };
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
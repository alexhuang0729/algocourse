import java.util.*;

public class SelectionSort {
    public double[] sort(double[] arr) {
        // Boundary of unsorted array
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            // Looping through unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestIndex] > arr[j]) {
                    smallestIndex = j;
                }
            }
            double tempValue = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = tempValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort example = new SelectionSort();
        double[] nums = new double[7];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random() * 100;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%f ", nums[i]);
        }
        System.out.printf("\n");
        example.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%f ", nums[i]);
        }
    }
}
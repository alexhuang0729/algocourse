package algos;

public class QuickSort {
    public static int[] sort(int[] arr, int beginIndex, int endIndex) {
        if (arr.length < 2) {

        } else {
            if (beginIndex < endIndex) {
                int partitionIndex = partition(arr, beginIndex, endIndex);
                sort(arr, beginIndex, partitionIndex - 1);
                sort(arr, partitionIndex + 1, endIndex);
            }
        }
        return arr;
    }

    private static int partition(int[] arr, int beginIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = (beginIndex - 1);

        for (int j = beginIndex; j < endIndex; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[endIndex];
        arr[endIndex] = swapTemp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 6, 5, 3, 4 };
        int[] newArr = sort(arr, 0, 5);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}

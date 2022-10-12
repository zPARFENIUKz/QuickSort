public class QuickSort {
    public static void quickSort(final int[] arr){
        if (arr == null) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(final int[] arr, final int lowIndex, final int highIndex){
        if (lowIndex < highIndex){
            final int pivotIndex = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, pivotIndex-1);
            quickSort(arr, pivotIndex+1, highIndex);
        }
    }

    private static int partition(final int[] arr, final int lowIndex, final int highIndex){
        final int pivot = arr[highIndex];
        int leftwall = lowIndex;
        for (int index = lowIndex; index < highIndex; ++index){
            if (arr[index] < pivot){
                if (index != leftwall){
                    swap(arr, index, leftwall);
                }
                ++leftwall;
            }
        }
        swap(arr, highIndex, leftwall);
        return leftwall;
    }

    private static void swap(final int[] arr, final int index1, final int index2){
        final int buf = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = buf;
    }
}

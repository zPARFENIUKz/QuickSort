import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        final int[] arr = new int[1000];
        for (int i = 0; i < arr.length; ++i){
            arr[i] = (int) (Math.random() * 500);
        }
        final int[] arrClone = arr.clone();
        QuickSort.quickSort(arr);
        Arrays.sort(arrClone);
        System.out.println(Arrays.equals(arr, arrClone));
    }
}

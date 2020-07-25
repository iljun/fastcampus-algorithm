package sort.selection;

import java.util.Arrays;
import java.util.Random;

public class Solution {

    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10);
        arr = new Solution().selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }

        return arr;
    }
}

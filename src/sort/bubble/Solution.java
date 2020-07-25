package sort.bubble;

import java.util.Arrays;
import java.util.Random;

public class Solution {

    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10);
        arr = new Solution().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }

        return arr;
    }
}

package Luxoft.tasks;

import java.util.Arrays;


public class Ex1 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 3};
        System.out.println("Main array: " + Arrays.toString(array));
        generateSubArrays(array);
    }

    private static void generateSubArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i <= j) {
                    getArrayByRange(array, i, j);
                }
            }
        }
    }

    private static void getArrayByRange(int[] array, int beginIndex, int endIndex) {
        int[] rangeArray = new int[Math.abs(endIndex - beginIndex) + 1];
        int index = 0;
        int i;
        for (i = beginIndex; i <= endIndex; i++) {
            rangeArray[index] = array[i];
            index++;
        }
        System.out.println("begin=" + beginIndex + "; end=" + endIndex + " ; " + Arrays.toString(rangeArray));
    }
}

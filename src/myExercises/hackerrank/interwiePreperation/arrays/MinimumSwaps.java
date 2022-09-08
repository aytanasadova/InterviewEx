package myExercises.hackerrank.interwiePreperation.arrays;

public class MinimumSwaps {
//     selection sort

    static int minimumSwaps(int[] arr) {

        int swapCount=0,temp,minIndex=0;
        int length=arr.length;
        for(int i=0; i< length-1;i++){
            minIndex=i;
            for (int j=i; j< length;j++){
                if (arr[j]<arr[minIndex])
                    minIndex=j;
            }

            if (minIndex!=i) {
                temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
                swapCount++;
            }
        }
        return swapCount;
    }
}

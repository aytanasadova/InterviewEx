package myExercises.hackerrank.arrays;


import java.util.List;

public class DS {

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int chosenSize = arr.size() - 3;
        int sum;
        int max = 0;

        for (int i = 0; i <= chosenSize; i++)
            for (int j = 0; j <= chosenSize; j++) {
                sum=arr.get(i).get(j)+ arr.get(i).get(j+1)+arr.get(i).get(j+2)+
                     arr.get(i+2).get(j)+ arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2)+   
                        arr.get(i+1).get(j+1);
              if (i==0 && j==0) max=sum;
              if(sum>max) max=sum;
//                System.out.println(sum);
            }
        
        return max;
    }


}

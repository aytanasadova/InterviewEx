package myExercises.hackerrank.arrays;


import java.util.List;


public class NewYeayChaos {

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int k,count=0;
        boolean isChaotic=false,goAhead=true;

        for (int i=0; !isChaotic && i<q.size();i++){
            if ((q.get(i)-(i+1))>2 ) isChaotic=true;

        }

        for (int j=0;goAhead && j<q.size();j++) {
            goAhead=false;                               // this line makes difference in time
            for (int i=0;i<q.size()-1;i++){
                if (q.get(i)>q.get(i+1)){
                    k=q.get(i);
                    q.set(i,q.get(i+1));
                    q.set(i+1,k);
                    count++;
                    goAhead=true;
                }
            }
        }

        System.out.println((isChaotic)?"Too chaotic":count);

    }

}

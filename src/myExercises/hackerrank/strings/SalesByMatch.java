package myExercises.hackerrank.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Sales by Match
public class SalesByMatch {


    /**
     * There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
     * Example
     * There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
     * Function Description
     * Complete the sockMerchant function in the editor below.
     * sockMerchant has the following parameter(s):
     * int n: the number of socks in the pile
     * int ar[n]: the colors of each sock
     * Returns
     * int: the number of pairs
     * Input Format
     * The first line contains an integer , the number of socks represented in .
     * The second line contains  space-separated integers, the colors of the socks in the pile.
     */


    public static void main(String[] args) {
        List<Integer> ar=new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(2);
        sockMerchant(5,ar);
    }

    public static int sockMerchant(int n, List<Integer> ar) {

        // Write your code here
        Map<String,Integer> m=new HashMap<>();

        for(Integer e:ar){
            if (m.containsKey(e.toString()))
                m.put(e.toString(),m.get(e.toString())+1);
            else
                m.put(e.toString(),1);
        }

        m.entrySet().forEach(e->System.out.println("k= "+e.getKey()+" v= "+e.getValue()));
        return   m.entrySet().stream().map(h->(h.getValue()/2)).reduce((a,b)->(a+b)).get();

    }


}

package tripActions;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1 {

    /**
     * // TODO: 22/08/2022  You are given  two dictionary, one is big(unique elements), one is large (has duplicate elements), you need to find  common elements
     * Hashmap solve collasions when different keys have same value. When the keys are the same it will replace them
     */


    /**
     *  Set solution cost is 79 ms and map solution cost is 6 ms
     */
    public static void main(String... args) {

        Set<Integer> d1 = new HashSet<>();
        List<Integer> d2 = new ArrayList<>();
        implWithSet(d1, d2);
        implWithMap(d1, d2);

    }


    static void implWithMap(Set<Integer> d1, List<Integer> d2) {
        long start = System.currentTimeMillis();

        List<Integer> commons  ;
        Map<Integer, Integer> m1 = new HashMap<>(d2.size());
        d2.forEach((e) -> m1.put(e, null));
        commons = d1.stream().filter(m1::containsKey).collect(Collectors.toList());

        long end = System.currentTimeMillis();
        System.out.println("Commons size with hashmap: "+ commons.size() +" Complation time is: "+(end-start));
    }

    static void implWithSet(Set<Integer> d1, List<Integer> d2) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) d1.add(i);
        for (int i = 5000; i < 8000; i++) d2.add(i);
        for (int i = 7000; i < 20000; i++) d2.add(i);
        d1.retainAll(d2);

        long end = System.currentTimeMillis();
        System.out.println("Common element count with Set is: " + d1.size()+" Complation time is: "+(end-start));
    }
}

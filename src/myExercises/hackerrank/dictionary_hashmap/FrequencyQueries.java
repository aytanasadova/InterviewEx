package myExercises.hackerrank.dictionary_hashmap;

import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/**
 * // TODO: 03/09/2022  time limit exceeds
 */
public class FrequencyQueries {

// In opotimal form
    static List<Integer> freqQueryV1(List<List<Integer>> queries) {

        int m = queries.size(), currentOperation;
        Integer currentVal, existInMap;
        Integer getVal;
        Map<Integer, Integer> myDataStr = new HashMap<>();
        List<Integer> resulList = new ArrayList<>(m);
        Map<Integer, List<Integer>> freqMap = new HashMap<>();
        for (List<Integer> queue : queries) {
            currentVal = queue.get(1);
            currentOperation = queue.get(0);
            getVal = myDataStr.get(currentVal);
            existInMap = (getVal == null) ? 0 : getVal;
            if (currentOperation == 1) {
                myDataStr.put(currentVal, existInMap + 1);
                if (existInMap > 0) freqMap.get(existInMap).remove(currentVal);
                System.out.println(freqMap.get(existInMap) );
                if (freqMap.get(existInMap) ==null || freqMap.get(existInMap).isEmpty()) freqMap.remove(existInMap);

                if (freqMap.containsKey(existInMap + 1)) freqMap.get(existInMap + 1).add(currentVal);
                else freqMap.put(existInMap + 1, new ArrayList<>(Arrays.asList(currentVal)));
            }
            else if (currentOperation == 2) {
                if (existInMap == 0) ;
                if (existInMap == 1) {
                    myDataStr.remove(currentVal);
                    freqMap.get(1).remove(currentVal);
                    if (freqMap.get(existInMap) ==null || freqMap.get(existInMap).isEmpty()) freqMap.remove(existInMap);
                } else if (existInMap > 1) {
                    myDataStr.put(currentVal, existInMap - 1);

                    freqMap.get(existInMap).remove(currentVal);

                    if (freqMap.get(existInMap) ==null || freqMap.get(existInMap).isEmpty()) freqMap.remove(existInMap);
                    if (freqMap.containsKey(existInMap - 1)) freqMap.get(existInMap - 1).add(currentVal);

                    else freqMap.put(existInMap - 1, new ArrayList<>(Arrays.asList(currentVal)));
                }
            } else {
                if (freqMap.containsKey(currentVal)!=myDataStr.containsValue(currentVal)) {
              }
                if (freqMap.containsKey(currentVal))
                    resulList.add(1);
                else resulList.add(0);
            }
        }
        return resulList;
    }

    // timeout error because of o(n) search in hashmap in teh last section
    static List<Integer> freqQuery(List<List<Integer>> queries) {

        int i, m = queries.size(), currentOperation;
        int currentVal, mapContains;

        Map<Integer, Integer> myDataStr = new TreeMap<>();
        List<Integer> resulList = new ArrayList<>(m);

        for (i = 0; i < m; i++) {

            currentVal = queries.get(i).get(1);
            currentOperation = queries.get(i).get(0);

            mapContains = (myDataStr.containsKey(currentVal)) ? (myDataStr.get(currentVal)) : 0;

            if (currentOperation == 1) myDataStr.put(currentVal, mapContains + 1);
            else if (currentOperation == 2) {
                if (mapContains > 1) myDataStr.put(currentVal, mapContains - 1);
                else if (mapContains == 1) myDataStr.remove(currentVal);
            } else {
                if (myDataStr.containsValue(currentVal))
                    resulList.add(1);
                else resulList.add(0);
            }

        }

        return resulList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQueryV1(queries);

        ans.forEach(System.out::println);
        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

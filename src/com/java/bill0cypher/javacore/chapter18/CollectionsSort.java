package com.java.bill0cypher.javacore.chapter18;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsSort {

    public static List<Integer> mergeAndSortCollections(List<Integer> arr1, List<Integer> arr2) {
        return Stream.concat(arr1.stream(), arr2.stream()).sorted().collect(Collectors.toList());
    }
}

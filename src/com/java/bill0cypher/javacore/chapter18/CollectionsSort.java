package com.java.bill0cypher.javacore.chapter18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsSort {

    public static void main(String ...args) {
        List<Integer> arrayNum1 = new ArrayList<>();
        arrayNum1.add(0);
        arrayNum1.add(4);
        arrayNum1.add(10);
        arrayNum1.add(12);
        List<Integer> arrayNum2 = new ArrayList<>();
        arrayNum2.add(1);
        arrayNum2.add(3);
        arrayNum2.add(9);
        arrayNum2.add(11);
        List<Integer> resultArr = mergeAndSortCollections(arrayNum1, arrayNum2);
        System.out.println(Arrays.toString(resultArr.toArray()));
    }

    public static List<Integer> mergeAndSortCollections(List<Integer> arr1, List<Integer> arr2) {
        return Stream.concat(arr1.stream(), arr2.stream()).sorted().collect(Collectors.toList());
    }
}

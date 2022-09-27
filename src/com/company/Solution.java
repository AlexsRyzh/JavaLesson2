package com.company;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

    }

    public static <T> ArrayList<T> newArrayList(T... arr){
            return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T>  HashSet<T> newHashSet(T... arr){
        HashSet<T> hashSet = new HashSet();
        for (T item: arr){
            hashSet.add(item);
        }
        return hashSet;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values){
        if (keys.size() != values.size())
            throw new IllegalArgumentException();

        HashMap<K, V> hashMap = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            hashMap.put(keys.get(i), values.get(i));
        }

        return hashMap;
    }
}

package ru.mirea.laba21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution<T, K, V> {
    private T variableT;
    private K variableK;
    private V variableV;

    public Solution(T variableT, K variableK, V variableV) {
        this.variableT = variableT;
        this.variableK = variableK;
        this.variableV = variableV;
    }

    public List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public HashMap<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Количество ключей и значений должно быть одинаковым");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        Solution<Integer, String, Double> solution = new Solution<>(42, "key", 3.14);

        List<Integer> intList = solution.newArrayList(1, 2, 3);
        System.out.println("ArrayList: " + intList);

        HashSet<Integer> intSet = solution.newHashSet(1, 2, 3);
        System.out.println("HashSet: " + intSet);

        String[] keys = {"a", "b", "c"};
        Double[] values = {1.0, 2.0, 3.0};
        HashMap<String, Double> map = solution.newHashMap(keys, values);
        System.out.println("HashMap: " + map);
    }
}


package main.Task03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task03 {
    public static boolean findDuplicate(Integer[] data) {
        List<Integer> foundInteger = new ArrayList<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer x : data) {
            if (foundInteger.contains(x)) {
                duplicates.add(x);
            }
            foundInteger.add(x);
        }
        return !duplicates.isEmpty();
    }

    public static void main(String[] args) {
        Integer[] array = {100, 2, 2, 3, 3, 3, 3, 10};
        findDuplicate(array);
        System.out.println(findDuplicate(array));
    }
}

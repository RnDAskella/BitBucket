package main.Task03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task03 {
    public static void findDuplicate(Integer[] data) {
        List<Integer> foundInteger = new ArrayList<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer x : data) {
            if (foundInteger.contains(x)) {
                duplicates.add(x);
            }
            foundInteger.add(x);
        }

        System.out.print("[ ");
        for (Integer x :
                data) {
            System.out.print(x + " ");
        }
        System.out.print("]");

        if (duplicates.isEmpty()) {
            System.out.println(" \nResult " + false);
            System.out.println("Дубликатов нет");
        } else {
            System.out.println("\nResult " + true);
            Integer[] array = duplicates.toArray(new Integer[duplicates.size()]);

            for (Integer integer : array) {
                int count = 0;
                for (Integer value : foundInteger) {
                    if (integer.equals(value))
                        count++;
                }
                System.out.println("Число " + integer + " повторяется " + count + " раз(а)");
            }
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        Integer[] array = {100, 2, 2, 3, 3, 3, 3, 10};
        findDuplicate(array);
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}

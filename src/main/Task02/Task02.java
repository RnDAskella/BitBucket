package main.Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task02 {
    static void returnIndexMethod(Integer[] array, int NumberSum) {
        int IndexNumbers = 0;

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);

        for (int i = 0; i < list.size(); i++) {
            int Numbers;
            Numbers = NumberSum - list.get(i);
            if (list.contains(Numbers)) {
                IndexNumbers = list.indexOf(list.get(i));
                System.out.print(IndexNumbers + " ");
            }
        }
    }


    public static void main(String[] args) {
        Integer[] array = {3, 8, 15, 17};
        int number = 20;
        returnIndexMethod(array, number);
    }
}

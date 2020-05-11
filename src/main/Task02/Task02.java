package main.Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Task02 {
    static Integer[] returnIndexMethod(Integer[] array, int NumberSum) {
        Integer[] containsIndex = new Integer[2];

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);

        for (int i = 0; i < list.size(); i++) {
            int numberTwo;
            int numberOne = list.get(i);
            numberTwo = NumberSum - numberOne;
            if (list.contains(numberTwo)) {
                containsIndex[0] = list.indexOf(numberOne);
                containsIndex[1] = list.indexOf(numberTwo);
            }
        }
        return containsIndex;
    }


    public static void main(String[] args) {
        Integer[] array = {3, 8, 15, 17};
        int number = 23;
        returnIndexMethod(array, number);
        for (Integer i :
        returnIndexMethod(array, number)) {
            System.out.print(i + " ");
        }
    }
}

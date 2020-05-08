package main.Task01;

import java.util.ArrayList;
import java.util.Collections;

public class MyCollection extends ArrayList<Integer> {
    @Override
    public boolean add(Integer value) {
        for (int i = 0; i < size(); i++) {
            set(i, get(i) + value);
        }
        return super.add(value);
    }

    public boolean remove(Integer value) {
        for (int j = 0; j < size(); j++) {
            set(j, get(j) - value);
        }
        return super.remove(value);
    }

    @Override
    public Integer get(int index) {
        return super.get(index);
    }

    public int maxValue() {
        int max = 0;
        for (Integer element :
                this) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int minValue() {
        int min = get(0); 
        for (Integer element :
                this) {
            if (element < min) {
                element = min;
            }
        }
        return min;
    }

    public double getAverage() {
        int sum = 0;
        double average;
        for (Integer element : this) {
            sum += element;
        }
        return average = sum / size();
    }
}

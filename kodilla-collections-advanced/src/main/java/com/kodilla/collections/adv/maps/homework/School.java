package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>();

    public School(List<Integer> school) {
        this.school = school;
    }
    public int getSum() {
        int sum = 0;
        for (int value : school)
            sum += value;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }
}

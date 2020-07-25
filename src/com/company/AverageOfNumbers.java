package com.company;

import java.util.ArrayList;

public class AverageOfNumbers {

    double getAverage(ArrayList<Integer> l){
        return l.stream().mapToDouble(x->x).average().getAsDouble();
    }
}

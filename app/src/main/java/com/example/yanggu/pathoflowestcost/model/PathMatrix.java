package com.example.yanggu.pathoflowestcost.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanggu on 3/1/17.
 */

public class PathMatrix {

    private final int offset = -1;

    private List<List<Integer>> matrixRepresentation = new ArrayList<List<Integer>>();

    public void addColumn(List<Integer> li) {
        matrixRepresentation.add(li);
    }

    public int getWidth() {
        return matrixRepresentation.size();
    }

    public int getHeight() {
        return matrixRepresentation.get(0).size();
    }

    public List<Integer> getColumn(int i) {
        return matrixRepresentation.get(i);
    }

    public int getValue(int x, int y) {
        System.out.println("x is " + x + ", y is " + y);
        System.out.println("column x is " + matrixRepresentation.get(x).size() + " units tall");

        return matrixRepresentation.get(x).get(y);

    }
}

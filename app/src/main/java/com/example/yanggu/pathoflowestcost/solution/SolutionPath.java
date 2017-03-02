package com.example.yanggu.pathoflowestcost.solution;

import com.example.yanggu.pathoflowestcost.model.PathMatrix;
import com.example.yanggu.pathoflowestcost.model.Step;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanggu on 3/1/17.
 */

public class SolutionPath extends ArrayList<Step>{


    public int getCost() {
        int accumulator = 0;
        for (Step step: this) {
            accumulator += step.getCost();
        }

        return accumulator;
    }


}

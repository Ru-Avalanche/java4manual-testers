package com.db.edu.etl;

/**
 * Created by Java_11 on 05.12.2016.
 */
public class TransformationResultWithAverageDTO {
    private int[] transformationResult;
    private double average;

    public TransformationResultWithAverageDTO(int[] transformationResult, double average) {
        this.transformationResult = transformationResult;
        this.average = average;
    }

    public int[] getTransformationResult() {
        return transformationResult;
    }

    public void setTransformationResult(int[] transformationResult) {
        this.transformationResult = transformationResult;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}

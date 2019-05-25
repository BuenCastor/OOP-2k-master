package ua.edu.chmnu.fks.oop.lab_7;

public interface ArrayDoubleProcessor {
    double max(double[] arr);
    double min (double []arr);
    double [] filter(double[]arr, Predicate predicate);
    void sort(double []arr);
}

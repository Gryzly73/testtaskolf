package com.company;

import com.company.service.Transformation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static Transformation transformation = new Transformation();
    private final static List<Double> doubleList = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 100_000_000; i++){
            doubleList.add(99.88);
        }
        System.out.println(transformation.getMessage(doubleList));
        System.out.println("==================================================================");

        doubleList.add(2, 7.78);
        transformation.getMessage(doubleList);
        System.out.println(transformation.getMessage(doubleList));
        System.out.println("==================================================================");

        doubleList.add(3, 7.79);
        transformation.getMessage(doubleList);
        System.out.println(transformation.getMessage(doubleList));
        System.out.println("==================================================================");

    }

}

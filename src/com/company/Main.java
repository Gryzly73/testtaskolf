package com.company;

import com.company.service.Transformation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static Transformation transformation = new Transformation();
    private final static List<Double> doubleList = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here

        for (int i = 0; i < 100_000_000; i++){
            doubleList.add(99.88);
        }

        doubleList.add(2, 7.78);
        //   doubleList.add(10, 7.77);
        Double aDouble = transformation.checkList(doubleList);
        System.out.println(aDouble);
    }

}

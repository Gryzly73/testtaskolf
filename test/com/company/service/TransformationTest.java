package com.company.service;

import java.util.ArrayList;
import java.util.List;

public class TransformationTest {

    private final List<Double> doubleList = new ArrayList<>();
    private final Transformation transformation = new Transformation();

    @org.junit.Before
    public void setUp() throws Exception {

        for (int i = 0; i < 100_000_000; i++){
            doubleList.add(99.88);
        }
        doubleList.add(2, 7.78);
    }



    @org.junit.Test
    public void createSet() {
        long startProcess = System.currentTimeMillis();
        Double aDouble = transformation.checkList(doubleList);
        long endProcess = System.currentTimeMillis();
        System.out.println(aDouble);
        System.out.println(endProcess - startProcess);
    }
}
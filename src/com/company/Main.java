package com.company;

import com.company.service.Transformation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static Transformation transformation = new Transformation();
    private final static List<Double> doubleList = new ArrayList<>();

    public static void main(String[] args) {

        // Массив из одинаковых чисел

        for (int i = 0; i < 1_000; i++){
            doubleList.add(99.88);
        }

        System.out.println(transformation.getMessage(doubleList));
        System.out.println("==================================================================");

        // Добавим 1 отличное число

        doubleList.add(2, 2.22);
        transformation.getMessage(doubleList);
        System.out.println(transformation.getMessage(doubleList));
        System.out.println("==================================================================");

        // Добавим второе отличное число

        doubleList.add(3, 7.79);
        transformation.getMessage(doubleList);
        System.out.println(transformation.getMessage(doubleList));
        System.out.println("==================================================================");

        // Массив из одинаковых чисел - обновим + отличное число на 0й позиции
        doubleList.clear();
        for (int i = 0; i < 1_000; i++){
            doubleList.add(99.88);
        }
        doubleList.add(0, 0.00);
        transformation.getMessage(doubleList);
        System.out.println(transformation.getMessage(doubleList));
        System.out.println("==================================================================");
    }

}

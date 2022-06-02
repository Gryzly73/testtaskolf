package com.company.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Transformation {

    public String getMessage(List<Double> list) {
        Double aDouble = checkList(list);
        if (aDouble != null) {
            return ("Результат - " + aDouble);
        }
        else {
            return ("Невалидные данные");
        }
    }

    public Double checkList(List<Double> list){
        double double0 = list.get(0);
        double double1 = list.get(1);
        double double2 = list.get(2);
        Double result = null;
        Set<Double> setFromList = list.parallelStream().collect(Collectors.toSet());

        if (setFromList.size() == 2) {
            if (double0 != double1) {
                if (double0 != double2) {
                    result = double0;
                } else {
                    result = double1;
                }
            } else {
                Iterator<Double> iterator = setFromList.iterator();
                while (iterator.hasNext()) {
                    Double next = iterator.next();
                    if (next != double0) {
                        result = next;
                    }
                }
            }
        }
        return result;
    }
}

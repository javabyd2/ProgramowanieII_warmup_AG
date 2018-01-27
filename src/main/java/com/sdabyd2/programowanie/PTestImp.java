package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.List;

public class PTestImp {


    public static String last(List<String> lista) {
        return lista.get(lista.size() - 1);
    }

    public static int length(List<Integer> integers) {
        return integers.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reverseList = new ArrayList<Integer>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reverseList.add(numbers.get(i));
        }
        return reverseList;
    }
}
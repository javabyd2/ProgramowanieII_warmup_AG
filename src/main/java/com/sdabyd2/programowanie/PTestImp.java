package com.sdabyd2.programowanie;

import java.util.*;
import java.util.stream.Collectors;

public class PTestImp {


    public static String last(List<String> lista) {
        return lista.get(lista.size() - 1);
    }

    public static int length(List<Integer> integers) {
        return integers.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reverseList = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reverseList.add(numbers.get(i));
        }
        return reverseList;
        /*
        Collections.reverse(numbers);
         */
    }

    public static boolean isPalindrome(List<String> list) {
        boolean isPalindrome = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(list.get(list.size() - 1 - i))) ;
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static Object[] removeAt(List<String> list, int k) {
        List<String> newList = new ArrayList<>(list);
        String removeObject = newList.remove(k - 1);
        return new Object[]{newList, removeObject};
    }

    public static List<String> randomSelect(List<String> strings, int i) {
        Random random = new Random(System.currentTimeMillis());

        List<String> newListFromRandomSelect = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            newListFromRandomSelect.add(strings.get(random.nextInt(random.nextInt(strings.size()))));
        }

        return newListFromRandomSelect;
    }

//    public List<String> flatten(List<Object> objects) {
//        List<String> flattenList = new ArrayList<>();
//        flattenList = objects.stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//
//        return flattenList;
//    }

    public static List<String> compress(List<String> strings) {
        Set<String> unique = new HashSet<>();
        List<String> compressedList = new ArrayList<>();
        for (String s : strings) {
                unique.add(s);
        }
        for (String s : unique) {
            compressedList.add(s);
        }

        /*
        Set<String> shortList = new LinkedHashSet<>(strings);
        List<String> target = new ArrayList<>(shortList);
         */
        return compressedList;
    }

    public static List<String> duplicate(List<String> strings) {
        List<String> duplicates = new ArrayList<>();
        for (String s : strings) {
            duplicates.add(s);
            duplicates.add(s);
        }
        return duplicates;
    }
}
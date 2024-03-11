package com.teachmeskills.lesson18_hw.task2.service;

import java.util.List;

public class Service {
    public static List<String> getNamesStartWithA(List<String> list){
        List<String> newList = list.stream().filter(v -> v.toLowerCase().startsWith("а")).toList();
        System.out.println("All names beginning with \"a\" " + newList);
        return newList;
    }

    public static List<String> sortAndReturnFirstElement(List<String> list){
        List<String> newList = list.stream().sorted().findFirst().stream().toList();
        System.out.println("The first element of the sorted collection " + newList);
        return newList;
    }

}

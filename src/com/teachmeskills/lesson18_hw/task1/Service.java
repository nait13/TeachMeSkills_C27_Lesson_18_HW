package com.teachmeskills.lesson18_hw.task1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;


public class Service {

    public static List<Integer> createListInteger() {
        List<Integer> arrList = new ArrayList();
        Random random = new Random();
        while (arrList.size() < 20) {
            arrList.add(random.nextInt(1, 50));
        }
        return arrList;
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> newList = list.stream().distinct().toList();
        System.out.println("Remove duplicates " + newList);
        return newList;
    }

    public static List<Integer> multiplyEachElementBy2(List<Integer> list) {
        List<Integer> newList = list.stream()
                .map(v -> v * 2)
                .toList();
        System.out.println("Multiply each element by 2 " + newList);
        return newList;
    }


    public static List<Integer> outputAllEvenElementsInTheRange7To17(List<Integer> list) {
        List<Integer> newList = list.stream()
                .skip(6)
                .limit(11)
                .filter(v -> v % 2 == 0)
                .toList();
        System.out.println("Output all even elements in the range 7 to 17 " + newList);
        return newList;
    }

    public static void sortAndDisplayTheFirst4ItemsOnTheScreen(List<Integer> list) {
        List<Integer> newList = list.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.print("Sort and display the first 4 items on the screen ");
        Stream.of(newList).forEach(System.out::print);
        System.out.println("");
    }

    public static void printTheNumberOfItemsInTheStream(List<Integer> list) {
        long num = list.stream().count();
        System.out.println("Number of items in the stream " + num);
    }

    public static void printTheArithmeticMeanOfAllNumbers(List<Integer> list) {
        List<Integer> newList = list.stream()
                .reduce(Integer::sum)
                .stream()
                .toList();
        System.out.println("Arithmetic mean of all numbers in the streamer " + newList.get(0));
    }

}

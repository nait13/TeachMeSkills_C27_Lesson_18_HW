package com.teachmeskills.lesson18_hw.task1;

import java.util.List;


import static com.teachmeskills.lesson18_hw.task1.Service.*;
/**
 *The Service class contains methods for working with Stream.
 *  The inputArray method will populate the list with random integers.
 *  The removingDuplicates method removes duplicates.
 *  The outputAllEvenElementsInTheRange7To17 method outputs all even elements in the range from 7 to 17 (inclusive).
 *  The multiplyEachElementBy2 method multiplies each element by 2.
 *  The sortAndDisplayTheFirst4ItemsOnTheScreen method sorts and displays the first 4 elements.
 *  The printTheNumberOfItemsInTheStream method displays the number of elements in the stream.
 *  The printTheArithmeticMeanOfAllNumbers method displays the arithmetic average of all numbers in the stream
 */
public class Runner {
    public static void main(String[] args) {
        List<Integer> arrList = createListInteger();
        System.out.println("Create list  " + arrList);

        removeDuplicates(arrList);
        outputAllEvenElementsInTheRange7To17(arrList);
        multiplyEachElementBy2(arrList);
        sortAndDisplayTheFirst4ItemsOnTheScreen(arrList);
        printTheNumberOfItemsInTheStream(arrList);
        printTheArithmeticMeanOfAllNumbers(arrList);
    }
}

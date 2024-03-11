package com.teachmeskills.lesson18_hw.task2;

import com.teachmeskills.lesson18_hw.task2.fabricgroup.GroupC27;

import java.util.List;

import static com.teachmeskills.lesson18_hw.task2.service.Service.*;
/**
 * The Service class consists of a service method that processes the file.
 * The selectionNames method selects all names starting with "a" (regardless of upper/lower case letters).
 * The listSorting method sorts and displays the first element of the collection
 */
public class Runner {
    public static void main(String[] args) {
       List<String> gr27 = GroupC27.createGroup();

        getNamesStartWithA(gr27);
        sortAndReturnFirstElement(gr27);

    }
}

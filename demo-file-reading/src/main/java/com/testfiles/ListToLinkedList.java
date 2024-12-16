package com.testfiles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListToLinkedList {

    List<Integer> list = new ArrayList<>(); 
    List<Integer> list2 = new LinkedList<>(); 

    public void changeList() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (Integer number: list) {
            System.out.println(number);
        }

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        for (Integer number: list2) {
            System.out.println(number);
        }


    }
    
}   

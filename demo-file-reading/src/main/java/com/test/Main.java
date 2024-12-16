package com.test;

import java.util.Arrays;
import java.util.List;

import com.templatePatern.Programmer;
import com.templatePatern.Worker;
import com.testfiles.BubbleSort;
import com.testfiles.ListToLinkedList;


public class Main {

    public static void main(String[] args) {

        Worker programmer = new Programmer();
        programmer.work();

        /*
        ListToLinkedList ll = new ListToLinkedList();
        ll.changeList();
        */
        List<String> list = Arrays.asList("Ajeet", "Steve", "Rick", "Becky", "Mohan", "Zarra", "Thmas", "Majid");
        BubbleSort bubbleSort = new BubbleSort(list);
        bubbleSort.bubbleSort();
    }
}
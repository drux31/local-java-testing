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
        String dataDir = "/home/drux/IdeaProjects/Phone Book with Java/Phone Book with Java/data";
        String directory = dataDir + "/small_directory.txt" ;
        
        BubbleSort bubbleSort = new BubbleSort(directory);
        bubbleSort.bubbleSort();
    }
}
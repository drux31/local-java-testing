package com.testfiles;
import java.util.List;
public class BubbleSort {

    private List<String> list;

    public BubbleSort(List<String> list) {
        this.list = list;
    }

    public void bubbleSort() {
        String temp;
        for (int j = 0; j < list.size(); j++) {

            for (int i = j+1; i < list.size(); i++) {
                
                if (list.get(i).compareTo(list.get(j)) < 0) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
            System.out.println(list.get(j));
        }
    }
}

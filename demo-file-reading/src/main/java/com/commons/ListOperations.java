package com.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListOperations {
     public void removeTheSame(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        // write your code here
        int i = 0;
        List<Integer> index = new ArrayList<Integer>();
        for (String str: arrayList) {
            if (str.equals(linkedList.get(i))) {
                index.add(i);
                System.out.println(linkedList.get(i));
                System.out.println(arrayList.get(i));
                System.out.println(i);
            }
            i++;
        }

        int j = index.size() - 1;
        while (j >= 0) {
            String obj1 = linkedList.get(index.get(j));
            String obj2 = arrayList.get(index.get(j));

            linkedList.remove(obj1);
            arrayList.remove(obj2);
            j--;
        }        


        System.out.println(linkedList);
        System.out.println(arrayList);
    }

    public void mergeLists(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        // write your code here
        for (String str: arrayList) {
            linkedList.addLast(str);
        }
        System.out.printf("The new size of LinkedList is %d\n", linkedList.size());
        System.out.println(linkedList);
    }

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        // write your code here
        int nb = 0;
        ArrayList<String> keyList = new ArrayList<>();
        for (Map.Entry<String, String> entry: map1.entrySet()) {
            if (map2.containsKey(entry.getKey()) && map2.get(entry.getKey()).equals(entry.getValue())) {
                nb ++;
            }

            if (entry.getKey().length() >= 7 || entry.getValue().length() >= 7) {
                keyList.add(entry.getKey());
            }
        }

        for (String key: keyList) {
            map1.remove(key);
        }
        
    }

}

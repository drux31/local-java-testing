package com.testfiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BubbleSort {

    private List<String> list;
    private String filename;

    public BubbleSort(List<String> list) {
        this.list = list;
    }

    public BubbleSort(String filename) {
        this.filename = filename ;
    }

    private List<String> getContent() {
        List<String> content = new ArrayList<>();
        File dir = new File(this.filename);
        try (Scanner scanDir = new Scanner(dir);){
            while (scanDir.hasNextLine()) {
                content.add(scanDir.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is a problem with the file: " + e.getMessage());
        }
        //System.out.print("Finished getting the content. size : " + content.size());
        return content;
    }

    public void bubbleSort() {
        this.list = getContent();
        String temp;
        for (int j = 0; j < list.size(); j++) {

            for (int i = j+1; i < list.size(); i++) {
                
                /*
                if (list.get(i).compareTo(list.get(j)) < 0) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
                     */
                if (list.get(i).split(" ", 2)[1].compareTo(list.get(j).split(" ", 2)[1]) < 0) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
            System.out.println(list.get(j));
        }
    }
}

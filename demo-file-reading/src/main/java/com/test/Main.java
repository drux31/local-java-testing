package com.test;

import java.util.Scanner;

import com.core.FileReaders;

import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) {

        FileReaders fileReaders = new FileReaders();

        String pathToFile = "/home/drux/Java/project/demo-file-reading/data/";
        File file = new File(pathToFile + "dataset_91033.txt");
        String populationFilePath = pathToFile + "dataset_91069.txt";

        try(Scanner scanner = new Scanner(file)) {
            int total = 0;
            while (scanner.hasNext()) {
                total += Integer.parseInt(scanner.nextLine());
            }
            System.out.println(total);

        }catch(FileNotFoundException e) {
            System.out.println("There is no file on the specified location: " + pathToFile);
        }

        fileReaders.largestIncrease(populationFilePath);
    }
}
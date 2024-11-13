package com.test;

import java.util.Scanner;

import com.core.FileReaders;
import com.core.FileWriters;

import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) {

        //FileReaders fileReaders = new FileReaders();
        FileWriters fileWriters = new FileWriters();

        String pathToFile = "/home/drux/Java/project/demo-file-reading/data/";
        String file = pathToFile + "printwriter.txt";

        //fileWriters.helloPrintwriter(file);   
        fileWriters.testPrint();
        
    }
}
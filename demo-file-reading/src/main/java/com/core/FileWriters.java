package com.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileWriters {

    //Create a file with hello wirld as content
    private FileReaders fileReaders = new FileReaders();
    public void helloFile(String filepath) {
        try {

            File file = new File(filepath);
            FileWriter writer = new FileWriter(file);
            
            writer.write("Hello, World in a file\n");
            writer.close();
            System.out.println(fileReaders.getCOntent(filepath));
            

        } catch(IOException e) {
            System.out.println("There is a problem with file in the specified location: " + filepath + "\nException content: " + e.getMessage());
        }
    }

     //Create a file with hello wirld as content
     public void helloPrintwriter(String filepath) {

        File file = new File(filepath);
        try(PrintWriter printWriter = new PrintWriter(file)) {

            printWriter.println("Hello world into a file");
            printWriter.printf("I want %d million dollars !!", 400);
                        
            System.out.println(fileReaders.getCOntent(filepath));           

        } catch(IOException e) {
            System.out.println("There is a problem with file in the specified location: " + filepath + "\nException content: " + e.getMessage());
        }
    }

}

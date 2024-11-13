package com.core;

import java.io.File;
import java.io.FileNotFoundException;
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

    public void testPrint() {

        File file = new File("file.txt"); // some file

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print("Lorem ipsum "); 
            printWriter.print("dolor sit amet");
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void testPrint(int ignore) {

        File file = new File("file.txt"); // some file

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Lorem ipsum");
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void printRangeToFile(String file, boolean append, int fromIncl, int toExcl) {
        try (FileWriter writer = new FileWriter(file, append)) {
            for (int i = fromIncl; i < toExcl; i++) {
                writer.write(i + " ");
            }
        } catch (IOException e) {
            System.out.printf("An exception occurred %s", e.getMessage());
        }
    }

}

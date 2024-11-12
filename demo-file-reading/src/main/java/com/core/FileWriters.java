package com.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriters {

    //Create a file with hello wirld as content
    public void helloFile(String filepath) {

        FileReaders fileReaders = new FileReaders();
        try {

            File file = new File(filepath);
            FileWriter writer = new FileWriter(file);
            
            writer.write("Hello, World in a file\n");
            writer.close();
            System.out.println(fileReaders.getCOntent(filepath));
            

        } catch(IOException e) {
            System.out.println("There is a problem with file in the specified location: " + e);
        }
    }

}

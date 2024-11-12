package com.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReaders {
    
    //public FileReaders() {}
    
    private String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public String getCOntent(String filePath) throws IOException{
        return readFileAsString(filePath);
    }

    public void sumContent(String filePath) {

        File file = new File(filePath);        
        try(Scanner scanner = new Scanner(file)) {
            int total = 0;
            while (scanner.hasNext()) {
                total += Integer.parseInt(scanner.nextLine());
            }
            System.out.println(total);

        }catch(FileNotFoundException e) {
            System.out.println("There is no file on the specified location: " + filePath);
        }
    }

    public void getEven(String url) {

        int nb_even = 0;
        try {
            var scan = new Scanner(new URL(url).openStream(), "UTF-8");
            int test;
            while (scan.hasNext()) {
                test = Integer.parseInt(scan.nextLine());
                if (test == 0) {
                    break;
                } else if(test % 2 == 0) {
                    nb_even += 1;
                }
            }
            System.out.println(nb_even);
            scan.close();

        } catch(FileNotFoundException e) {
            System.out.println("There is no file on the specified location: " + url);
        } catch (MalformedURLException e) {
            System.out.println("The provided URL is not correct: " + url);
        } catch (IOException e) {
            System.out.println("There might be a problem with the URL: " + url);
        }
    }

    public void getGreater(String filename) {

        try{
            String[] nums = readFileAsString(filename).split(" ");
            int greater = Integer.parseInt(nums[0]);

            for (int i = 1; i < nums.length; i++) {
                if (Integer.parseInt(nums[i]) > greater) {
                    greater = Integer.parseInt(nums[i]);
                }
            }
            System.out.println(greater);

        }catch(FileNotFoundException e) {
            System.out.println("There is no file on the specified location: " + filename);
        } catch (IOException e) {
            System.out.println("There is no file on the specified location: " + filename);
        }

    }

    public void getGreaterThan9999(String filename) {

        try{
            String[] nums = readFileAsString(filename).split(" ");
            int counter = 0;
            
            for (int i = 0; i < nums.length; i++) {
                if (Integer.parseInt(nums[i]) >= 9999) {
                    counter+=1;
                }
            }
            System.out.println(counter);

        }catch(FileNotFoundException e) {
            System.out.println("There is no file on the specified location: " + filename);
        } catch (IOException e) {
            System.out.println("There is no file on the specified location: " + filename);
        }

    }

    public void largestIncrease(String filename) {
        
        try (Scanner scan = new Scanner(new File(filename))) {
            Double dif = 0d;    
            String year = "";
            String[] line;
            String[] prevLine = {};
            scan.nextLine();
            while(scan.hasNext()) {
                line = scan.nextLine().split("\t");
                if (prevLine.length == 0) {
                    prevLine = line;
                } else {
                    if (Double.parseDouble(line[1].replaceAll(",", "")) - Double.parseDouble(prevLine[1].replaceAll(",", "")) > dif) {
                        dif = Double.parseDouble(line[1].replaceAll(",", "")) - Double.parseDouble(prevLine[1].replaceAll(",", ""));
                        year = line[0];
                    } 
                    prevLine = line;
                }
            }
            System.out.println(year);
        } catch (FileNotFoundException e) {
            System.out.println("There is no file on the specified location: " + filename);
        }
    }

}

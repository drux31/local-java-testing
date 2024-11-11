package com.test;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void getEven(String url) {

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

    public static void getGreater(String filename) {

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

    public static void main(String[] args) {
        String pathToFile = "/home/drux/Java/project/demo-file-reading/data/";
        File file = new File(pathToFile + "dataset_91033.txt");
        String numbersPath = pathToFile + "dataset_91007.txt";
        //var scanner = new Scanner(new URL("http://www.google.com").openStream(), "UTF-8");

        try(Scanner scanner = new Scanner(file)) {
            int total = 0;
            while (scanner.hasNext()) {
                total += Integer.parseInt(scanner.nextLine());
            }
            System.out.println(total);

        }catch(FileNotFoundException e) {
            System.out.println("There is no file on the specified location: " + pathToFile);
        }

        //Get the greater number
        //in the file
        getGreater(numbersPath);

        //get only the even numbers
        String url = "https://stepik.org/media/attachments/lesson/91065/dataset_91065.txt";
        getEven(url);
    }
}
package com.test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.sqlite.SQLiteDataSource;

import com.commons.A;
import com.commons.BlackBox;
import com.commons.Command;
import com.commons.Light;
import com.commons.LightOffCommand;
import com.commons.LightOnCommand;
import com.commons.ListOperations;
import com.commons.MessageNotifier;
import com.commons.NumbersThread;
import com.commons.SquareWorkerThread;
import com.commons.Students;
import com.config.Controller;
import com.config.CoolJDBC;
import com.commons.MyThread;
import com.core.SomeClass;
import com.templatePatern.Programmer;
import com.templatePatern.Worker;
import com.testfiles.BubbleSort;
import com.testfiles.ListToLinkedList;
import com.testfiles.Person;


public class Main {

    static void fibonacci() {
        int prev = 0;
        int current = 1;
        for (int i = 0; i <= 25; i++) {
            int swap = prev;
            prev = current;
            current += swap;
            if (i == 19) {
                System.out.println(current);
            }
        }
    }

    enum BallsColor {
        RED, GREEN, BLUE, YELLOW, ORANGE
    }


    enum Status {
        RECEIVED, PROCESSING, CHECKING, DISPATCHED, PAYMENT_COLLECTION
    }

    enum Sections {
        DAISY, LOTUS, TULIP, ROSE
    }

    enum Fonts {
        BOLD, LARGE, MEDIUM, SMALL, ITALIC, NORMAL
    }  

    public static void main(String[] args) throws Exception { 
        String[] words = {"this", " ", "is", " ", "it"};
        CharArrayWriter writer = new CharArrayWriter();
        for (String word: words) {
            writer.write(word);
        }
        char[] charArray = writer.toCharArray();
        writer.close();
        System.out.println(Arrays.toString(charArray));
        //String.join("", words).toCharArray()
        
        int[] message = new int[] {114, 101, 97, 100, 32, 97, 98, 111, 117, 116, 32, 65, 83, 67, 73, 73};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for (int code : message) {
            outputStream.write(code);
        }
        System.out.println(outputStream.toString());

        File sampleFile = new File("sample.txt");
        byte[] content = new byte[] {'J', 'a', 'v', 'a'}; 

        try {
            OutputStream _outputStream = new FileOutputStream(sampleFile, true);
            _outputStream.write(content);
            _outputStream.close();
        } catch (Exception e) {
            System.out.println("Error!");
        }

        Controller controller = new Controller();
        Light light = new Light();
        
        Command lightsOn = new LightOnCommand(light);
        Command lighsOff = new LightOffCommand(light);

        controller.setCommand(lightsOn);
        controller.executeCommand();

        controller.setCommand(lighsOff);
        controller.executeCommand();

        EnumSet<BallsColor> colors = EnumSet.of(BallsColor.GREEN, BallsColor.ORANGE);
        System.out.println(colors);

        EnumSet<BallsColor> allColors = EnumSet.allOf(BallsColor.class);
        System.out.println(allColors);

        EnumSet<BallsColor> emptyEnum = EnumSet.noneOf(BallsColor.class);
        System.out.println(emptyEnum);
        
        EnumSet<Status> statuses = EnumSet.range(Status.RECEIVED, Status.DISPATCHED);
        statuses.remove(Status.CHECKING); // true
        statuses.remove(Status.DISPATCHED); // true
        
        statuses.add(Status.CHECKING); 
        
        // Notice how Checking Enum is placed at the correct position 
        // as in Status class in spite of adding it afterwards
        System.out.println(statuses); // [RECEIVED, PROCESSING, CHECKING]
        statuses.contains(Status.PROCESSING); // true

        EnumSet<Fonts> enumSet = EnumSet.range(Fonts.SMALL, Fonts.ITALIC);
        System.out.println(enumSet);
    }

    
    public static void printNextInteger(int n) {
        
        int next = n % 2 == 0? n + 2 : n + 1;
        System.out.println(next);
    }
    
    public static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1) ;
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } 
        return fib(n - 1) + fib(n - 2);
    }

    public static long method(long n) {
        if (n == 0) {
            return 0;
        }            
        return n % 10 + method(n / 10);
    }

    /* Fix this method */
    public static void printReverseCharByChar(String s) {
        if (s.length() > 0) {
            int last = s.length() - 1;
            System.out.print(s.charAt(last));
            printReverseCharByChar(s.substring(0, last));
        }
    }

    public static void printDollars(int n) {
        if (n > 1) {
            printDollars(n - 1);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("$");
        }
    }

    public static double pow(double a, long n) {
        // write your code here
        if (n % 2 == 0) {
            return Math.pow(Math.pow(a, 2), n / 2);
        }
        return a * Math.pow(a, n-1);
    }

    public static int comb(int n, int k) {
        // write your code here
        if (k == 0) {
            return 1;
        } else if (k > n) {
            return 0;
        }
        return comb(n-1, k) + comb(n-1, k-1);
    }

    public static long test(long n) {
        if (n == 1) {
            return 0;
        }
        return test(n / 2) + 1;
    }

    public static String toString(long num) {
        return Long.toString(num);// some string
    }
        
    public static String toString(int num) {
        return Integer.toString(num);// some string
    }
}
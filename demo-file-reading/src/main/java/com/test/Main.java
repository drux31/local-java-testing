package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.commons.A;
import com.commons.BlackBox;
import com.commons.ListOperations;
import com.commons.MessageNotifier;
import com.commons.NumbersThread;
import com.commons.SquareWorkerThread;
import com.commons.Students;
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

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            byte[] arr = new byte[3];
            fis.read(arr); 
            for(byte b : arr) { 
                System.out.print((char) b); 
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
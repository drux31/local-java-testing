package com.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.templatePatern.Programmer;
import com.templatePatern.Worker;
import com.testfiles.BubbleSort;
import com.testfiles.ListToLinkedList;
import com.testfiles.Person;


public class Main {

    public static void main(String[] args) {

        Worker programmer = new Programmer();
        programmer.work();

        /*
        ListToLinkedList ll = new ListToLinkedList();
        ll.changeList();
        */
        /*String dataDir = "/home/drux/IdeaProjects/Phone Book with Java/Phone Book with Java/data";
        String directory = dataDir + "/small_directory.txt" ;
        
        BubbleSort bubbleSort = new BubbleSort(directory);
        bubbleSort.bubbleSort();
        */
        //int n = 99;
        //printNextInteger(n);
        //System.out.println(pow(1.5, 10));
        System.out.println(comb(3, 2));

        int[] arr = {1, 128, 127, 129};
        for (int a:arr) {
            System.out.println(a + " " + test(a));
        }

        float fval = 2F;
        //System.out.println(toString(fval));

        long lval = 2L;
        System.out.println(toString(lval));

        byte bval = 2;
        System.out.println(toString(bval));

        char cval = 2;
        System.out.println(toString(cval));

        double dval = 2;
        //System.out.println(toString(dval));

        BigDecimal number = new BigDecimal("2.001");
        number = number.add(BigDecimal.ONE);
        number = number.negate();
        number.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(number);
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
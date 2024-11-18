package com.test;

import com.commons.ComputerStaticFactory;
import com.core.Computer;
import com.core.Laptop;
import com.core.PC;


public class Main {

    public static void main(String[] args) {

    Computer pc = ComputerStaticFactory.newInstance("PC");
    System.out.println(pc instanceof PC);

    Computer laptop = ComputerStaticFactory.newInstance("Laptop");
    System.out.println(laptop instanceof Laptop);
        
    }
}
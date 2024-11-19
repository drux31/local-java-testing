package com.commons;

import com.core.Computer;
import com.core.Laptop;
import com.core.PC;

public class ComputerStaticFactory {

    public static Computer newInstance(String type) {
        if (type.equals("Computer")) {
            return new Computer();
        } else if (type.equals("PC")) {
            return new PC();
        } else if (type.equals("Laptop")) {
            return new Laptop();
        }

        return null ; //if not suitable type
    }
}

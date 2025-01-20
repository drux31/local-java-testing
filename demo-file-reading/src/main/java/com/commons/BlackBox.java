package com.commons;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BlackBox {
    private final int additive;
    private int input1;
    private int input2;

    public BlackBox(int add){
        additive = add;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public boolean equals(BlackBox obj) {
        if (this == obj) return  true;

        if (!(obj instanceof BlackBox)) return false;

        BlackBox that = (BlackBox) obj;

        return (additive == that.additive)
                &&
                (input1 == that.input1)
                &&
                (input2 == that.input2);

    }

}

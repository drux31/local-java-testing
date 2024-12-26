package com.testfiles;

public class Person {

    private final String name;
    private final Person bestFriend;

    public Person(String name) {
        this.name = name;
        this.bestFriend = new Person(name + "'s friend");
    }

    public String getName() {
        return name;
    }

    public Person getBestFriend() {
        return bestFriend;
    }

}

package edu.iust.advancejava.java8features;

public class ExtensionMethods implements Vehicle{

    // Java 8 enables us to add non-abstract method implementations to interfaces by utilizing the default keyword.
    // This feature is also known as Extension Methods.

    @Override
    public String changeGear() {
        return "Gear Changed";
    }

    @Override
    public String speedUp() {
        return "Speed Increased";
    }

    // can we Override Extension Method ?  - pending
}




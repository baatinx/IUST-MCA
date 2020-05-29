package edu.iust.advancejava.jdbc.simpleorm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p =  Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println(b);

        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        boolean b3 = Pattern.matches(".s" , "as");
        System.out.println(b3);

        System.out.println(Pattern.matches("..s.t", "Basit"));
        System.out.println(Pattern.matches("[A-Z]", "A"));
        System.out.println(Pattern.matches("[a-z]", "a"));

        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "n"));
        System.out.println(Pattern.matches("\\D", "@"));
        System.out.println(Pattern.matches("(get|is)([A-Z].*)", "getName"));
    }
}
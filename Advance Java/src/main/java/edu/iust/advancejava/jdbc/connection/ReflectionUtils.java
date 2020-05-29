package edu.iust.advancejava.jdbc.connection;

import java.util.regex.Pattern;

public class ReflectionUtils {
    private static Pattern getterpattern = Pattern.compile("(get|is)(A-Z)");
}

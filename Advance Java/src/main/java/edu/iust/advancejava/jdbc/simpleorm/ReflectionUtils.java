package edu.iust.advancejava.jdbc.simpleorm;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReflectionUtils {
    private static Pattern getterpattern = Pattern.compile("(get|is)(A-Z)");

    public static String className(Class<?> clazz){ return clazz.getSimpleName(); }

    public static List<FieldInfo> getFieldNames(Class<?> clazz){
        return Arrays.stream(clazz.getDeclaredMethods())
                .map(ReflectionUtils::getGetter)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    // name should be getFieldInfo or getFieldWithAttributes
    public static Optional<FieldInfo> getGetter(Method getter){
        Matcher match = getterpattern.matcher(getter.getName());
        if(!match.matches())
            return Optional.empty();

        String fieldName = match.group(2);
        try {
            Method setter = getter.getClass().getDeclaredMethod("set" + fieldName, getter.getReturnType());
            return Optional.of(new FieldInfo(getter, setter, makeFirstCharLower(fieldName)));
        }catch (NoSuchMethodException e){
            return Optional.empty();
        }
    }

    static String makeFirstCharLower(String s){
        return s == null ? null :
                Character.toLowerCase(s.charAt(0)) + s.substring(1);
    }


}

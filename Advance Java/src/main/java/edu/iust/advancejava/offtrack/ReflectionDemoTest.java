package edu.iust.advancejava.offtrack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemoTest {
    public static void main(String[] args) throws  Exception {
       ReflectionDemo reflectionDemo = new ReflectionDemo();
       //reflectionDemo.showMePassword();
        // Error - showMePassword has private access

       Class cls = reflectionDemo.getClass();
       System.out.println("The name of the class is: " + cls.getName());

       Constructor constructor = cls.getConstructor();
       System.out.println("\nThe name of the constructor is: " + constructor.getName());

       System.out.println("\nThe public methods of the " + cls.getName() + " are : ");

       Method[] methods = cls.getMethods();
       for(Method m : methods)
           System.out.println(m.getName());


       Method methodCall = cls.getDeclaredMethod("setUsername", String.class);
       System.out.println();
        // invokes the method at runtime
       methodCall.invoke(reflectionDemo, "MustafaBasit74");

       try{
           Method mehtodcall = cls.getDeclaredMethod("setSalary", int.class);
           mehtodcall.invoke(reflectionDemo, 20000);
       }catch (NoSuchMethodException e){
           System.out.println("***No such method found*** " + e);
       }


       Field field = cls.getDeclaredField("password");
       // Allows to access the field irrespective of the access modifier used with the field.
       field.setAccessible(true);
       field.set(reflectionDemo, "mypassword@123");

       // why don't we have to provide field type in  getDeclaredField()
       // because of polymorphism we have to provide the parameter type in getDeclaredMethods()

       // call private method
       Method methodCallToShowMePassword = cls.getDeclaredMethod("showMePassword");
       methodCallToShowMePassword.setAccessible(true);
       //methodCallToShowMePassword.invoke(reflectionDemo);
       methodCallToShowMePassword.invoke(reflectionDemo, null);

       // We can invoke an method through reflection if we know its name and parameter types./
       // If the method of the class doesn't accepts any parameter then null is passed as argument

    }
}
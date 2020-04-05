public class Math {

    private static String staticVariable;
    private String nonStaticVariable;

    public Math(){
        staticVariable = "im static variable";
        nonStaticVariable = "im non-static variable";
    }

// declare a static method
    public static int sum(int a, int b ){
        return (a+b);
    }

    public static void StaticMethod(){

        System.out.println(staticVariable); // we can only use static variable in a static method;

        // System.out.println(nonStaticVariable); // we cannot use non-static variable in a static method;

    }
}

public class StringEqualityTest {
    public static void main(String[] args) {

        String a = "basit";
        String b = "basit";

        String c = new String("basit");

        // "==" checks reference
        if( a == b )    System.out.println("a equals b");
        if (a == c)     System.out.println("a equals c");

        // "equals" checks value
        if(a.equals(b))     System.out.println("true");
        if(a.equals(c))     System.out.println("true");

    }
}

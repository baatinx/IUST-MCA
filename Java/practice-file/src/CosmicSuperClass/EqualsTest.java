package CosmicSuperClass;

public class EqualsTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("basit", 200000, 2020, 06,12 );
        staff[1] = new Employee("basit", 200000, 2020,06, 12);

        Integer a, b;
        a = null;
        b = null;
        if (a == b)
            System.out.println("true");
        else
            System.out.println("false");


    }
}

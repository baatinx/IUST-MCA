public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("alice watson", 25000, 2010, 12, 3);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("alice watson", 25000, 2010, 12, 3);

        Employee bob = new Employee("bob", 45000, 2019, 10, 23);
        System.out.println("alice1 == alice2 : " + (alice1 == alice2));
        System.out.println("alice1 == alice3 : " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3) : " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob) : " + alice1.equals(bob));

        Manager carl = new Manager("carl", 75000, 2019, 3, 10);
        Manager boss = new Manager("carl", 75000, 2019, 3, 10);

        boss.setBonus(35000);


        System.out.println("boss.toString() : " + boss);
        System.out.println("carl.equals(boss) : " + carl.equals(boss));


        System.out.println("alice1.hashCode() : " + alice1.hashCode());
        System.out.println("alice3.hashCode() : " + alice3.hashCode());
        System.out.println("carl.hashCode() : " + carl.hashCode());
        System.out.println("boss.hashCode() : " + boss.hashCode());

    }
}

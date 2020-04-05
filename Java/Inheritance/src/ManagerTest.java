public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("danish",50000);
        boss.setBonus(900);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("bisma", 50000);
        staff[2] = new Employee("huzaif", 40000);

         for (Employee e : staff)
             System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
         }

}


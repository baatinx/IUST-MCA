import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<Employee>();
        staff.add(new Employee("Mustafa Basit",45000));
        staff.add(new Employee("Usmaan Bhat",25000));

        for (Employee e : staff) {
            System.out.println("Name : "+e.getName()+",  Salary : "+e.getSalary());
        }

        staff.add(new Employee("Numaan Bilal",55000));
        staff.add(new Employee("Danish Wani",95000));

        System.out.println("After inserting some records");
        for (Employee e : staff) {
            System.out.println("Name : "+e.getName()+",  Salary : "+e.getSalary());
        }

        System.out.println("Custom retrieval be like");
        System.out.println("Name : "+staff.get(3).getName()+",  Salary : "+staff.get(3).getSalary());









    }
}

package UserDefinedClass;
public class EmployeeTest {
    public static void main(String[] args){

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("mustafa basit", 400000, 2020,2,18);
        staff[1] = new Employee("zahid fayaz", 600000, 2019,2,9);
        staff[2] = new Employee("zakir gulzar mir", 500000, 2020, 4, 19);

               for (Employee e : staff)
            System.out.println("Name : " + e.getName() + ", Salary : " + e.getSalary() + ", Hire Day : " + e.getHireday());


    }

}

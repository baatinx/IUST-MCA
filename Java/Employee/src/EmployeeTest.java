import java.time.*;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff= new Employee[3];
        staff[0]= new Employee("danish",60000,2007, 12, 20);
        staff[1]= new Employee("numaan", 40000,2002,05,31);
        staff[2]= new Employee("murtaza", 35000,2018,05,31);

        //print the employee details

        for(Employee e : staff){
            System.out.println("Name : " + e.getName()+", Salary : " + e.getSalary() + ", HireDay : "+ e.getHireDay() );
        }

        // read user input by which percent he wants to increase the salary of the employees

        System.out.println("enter the percent by which u want to raise the salary of the employees");

        Scanner in=new Scanner(System.in);
        Float percent = in.nextFloat();

        System.out.println("you entered : "+percent);

        for(Employee e : staff){
            e.raiseSalary(percent);
        }

        for(Employee e : staff){
            System.out.println("Name : " + e.getName()+", Salary : " + e.getSalary() + ", HireDay : "+ e.getHireDay() );
        }



    }
}

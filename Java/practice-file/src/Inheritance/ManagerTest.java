package Inheritance;

import UserDefinedClass.Employee;

import javax.crypto.MacSpi;

public class ManagerTest {
    public static void main(String[] args) {

        Manager boss = new Manager("umer wani", 400000,2020, 10,2);
        boss.setBonus(5000);
        System.out.println("boss Salary : " + boss.getSalary());

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("mustafa basit", 200000, 2020,2,18);
        staff[2] = new Employee("zahid fayaz", 100000, 2019,2,9);

        for (Employee e : staff)
            System.out.println("Name : " + e.getName() + ", Salary : " + e.getSalary() + ", Hire Day : " + e.getHireday());



    }

}

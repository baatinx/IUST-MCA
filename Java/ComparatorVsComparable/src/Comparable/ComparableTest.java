package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest{
    public static void main(String[]args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("basit", 3000));
        emp.add(new Employee("Sana", 2000));
        emp.add(new Employee("danish", 8000));
        emp.add(new Employee("nasir", 2000));
        emp.add(new Employee("shakoor", 6000));
        List<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(1);
        Collections.sort(al);
        Collections.sort(emp);
        for (Employee e:
                emp) {
            System.out.println(e.toString());

        }




    }
}



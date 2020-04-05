package CosmicSuperClass;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireday = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void raiseSalary(double byPercent) {
        double raise = (getSalary() * byPercent) / (100);
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;

        return name.equals(other.name) &&
                salary == other.salary &&
                hireday.equals(other.hireday);
    }
}
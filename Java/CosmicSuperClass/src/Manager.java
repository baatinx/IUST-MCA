public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month , int day) {
        super(name, salary, year, month, day ); // will call the parameterised constructor of super class
        bonus=0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // we are overwritting the getsalary() of super class - function overriding
    @Override
    public double getSalary(){
        // actually salary is base salary + bonus , but it can't access base salary directly;
        // only the getSalary() of employee can access it ;
        // we can only access bonus here directly

        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }

    public boolean equals( Object otherObject){
        if (!super.equals(otherObject)) return false;

        Manager other = (Manager) otherObject;
        return  (bonus == other.bonus);
    }

    public int hashCode(){
        return java.util.Objects.hash(super.hashCode(), bonus);
    }

    public String toString(){
        return  super.toString() + "[ bonus = " + bonus + "]";
    }

}

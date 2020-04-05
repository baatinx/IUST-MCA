import java.util.Random;

public class Employee {

    //static initilization blocks
    static {
        Random generator = new Random();
        nextId = generator.nextInt(100);
    }

    //object initilization block
    {
        id = nextId;
        nextId++;
        System.out.println("hi , im in object initilization block");
    }

    private  static int nextId;

    private int id;
    private  String name;
    private  double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    Employee(double salary){
        this("Employee #" + nextId, salary);
        System.out.println("hello from this constructor's remaining code...");
    }

    Employee(){
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public int getId(){ return id; }
}


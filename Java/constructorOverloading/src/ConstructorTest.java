public class ConstructorTest {
    public static void main(String[] args){

        Employee[] staff = new Employee[2];

        staff[0]  = new Employee("Danish", 20000);
        staff[1] = new Employee(90000);


 su

        for( Employee e : staff){
            System.out.println("id :" + e.getId() + "، name : " + e.getName() +",  Salary : " + e.getSalary());

        }


    }

}
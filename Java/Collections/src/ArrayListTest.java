import java.util.*;
class Employee{
    private  String name;
    private  int age;

    Employee( String name, int age ){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int setAge(){
        return age;
    }
}
public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayList store objects of any type

        // ArrayList Does not work with indexes
        // we cant add, remove, using index number
        // further we cant add in the middle


        // non- generic ArrayList

        System.out.println("Non - Generic ArrayList");

        // Collection is an interface
        //list interface implements Collection
        // ArrayList is a class which extends list interface
        Collection al = new ArrayList();

        al.add(1);
        al.add(13.14f);
        al.add(92);
        al.add("basit");
        al.add("Seerat");

        Employee obj = new Employee("zahid bhat", 33);
        // store employee type object in arrayList
        al.add(obj);


        // to remove element , we have to specify the object itself, rather than its index
        al.remove(13.14f);



        for (Object i : al)
            System.out.println(i);
        System.out.println("The size of the arrayList is : "+al.size());

        // Generic ArrayList
        System.out.println("Generic ArrayList");

        Collection<Integer> genericArrayList = new ArrayList<>();
        genericArrayList.add(1);
        genericArrayList.add(2);
        genericArrayList.add(3);

        //genericArrayList.add(13.14f);    //if this line is allowed to execute, it will generate error
        //genericArrayList.add("laptops")  //this will also generate  error

        for (Integer i : genericArrayList)
            System.out.println(i);
    }
}

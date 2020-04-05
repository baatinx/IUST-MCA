import  java.util.*;
import java.io.*;
public class ArrayLi {
    public static void main(String[] args) {
        int size = 10;
        // ArrayList works with indexes
        ArrayList<Integer> al = new ArrayList<>(size);
        List<Integer> all = new ArrayList<>();
        all.add(3,4);
        all.hashCode(2);


        for(int i = 1; i<size; i++)
            al.add(i);

        System.out.println(al + "\n\n");

        al.remove(2); // index starts from 0, so  0,1,2 = third element

        System.out.println("Element removed at index 2 \n" + al);

        System.out.println("Element at index 0 \n " + al.get(0));

        System.out.println("Element added at index 0");
        al.add(0,99); // insert at the index 0;
        System.out.println(al);

        Collections.sort(al);

        System.out.println(al);



    }

}

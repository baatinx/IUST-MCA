import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {

        Collection<Integer> al = new ArrayList<>();
        int i;

        for( i = 1; i <= 10; i++){
            al.add(i);
        }

        // to print ArrayList Elements we will use Iterator interface
        // collection interface has as method iterator() which  Returns an array containing all  elements of collection.


        Iterator itr = al.iterator();

        System.out.println(itr.next());  // this will print first element -- 1
        System.out.println(itr.next()); // this will print next element -- 2

        while(itr.hasNext()){
            System.out.println(itr.next());   // this will print  remaining elements -- 3 to 10
        }

        // if below line is allowed to execute , it will generate an error -- java.util.NoSuchElementException
        // System.out.println(itr.next());

    }
}

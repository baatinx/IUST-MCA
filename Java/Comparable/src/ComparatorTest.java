import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ComparatorTest {
    public static void main( String[] argc){
        ArrayList<Integer> al = new ArrayList<>(5);
        al.add(16);
        al.add(52);
        al.add(93);
        al.add(62);
        al.add(31);
        System.out.println(al);

        Comparator<Integer> com = new ComImpl();

        Collections.sort(al,com);

        System.out.println(al);
    }
}



import java.util.Comparator;

public class ComImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if ( (o1 % 10) > (o2 %10) )
            return 1;

        return -1;
    }
}

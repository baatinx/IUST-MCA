import java.time.LocalDate;
import java.util.Scanner;

public class callByReferenceTest {
    public static void main(String[] args) {
        callByReference obj = new callByReference();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A : ");
        obj.setA( sc.nextInt() );

        System.out.println("Enter the value of B : ");
        obj.setB( sc.nextInt());

        System.out.println("Value *Before* function call");
        System.out.println("A : " + obj.getA() + " B : " + obj.getB() );

        obj.modifyViaCallByReference(obj);

        System.out.println("Value *After* function call");
        System.out.println("A : " + obj.getA() + " B : " + obj.getB() );
        System.out.println(LocalDate.now());

    }

}

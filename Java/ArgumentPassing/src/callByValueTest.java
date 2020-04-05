import java.util.Scanner;

public class callByValueTest {
    public static void main(String[] args) {
        callByValue obj = new callByValue();
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of A : ");
        a = sc.nextInt();

        System.out.println("Enter the value of B : ");
        b = sc.nextInt();

        System.out.println("Value *Before* function call");
        System.out.println("A : " + a + " B : " + b);

        obj.modifyViaCallByValue( a, b );

        System.out.println("Value *After* function call");
        System.out.println("A : " + a + " B : " + b );

    }

}

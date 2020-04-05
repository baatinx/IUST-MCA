import java.util.Scanner;
public class StaticBasicTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        //call static method directly
        System.out.println("The sum of two number is " + Math.sum(a,b));
    }
}

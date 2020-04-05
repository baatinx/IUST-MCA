public class FinallyTest {
    public static void main(String[] args) {

        int num1 = 4, num2 = 0, res = 0;

        try {
            res = (num1 / num2);
            //if Exception will occur above, try block will handle the control to catch block, that means below line will not execute
            System.out.println( num1 + " / " + num2 + "  = " + res);
        } catch (ArithmeticException ae) {
            System.out.println("can't divide by zero / " + ae );
        }catch (Exception e){
            System.out.println("Unknown Exception " + e );
        }finally {
            System.out.println("Bye " );
        }
    }

}

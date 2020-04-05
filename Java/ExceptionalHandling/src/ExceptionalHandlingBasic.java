import javax.xml.catalog.Catalog;
import java.io.IOException;

import java.util.Scanner;
public class ExceptionalHandlingBasic {
    public static void main(String[] args) {

        // Exception & Error are sub class of Throwable class

        // Basically there are two types of errors
        // 1. error that can be handled          -- Exceptions
        // 2. error that can't handled        -- Errors

        //Statements are of two types
        // normal
        // Critical

        // We should always try to write Critical Statement in try block
        // try block will throw the Exception &
        // Catch block will Catch the Exception

        // one try block can have multiple Catch blocks


        // if we don't know what type of Exception the try block will throw, we can use General Exception to Catch it
        // Catch( Exception ae){ ..... }

        /*
            Exception
                    Checked
                        IOException
                        SqlException

                    unchecked
                        RuntimeException
                            ArithmeticException
                            ArrayIndexOutOfBoundException
                            DivideByZeroException
                            FileNotFoundException
                            ...
                            .....

                            ....


        */

        int num1, num2, res = 0;

        Scanner sc = new Scanner(System.in);

        // Read num1
        System.out.println("Enter the First number : ");
        num1 = sc.nextInt();

        // Read num2
        System.out.println("Enter the Second number : ");
        num2 = sc.nextInt();


        try {
            //Critical Statement
            res = (num1 / num2);
            //if Exception will occur above, try block will handle the control to catch block
            System.out.println("this line will not Execute if Exception will occur  above ss");
        } catch (ArithmeticException ae) {
            System.out.println("can't divide by zero / " + ae );
        }catch (Exception e){
            System.out.println("Unknown Exception " + e );

        }

        System.out.println( num1 + " / " + num2 + "  = " + res);


    }
}
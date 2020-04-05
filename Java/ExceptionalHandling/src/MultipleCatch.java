public class MultipleCatch {
    public static void main(String[] args) {
        int x, y, z = 0;
        x = 12;
        y = 4;
        try {
            z = x / y;
            System.out.println( x + " / " + y + "  = " + z);

            final int UPPERBOUND = 3;
            int arr[] = new int[UPPERBOUND];

            for (int i = 0; i < UPPERBOUND; i++)
                arr[i] = i + 1;

            System.out.println("Array Elements are as follows :");

            //  for (int j = 0; j <= UPPERBOUND; j++)
            for (int j = 0; j < UPPERBOUND; j++)
                System.out.println(arr[j]);
        } catch (ArithmeticException ae) {
            System.out.println("can't divide by zero / " + ae);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound" + e);
        }catch (Exception e){
            System.out.println("Unknown Exception " + e );

        }

    }
}


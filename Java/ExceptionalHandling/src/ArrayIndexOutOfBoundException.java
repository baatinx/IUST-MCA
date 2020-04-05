public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {

        final int UPPERBOUND = 3;
        int arr[] = new int[UPPERBOUND];

        try {
            // Critical Statement
            for (int i = 0; i < UPPERBOUND; i++)
                arr[i] = i + 1;

            System.out.println("Array Elements are as follows :");


          //  for (int j = 0; j < UPPERBOUND; j++)
            for (int j = 0; j <= UPPERBOUND; j++)
                System.out.println(arr[j]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound" + e);
        }catch (Exception e){
            System.out.println("Unknown Exception " + e );

        }

    }
}

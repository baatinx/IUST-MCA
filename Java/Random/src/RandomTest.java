import java.util.Random;
public class RandomTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt(50);

        for (int n : arr)
            System.out.println(n);

        //test upperBound
        try {
            System.out.println(arr[55]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        }
    }
}


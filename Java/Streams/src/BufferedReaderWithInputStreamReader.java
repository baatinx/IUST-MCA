import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderWithInputStreamReader {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            while(true){

                System.out.println("Enter Something ( \"q\" for Exit )");
                String input = br.readLine();

                if("q".equals(input)) {
                    System.out.println("Exit!");
                    System.exit(0);
                }

                System.out.println("Input : " + input);
                System.out.println("--------------------\n");
            }

        }catch (IOException e){
            System.out.println("Exception : " + e);
        }

    }
}

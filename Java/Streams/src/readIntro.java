import java.io.IOException;

public class readIntro {
    public static void main(String[] args) throws IOException {

        // System.out : Standard output stream
        // System.in : Standard input stream

        System.out.println("Enter Inupt : ");

        // read() returns ASCII code of fisrst letter

        int ch = System.in.read();

        System.out.println("ASCII code of first letter \"" + ((char)ch) +"\" is : " + ch);

    }
}

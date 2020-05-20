import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamIntroTest {
    public static void main(String[] args) {
        String src = "./demo.txt";
        File file = new File(src);

        try(FileInputStream fis = new FileInputStream(file)){
            System.out.println("Total file size to read( in bytes ) : " + fis.available());

            int content;

            while((content = fis.read()) != -1){
                System.out.print((char)content);
            }

        }catch (IOException e ){
            System.out.println("Exception : " + e);
        }
    }
}

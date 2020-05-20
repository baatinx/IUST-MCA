import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamIntroTest {
    public static void main(String[] args) {

        File file;
        String data = "Java FileOutputStream example";

        String src = "./demo.txt";
        file = new File(src);

        try(FileOutputStream fos = new FileOutputStream(file)) {

            if (!file.exists())
                file.createNewFile();

            byte[] contentInBytes = data.getBytes();

            fos.write(contentInBytes);

            //  fos.write(contentInBytes, 2,5);

            fos.flush();

            fos.close();


        }catch (IOException e) {
            System.out.println("Exception : " + e);
        }
    }
}


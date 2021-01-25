import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Task9_CopyAPicture {
    private static final String PICTURE_PATH = "src\\Resources\\Resources\\picture.jpg";

    private static final String OUTPUT_PATH = "src\\Resources\\Resources\\picture-copy.jpg";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(PICTURE_PATH);
             FileOutputStream fos = new FileOutputStream(OUTPUT_PATH)) {


            int oneByte = fis.read();

            while (oneByte != -1) {

                fos.write(oneByte);

                oneByte = fis.read();
            }

        } catch (
                IOException ioe) {
            ioe.printStackTrace();

        }

    }
}

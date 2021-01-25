import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class Task5_LineNumbers {
    private static final String INPUT_PATH = "src\\Resources\\Resources\\inputLineNumbers.txt";
    private static final String OUTPUT_PATH = "src\\Resources\\Resources\\output.txt";

    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            String line = reader.readLine();

            byte counter = 1;
            while (line != null) {

                writer.println(counter + ". " + line);
                counter++;
                line = reader.readLine();
            }


        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}

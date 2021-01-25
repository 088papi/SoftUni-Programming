import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task7_MergeTwoFiles {
    private static final String INPUT_PATH = "src\\Resources\\Resources\\inputOne.txt";
    private static final String SECOND_INPUT_PATH = "src\\Resources\\Resources\\inputTwo.txt";
    private static final String OUTPUT_PATH = "src\\Resources\\Resources\\output.txt";

    public static void main(String[] args) {
        try (BufferedReader firstReader = new BufferedReader(new FileReader(INPUT_PATH));
             BufferedReader secondReader = new BufferedReader(new FileReader(SECOND_INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {



            String line = firstReader.readLine();

            while (line != null) {
                writer.println(line);
                line = firstReader.readLine();
            }
            line = secondReader.readLine();

            while (line != null) {
                writer.println(line);
                line = secondReader.readLine();
            }


        } catch (
                IOException ioe) {
            ioe.printStackTrace();

        }
    }
}

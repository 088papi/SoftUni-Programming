import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Task6_WordCount {
    private static final String INPUT_PATH = "src\\Resources\\Resources\\words.txt";
    private static final String TEXT_INPUT_PATH = "src\\Resources\\Resources\\text.txt";
    private static final String OUTPUT_PATH = "src\\Resources\\Resources\\results.txt";

    public static void main(String[] args) {
        try (BufferedReader wordReader = new BufferedReader(new FileReader(INPUT_PATH));
             BufferedReader textReader = new BufferedReader(new FileReader(TEXT_INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {


            String[] words = wordReader.readLine().split("\\s+");
            Map<String,Integer> wordOccurrences = new HashMap<>();

            for (String word : words) {
                wordOccurrences.put(word, 0);
            }

            String[] text = textReader.readLine().split("\\s+");
            for (String word : text) {
                if (wordOccurrences.containsKey(word)){
                    wordOccurrences.put(word, wordOccurrences.get(word)+ 1);
                }
            }

            wordOccurrences.entrySet().stream().sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                    .forEach(c -> writer.println(String.format("%s - %d", c.getKey(), c.getValue())));


        } catch (
                IOException ioe) {
            ioe.printStackTrace();

        }
    }
}

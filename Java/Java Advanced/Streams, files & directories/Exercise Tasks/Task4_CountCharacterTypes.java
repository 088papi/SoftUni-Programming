import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Task4_CountCharacterTypes {
    private static final String INPUT_PATH = "src\\Resources\\Resources\\input.txt";
    private static final String OUTPUT_PATH = "src\\Resources\\Resources\\output.txt";

    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_PATH));
             PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {

            String line = reader.readLine();
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            Set<Character> punctuationMarks = Set.of('.',',','!','?');

            byte vowelsCounter = 0;
            byte consonantsCounter = 0;
            byte punctuationMarksCounter = 0;

            while (line != null){
                for (int i = 0; i < line.length() ; i++) {
                    char c = line.charAt(i);
                    if (vowels.contains(c)){
                        vowelsCounter++;
                    } else if (punctuationMarks.contains(c)){
                        punctuationMarksCounter++;
                    } else if(c != ' '){
                        consonantsCounter++;
                    }

                }


                line = reader.readLine();
            }

            writer.println("Vowels: " + vowelsCounter);
            writer.println("Consonants: " + consonantsCounter);
            writer.println("Punctuation: " + punctuationMarksCounter);

        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

    }
}

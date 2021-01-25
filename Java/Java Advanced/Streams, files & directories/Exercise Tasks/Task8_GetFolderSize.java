import java.io.*;

public class Task8_GetFolderSize {
    private static final String DIRECTORY_PATH = "src\\Resources\\Resources\\Exercises Resources";

    private static final String OUTPUT_PATH = "src\\Resources\\Resources\\output.txt";

    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(OUTPUT_PATH)) {


            File folder = new File(DIRECTORY_PATH);
            int size = 0;
            File[] files = folder.listFiles();
            for (File file : files) {
                size += file.length();
            }


            writer.println("Folder size: " + size);
        } catch (
                IOException ioe) {
            ioe.printStackTrace();

        }
    }
}

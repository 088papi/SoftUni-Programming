import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Task6_SortLines {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        List<String> lines = Files.readAllLines(Paths.get(path));
        Collections.sort(lines);

        Files.write(Paths.get("out.txt"), lines);
    }
}

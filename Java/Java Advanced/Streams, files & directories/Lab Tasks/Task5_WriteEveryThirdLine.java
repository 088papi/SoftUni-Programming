import java.io.*;
import java.util.Scanner;

public class Task5_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {



        String path = "C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));


        String line = reader.readLine();
        int counter = 1;
        while (line != null){
           counter++;
            line = reader.readLine();
            if (counter % 3 == 0){
                writer.write(line);
                writer.write(System.lineSeparator());
            }

        }

        writer.flush();
        writer.close();

    }
}

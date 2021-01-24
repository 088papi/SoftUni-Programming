import java.io.*;
import java.util.Scanner;

public class Task4_ExtractIntegers {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);


        Scanner scanner = new Scanner(inputStream);

        FileWriter writer= new FileWriter("out.txt");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int number =scanner.nextInt();
                writer.write(String.valueOf(number));
                writer.write(System.lineSeparator());
            }
                scanner.next();


        }

        writer.flush();
        writer.close();
    }
}

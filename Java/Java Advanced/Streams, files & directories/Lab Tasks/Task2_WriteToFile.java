import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        int singleByte =  inputStream.read();
        List<Character> punctuation = new ArrayList<>();
        punctuation.add(',');
        punctuation.add('.');
        punctuation.add('!');
        punctuation.add('?');


        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt");

        while (singleByte >= 0){
            if (!punctuation.contains((char)singleByte)){

                outputStream.write(singleByte);
            }

            singleByte = inputStream.read();
        }






    }
}

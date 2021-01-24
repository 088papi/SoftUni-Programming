import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Task3_CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        int singleByte = inputStream.read();
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\out.txt");

        PrintWriter printWriter = new PrintWriter(outputStream);

        while (singleByte >= 0){


                if (singleByte == 10 || singleByte ==32){
                    printWriter.print((char)singleByte);
                } else {
                    printWriter.print(singleByte);
                }

            singleByte = inputStream.read();
        }

        printWriter.close();
        inputStream.close();
    }
}

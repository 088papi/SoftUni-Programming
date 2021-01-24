import java.io.File;

public class Task7_ListFiles {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File file = new File(fileName);

        File[] innerFiles = file.listFiles();

        for (File innerFile : innerFiles) {
            if (!innerFile.isDirectory()){
                System.out.printf("%s: [%d]%n", innerFile.getName(), innerFile.length());
            }
        }
    }
}

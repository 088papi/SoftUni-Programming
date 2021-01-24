import java.io.File;
import java.util.Objects;

public class Task8_NestedFolders {
    public static int foldersCount = 0;

    public static void main(String[] args) {
        String fileName = "C:\\Users\\pincho\\Desktop\\SoftUni\\Java\\Java Advanced\\Streams, files and directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(fileName);

        dfs(file);

        System.out.println(foldersCount + " folders");

    }

    public static void dfs(File file){
        foldersCount++;
        for(File f : Objects.requireNonNull(file.listFiles())){
            if (f.isDirectory()){
                dfs(f);
            }
        }
        System.out.println(file.getName());
    }
}

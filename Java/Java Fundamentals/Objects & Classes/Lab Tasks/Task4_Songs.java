import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 100/100
public class Task4_Songs {

    static class Song {
        public String getTypeList() {
            return TypeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }


        String TypeList;

        public void setTypeList(String typeList) {
            TypeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }

        String name;
        String time;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Song> allSongs = new ArrayList<>();
        List<Song> favSongs = new ArrayList<>();
        List<Song> laterSongs = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("_");
            String typeList = data[0];
            String name = data[1];
            String time = data[2];


            Song song = new Song();

            song.setTypeList(typeList);
            song.setName(name);
            song.setTime(time);

            allSongs.add(song);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song: allSongs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song: allSongs) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task9_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Map<String, Integer>> usersInfo = new TreeMap<>();
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");

            String IP = tokens[0].split("=")[1];
            String username = tokens[2].split("=")[1];

            usersInfo.putIfAbsent(username, new LinkedHashMap<>());
            usersInfo.get(username).putIfAbsent(IP, 0);
            usersInfo.get(username).put(IP, usersInfo.get(username).get(IP) + 1);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : usersInfo.entrySet()) {
            System.out.println(entry.getKey() + ":");
            StringBuilder sb = new StringBuilder();
            Map<String, Integer> innerMap = entry.getValue();
            for (Map.Entry<String, Integer> innerEntry: innerMap.entrySet()){
                String ipInfo = String.format("%s => %d", innerEntry.getKey(), innerEntry.getValue());
            sb.append(ipInfo);
            sb.append(", ");
            }
            String res = sb.substring(0,sb.length()-2);
            System.out.println(res + ".");
        }
    }
}

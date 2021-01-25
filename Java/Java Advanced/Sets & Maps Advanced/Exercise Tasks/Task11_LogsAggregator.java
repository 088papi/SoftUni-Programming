import java.util.*;

public class Task11_LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Set<String>> userIps = new TreeMap<>();
        Map<String, Integer> userDuration = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String ip = data[0];
            String user = data[1];
            int duration = Integer.parseInt(data[2]);

            if (!userIps.containsKey(user)) {
                userIps.put(user, new TreeSet<>());
                Set<String> currentSet = userIps.get(user);
                currentSet.add(ip);
                userIps.put(user, currentSet);
                userDuration.put(user, duration);
            } else {
                Set<String> currentSet = userIps.get(user);
                currentSet.add(ip);
                userIps.put(user, currentSet);

                userDuration.put(user, userDuration.get(user) + duration);
            }

        }

       userDuration.entrySet().forEach(a-> {
           System.out.printf("%s: %d ", a.getKey(), a.getValue());
           System.out.println(userIps.get(a.getKey()));
           });


    }
}

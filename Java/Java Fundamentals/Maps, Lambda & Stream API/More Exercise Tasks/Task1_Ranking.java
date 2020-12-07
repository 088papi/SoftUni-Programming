import com.sun.jdi.IntegerValue;
//100/100
import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Task1_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> contests = new TreeMap<>();
        Map<String, Map<String, Integer>> userContests = new TreeMap<>();


        while (!input.equals("end of contests")) {

            String[] data = input.split(":");
            String contestName = data[0];
            String password = data[1];

            contests.put(contestName, password);

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("end of submissions")) {
            String[] data = secondInput.split("=>");
            String contestName = data[0];
            String password = data[1];

            String username = data[2];
            int points = Integer.parseInt(data[3]);

            if (contests.containsKey(contestName) && contests.containsValue(password)) {
                if (!userContests.containsKey(username)) {
                    userContests.put(username, new HashMap<>());
                }

                Map<String, Integer> userPoints = userContests.get(username);
                if (userPoints.containsKey(contestName)) {
                    if (userPoints.get(contestName) < points) {
                        userPoints.put(contestName, points);
                    }
                } else {
                    userPoints.put(contestName, points);
                }
                userContests.put(username, userPoints);
            }
            secondInput = scanner.nextLine();
        }

        String bestUser = "";
        int highestScore = 0;

        for (Map.Entry<String, Map<String, Integer>> entry : userContests.entrySet()) {
            String username = entry.getKey();
            int score = entry.getValue().values()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            if (score > highestScore) {
                highestScore = score;
                bestUser = username;
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestUser, highestScore);
        System.out.println("Ranking:");
        userContests.entrySet().forEach(a -> {
            System.out.println(a.getKey());

            a.getValue().entrySet().stream().sorted((c, d) -> d.getValue().compareTo(c.getValue())).forEach(b ->
                    System.out.printf("#  %s -> %d%n", b.getKey(), b.getValue())

            );


        });
    }
}








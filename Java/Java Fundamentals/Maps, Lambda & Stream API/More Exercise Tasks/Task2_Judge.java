import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//100/100

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> participants = new LinkedHashMap<>();


        while (!input.equals("no more time")) {

            String[] data = input.split(" -> ");
            String username = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);

            Map<String, Integer> current = new LinkedHashMap<>();
            current.put(username, points);

            if (participants.containsKey(contest) && participants.get(contest).containsKey(username)) {
                participants.get(contest).put(username, Math.max(points, participants.get(contest).get(username)));

            } else if (participants.containsKey(contest)) {
                participants.get(contest).put(username, points);

            } else {
                participants.put(contest, current);
            }


            input = scanner.nextLine();
        }


        AtomicInteger counter = new AtomicInteger();


        participants.entrySet().stream().forEach(a -> {
            System.out.printf("%s: %d participants%n", a.getKey(), a.getValue().size());

            counter.set(0);

            a.getValue().entrySet().stream()
                    .sorted((f, s) -> {
                        int result = s.getValue() - f.getValue();
                        if (result == 0) {
                            result = f.getKey().compareTo(s.getKey());
                        }
                        return result;
                    })
                    .forEach(b -> {
                        System.out.printf("%d. %s <::> %d%n", counter.addAndGet(1), b.getKey(), b.getValue());
                    });
        });

        Map<String, Integer> individualTracking = new LinkedHashMap<>();
        participants.entrySet().forEach(a -> {
            a.getValue().entrySet().forEach(b -> {
                if (!individualTracking.containsKey(b.getKey())) {
                    individualTracking.put(b.getKey(), b.getValue());
                } else {
                    individualTracking.put(b.getKey(), individualTracking.get(b.getKey()) + b.getValue());
                }
            });
        });

        System.out.println("Individual standings:");
        counter.set(0);

        individualTracking.entrySet().stream()
                .sorted((f, s) -> {
                    int result = s.getValue() - f.getValue();
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());
                    }
                    return result;
                })
                .forEach(a -> {
                    System.out.printf("%d. %s -> %d%n", counter.addAndGet(1), a.getKey(), a.getValue());
                });
    }
}

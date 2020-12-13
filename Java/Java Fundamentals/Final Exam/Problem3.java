import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//91/100

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> userSent = new HashMap<>();
        Map<String, Integer> userReceived = new HashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Statistics")) {
                break;
            }

            String[] data = input.split("=");
            String command = data[0];
            switch (command) {
                case "Add":
                    String username = data[1];
                    int sent = Integer.parseInt(data[2]);
                    int received = Integer.parseInt(data[3]);

                    if (!userSent.containsKey(username)) {
                        userSent.put(username, sent);
                        userReceived.put(username, received);
                    }

                    if (userSent.get(username) + userReceived.get(username) >= maxCapacity) {
                        System.out.println(username + " reached the capacity!");
                        userSent.remove(username);
                        userReceived.remove(username);
                    }

                    break;
                case "Message":
                    String sender = data[1];
                    String receiver = data[2];
                    if (userSent.containsKey(sender) &&
                            userSent.containsKey(receiver)) {

                        if (userSent.get(sender) + 1 >= maxCapacity) {
                            System.out.println(sender + " reached the capacity!");
                            userSent.remove(sender);
                            userReceived.remove(sender);
                        } else {
                            userSent.put(sender, userSent.get(sender) + 1);
                        }

                        if (userReceived.get(receiver) + 1 >= maxCapacity) {
                            System.out.println(receiver + " reached the capacity!");
                            userSent.remove(receiver);
                            userReceived.remove(receiver);
                        } else {
                            userReceived.put(receiver, userReceived.get(receiver) + 1);
                        }

                    }

                    break;
                case "Empty":
                    username = data[1];

                    if (username.equals("All")) {
                        userSent.clear();
                        userReceived.clear();
                    } else if (userSent.containsKey(username)) {
                        userSent.remove(username);
                        userReceived.remove(username);
                    }
                    break;
            }


        }
        Iterator<Map.Entry<String, Integer>> itr = userReceived.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue() + userSent.get(entry.getKey()) >= maxCapacity) {
                System.out.println(entry.getKey() + " reached the capacity!");
                itr.remove();  //

            }
        }
        System.out.println("Users count: " + userReceived.size());

        userReceived.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> {

                    System.out.printf("%s - %d%n", e.getKey(), e.getValue() + userSent.get(e.getKey()));


                });

    }
}

package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int numberOfUpdates = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLightList = new ArrayList<>();
        for (int i = 0; i <  input.length ; i++) {
            TrafficLight trafficLight = new TrafficLight(TrafficLightState.valueOf(input[i]));
        trafficLightList.add(trafficLight);
        }

        for (int i = 0; i < numberOfUpdates ; i++) {
            trafficLightList.forEach(trafficLight -> {
                trafficLight.update();
                System.out.print(trafficLight.toString() + " ");
            });
            System.out.println();
        }
    }
}

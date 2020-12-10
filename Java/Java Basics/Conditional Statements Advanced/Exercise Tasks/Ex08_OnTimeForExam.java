import java.util.Scanner;

public class Ex08_OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMins = Integer.parseInt(scanner.nextLine());

        int totalMins = hour * 60 + minutes;
        int totalArrivalMins = arrivalHour * 60 + arrivalMins;

        int min = 0;
        int h = 0;

        if (totalMins == totalArrivalMins) {
            System.out.println("On time");
        } else if (totalMins > totalArrivalMins) { // early
            if (totalMins - totalArrivalMins <= 30) {
                min = totalMins - totalArrivalMins;
                System.out.println("On time");
                System.out.printf("%d minutes before the start", min);
            } else if (totalMins - totalArrivalMins < 60) {
                min = totalMins - totalArrivalMins;
                System.out.println("Early");
                System.out.printf("%d minutes before the start", min);
            } else if (totalMins - totalArrivalMins >= 60) {
                min = (totalMins - totalArrivalMins) % 60;
                h = (totalMins - totalArrivalMins) / 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", h, min);  // тук може да имаш грешка
            }
        }
        if (totalArrivalMins > totalMins) { //late
            if (totalArrivalMins - totalMins < 60) {
                min = totalMins - totalArrivalMins;
                System.out.println("Late");
                System.out.printf("%d minutes after the start", Math.abs(min));
            } else if (totalArrivalMins - totalMins >= 60) {
                min = (totalMins - totalArrivalMins) % 60;
                h = (totalMins - totalArrivalMins) / 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", Math.abs(h), Math.abs(min));
            }

        }
    }
}

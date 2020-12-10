import java.util.Scanner;

public class Ex08_Scholarship {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());


        double socialScholarship = 0;
        double gradeScholarship = 0;

        if( income <= minSalary && averageGrade >= 4.5) {
            socialScholarship = Math.floor(minSalary * 0.35);
        }
        if (averageGrade >= 5.50) {
            gradeScholarship = Math.floor(averageGrade * 25);
        }

        if (socialScholarship > gradeScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (socialScholarship<gradeScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");


        }

    }}

package gradingSystem;

import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
        printAverages(this.register);

    }

    public void readPoints() {
        while (true) {
            System.out.println("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);
            this.register.addPoints(points);

        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }

    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public static void printAverages(GradeRegister register) {
        double avgPoints = register.averageOfPoints();
        double avgGrades = register.averageOfGrades();

        if (avgPoints == -1) {
            System.out.println("No points recorded");
        } else {
            System.out.println("The average of points: " + avgPoints);
        }

        if (avgGrades == -1) {
            System.out.println("No grades recorded");
        } else {
            System.out.println("The average of grades: " + avgGrades);
        }
    }
}

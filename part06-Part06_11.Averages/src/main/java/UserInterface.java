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
        printAverages();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();
        }
    }

    public void printAverages() {
        double averagePoints = register.averageOfPoints();
        double averageGrades = register.averageOfGrades();

        System.out.println("The average of points: " + (averagePoints == -1 ? "-" : averagePoints));
        System.out.println("The average of grades: " + (averageGrades == -1 ? "-" : averageGrades));
    }

    public static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }
}

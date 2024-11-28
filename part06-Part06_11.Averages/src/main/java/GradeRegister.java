import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return 1.0 * sum / this.grades.size();
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return 1.0 * sum / this.points.size();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points); // Add points to the list of points
        this.grades.add(pointsToGrade(points)); // Convert points to a grade and add to the grades list
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrade(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }
}

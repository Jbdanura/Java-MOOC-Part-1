
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int top = height - 1;

        // Print the triangle part
        for(int i = 0; i < height; i++){
            printSpaces(top - i); 
            printStars(2 * i + 1); 
        }

        // Print the base of the tree (two lines, three stars each, centered)
        for(int i = 0; i < 2; i++) {
            printSpaces(height - 2); 
            printStars(3);     
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

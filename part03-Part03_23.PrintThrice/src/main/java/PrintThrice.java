
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String inp = scanner.nextLine();
        inp = inp + inp + inp;
        System.out.print(inp);
    }
}
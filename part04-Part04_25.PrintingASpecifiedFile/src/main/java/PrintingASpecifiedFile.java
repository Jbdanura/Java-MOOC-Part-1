
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String userInput = scanner.nextLine();
        try (Scanner scannerFile = new Scanner(Paths.get(userInput))) {
            while (scannerFile.hasNextLine()) {
                String line = scannerFile.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}

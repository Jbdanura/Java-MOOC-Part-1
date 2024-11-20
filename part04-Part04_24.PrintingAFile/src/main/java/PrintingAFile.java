
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;


public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}

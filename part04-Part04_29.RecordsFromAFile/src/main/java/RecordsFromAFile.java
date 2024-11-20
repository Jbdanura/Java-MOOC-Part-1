
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String[] line = fileScanner.nextLine().split(",");
                if(Integer.valueOf(line[1]) > 1){
                    System.out.println(line[0] + ", age: " + line[1] + " years");
                } else if (Integer.valueOf(line[1]) == 0){
                    System.out.println(line[0] + ", age: " + line[1] + " years");
                } else{
                    System.out.println(line[0] + ", age: " + line[1] + " year");
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            return;
        }
    }
}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(",");
                if(line[0].equals(team)){
                    games++;
                    if(Integer.valueOf(line[2]) > Integer.valueOf(line[3])){
                        wins++;
                    } else if (Integer.valueOf(line[2]) < Integer.valueOf(line[3])){
                        losses++;
                    }
                } else if(line[1].equals(team)){
                    games++;
                    if(Integer.valueOf(line[3]) > Integer.valueOf(line[2])){
                        wins++;
                    } else if (Integer.valueOf(line[3]) < Integer.valueOf(line[2])){
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}

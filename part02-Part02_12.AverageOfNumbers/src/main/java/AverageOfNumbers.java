
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNums = 0;
        int totalResult = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num != 0){
                totalNums++;
                totalResult += num;
            } else{
                System.out.println("Average of the numbers: " + (double)totalResult / totalNums);
                break;
            }
            
        }
    }
}


import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNums = 0;
        int totalResult = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num > 0){
                totalNums++;
                totalResult += num;
            } else if(num == 0){
                if(totalResult == 0){
                    System.out.println("Cannot calculate the average");
                    break;
                } else{
                    System.out.println((double)totalResult / totalNums);
                    break;
                }
            } else{
                continue;
            }
        }
    }
}

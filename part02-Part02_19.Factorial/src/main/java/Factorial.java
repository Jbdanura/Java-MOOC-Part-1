
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int total = 1;
        if(num == 0){
            System.out.println("Factorial: 1");
        } else {
            for(int i = 1; i <= num; i++){
                total *= i;
            }
            System.out.println("Factorial: " + total);
        }
    }
}

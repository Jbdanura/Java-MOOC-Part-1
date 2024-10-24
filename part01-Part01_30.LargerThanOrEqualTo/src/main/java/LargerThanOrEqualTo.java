
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a numba:");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give another numba:");
        int numTwo = Integer.valueOf(scan.nextLine());
        if(num > numTwo ){
            System.out.println("Greater number is: " + num);
        } else if (numTwo > num){
            System.out.println("Greater number is: " + numTwo);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}

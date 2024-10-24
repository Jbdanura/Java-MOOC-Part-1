
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int num = Integer.valueOf(scan.nextLine());
        if(num > 100){
            System.out.println("incredible!");
        } else if(num >= 90){
            System.out.println("5");
        } else if(num >= 80){
            System.out.println("4");
        } else if(num >= 70){
            System.out.println("3");
        } else if(num >= 60){
            System.out.println("2");
        } else if(num >= 50){
            System.out.println("1");
        } else if(num >= 0){
            System.out.println("failed");
        } else{
            System.out.println("impossible!");
        }
    }
}

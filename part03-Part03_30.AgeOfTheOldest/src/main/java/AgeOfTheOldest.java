
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        while(true){
            String inp = scanner.nextLine();
            if(inp.length() == 0){
                break;
            }
            String[] pieces = inp.split(",");
            if(Integer.valueOf(pieces[1]) > old){
                old = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + old);
    }
}

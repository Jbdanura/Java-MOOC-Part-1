
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String inp = scanner.nextLine();
            if(inp.length() == 0){
                break;
            }
            String[] pieces = inp.split(" ");
            System.out.println(pieces[0]);

        }

    }
}
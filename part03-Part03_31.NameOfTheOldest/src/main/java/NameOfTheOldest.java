
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        String name = "";
        while(true){
            String inp = scanner.nextLine();
            if(inp.length() == 0){
                break;
            }
            String[] pieces = inp.split(",");
            if(Integer.valueOf(pieces[1]) > old){
                old = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}

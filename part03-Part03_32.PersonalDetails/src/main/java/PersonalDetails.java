
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int quant = 0;
        String longest = "";
        while(true){
            String inp = scanner.nextLine();
            if(inp.length() == 0){
                break;
            }
            String[] pieces = inp.split(",");
            if(pieces[0].length() > longest.length()){
                longest = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            quant++;
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (double)sum/quant);

    }
}

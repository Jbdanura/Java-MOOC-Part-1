
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = "";
        while(true){
            String inp = scanner.nextLine();
            if(inp.length() == 0){
                break;
            }
            res += inp + " ";
        }
        String[] pieces = res.split(" ");
        for(String piece: pieces){
            System.out.println(piece);
        }
    }
}

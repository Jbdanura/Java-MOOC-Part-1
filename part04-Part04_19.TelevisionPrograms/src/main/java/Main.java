import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int dur = Integer.valueOf(scanner.nextLine());

            TelevisionProgram program = new TelevisionProgram(name,dur);
            programs.add(program);
        }
        System.out.println("Program's max duration?");
        int maxDur = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram program: programs){
            if(program.getDuration() <= maxDur){
                System.out.println(program);
            }
        }
    }
    
}

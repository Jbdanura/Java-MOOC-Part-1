
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            String lastName = scanner.nextLine();
            String id = scanner.nextLine();
            PersonalInformation psi = new PersonalInformation(name,lastName,id);
            infoCollection.add(psi);
        }
        for(PersonalInformation psi: infoCollection){
            System.out.println(psi.getFirstName() + " " + psi.getLastName());
        }
    }
}

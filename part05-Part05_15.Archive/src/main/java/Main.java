import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Item> items = new HashSet<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item newItem = new Item(identifier, name);

            if (!items.contains(newItem)) {
                items.add(newItem);
            }
        }

        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

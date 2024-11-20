import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name,pages,year);
            books.add(book);
        }
        System.out.println("What information will be printed?");
        String option = scanner.nextLine();
        if(option.equals("name")){
            for(Book book: books){
                System.out.println(book.getName());
            }
        } else {
            for(Book book: books){
                System.out.println(book);
            }
        }
    }
}

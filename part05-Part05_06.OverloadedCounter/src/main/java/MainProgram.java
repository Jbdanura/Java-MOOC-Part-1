
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter();

        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        counter1.increase();
        counter1.increase(3);
        counter1.decrease();
        counter1.decrease(2);
        System.out.println("Final value of counter1: " + counter1.value());

        counter2.increase(10);
        counter2.decrease(5);
        counter2.decrease(-2); 
        System.out.println("Final value of counter2: " + counter2.value());
    }
}

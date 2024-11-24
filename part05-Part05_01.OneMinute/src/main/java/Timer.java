/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotabe
 */
public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer() {
        this.hundredths = new ClockHand(100); 
        this.seconds = new ClockHand(60);   
    }

    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.seconds.value(), this.hundredths.value());
    }

    // Main method for testing
    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

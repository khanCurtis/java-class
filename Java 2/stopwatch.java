/******************************************************************************

Stopwatch
Khanon Curtis
5/8/25

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StopWatch stopwatch = new StopWatch();

        System.out.println("Hit ENTER to start Stopwatch.");
        input.nextLine();
        stopwatch.start();

        System.out.println("Hit ENTER to stop Stopwatch.");
        System.out.println("running.....");
        input.nextLine();
        stopwatch.stop();

        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " milliseconds");
        input.close();
    }
}

class StopWatch {
    long startTime;
    long stopTime;

    public StopWatch() {
        
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.stopTime - this.startTime;
    }
}

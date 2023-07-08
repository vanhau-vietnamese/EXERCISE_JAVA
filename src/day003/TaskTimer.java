package day003;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskTimer {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Runnable task = () -> {
            System.out.println("Hello World!");
        };

        long initialDelay = 13;
        long period = 3; // Định kỳ là 3 giây

        executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);
    }
}



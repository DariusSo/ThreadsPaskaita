package org.example;

import java.util.Random;

public class PositiveRandomNumber implements Runnable{
    Random random = new Random();

    @Override
    public void run() {
        int number = (random.nextInt(0, 100));
        System.out.println(Thread.currentThread().getName() + ": " + number);
    }

}

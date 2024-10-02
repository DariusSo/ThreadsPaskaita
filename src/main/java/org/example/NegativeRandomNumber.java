package org.example;

import java.util.List;
import java.util.Random;

public class NegativeRandomNumber implements Runnable{

    Random random = new Random();

    @Override
    public void run() {
        int number = (random.nextInt(-100, 0));
        System.out.println(Thread.currentThread().getName() + ": " + number);
    }
}

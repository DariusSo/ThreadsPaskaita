package org.example;

import java.util.Random;

public class CapitalRandomLetter implements Runnable {

    Random random = new Random();

    @Override
    public void run() {
        char letter = (char) ('A' + random.nextInt(6));
        System.out.println(Thread.currentThread().getName() + ": " + letter);
    }
}

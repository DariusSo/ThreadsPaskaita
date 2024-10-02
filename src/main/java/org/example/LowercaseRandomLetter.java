package org.example;

import java.util.Random;

public class LowercaseRandomLetter implements Runnable{

    Random random = new Random();

    @Override
    public void run() {
        char letter = (char) ('a' + random.nextInt(6));
        System.out.println(Thread.currentThread().getName() + ": " + letter);
    }
}

package org.example;

import java.util.Random;

public class ThreadRace implements Runnable{
    @Override
    public void run() {
        int score = 0;
        Random random = new Random();
        while (score < 1000){
            score = score + random.nextInt(0, 1000);
            if (score >= 1000){
                System.out.println("Winner is: " + Thread.currentThread().getName() + "| Score: " + score);
                System.exit(0);
            }

        }

    }
}

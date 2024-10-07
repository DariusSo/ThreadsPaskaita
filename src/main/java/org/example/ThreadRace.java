package org.example;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadRace implements Runnable{

    private AtomicBoolean winner;
    Random random = new Random();

    public ThreadRace(AtomicBoolean winner) {
        this.winner = winner;
    }

    @Override
    public void run() {
        int score = 0;
        try {
            while (score < 1000 && !winner.get()) {
                int points = random.nextInt(100) + 1;
                score += points;
                System.out.println(Thread.currentThread().getName() + "have: " + points + " total: " + score);

                if (score >= 1000 && !winner.get()) {
                    winner.set(true);
                    System.out.println(Thread.currentThread().getName() + " is a winner!");
                }

                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
        }

    }
}

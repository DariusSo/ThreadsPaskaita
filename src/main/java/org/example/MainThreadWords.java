package org.example;

import java.sql.SQLOutput;

import static org.example.Main.*;
import static org.example.Main.justLock;

public class MainThreadWords implements Runnable{
    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " is waiting for other threads to finish");
            isEveryoneFinished.await();
            System.out.println("Total times word is mentioned in files: " + wordCount);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

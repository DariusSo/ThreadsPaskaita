package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import static org.example.Main.*;

public class WordReader implements Runnable{

    private String word;
    private String path;

    public WordReader(String word, String path) {
        this.word = word;
        this.path = path;
    }

    @Override
    public void run() {
        FileReader fileReader = null;
        int amount = 0;


        try {

            fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //reentrantReadWriteLock.readLock().lock();
            for(String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {

                if(line.equals(word)){
                    amount++;
                }
                Thread.sleep(3);

            }
            wordCount.getAndAdd(amount);
            System.out.println(Thread.currentThread().getName() +  ": Word " + word + " is mentioned " + amount + " times");
            isEveryoneFinished.countDown();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

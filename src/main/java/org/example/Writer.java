package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static org.example.Main.*;

public class Writer implements Runnable{

    private AtomicBoolean flag;

    public Writer(AtomicBoolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {

            FileWriter fileWriter = new FileWriter("C:\\Users\\jurat\\IdeaProjects\\ThreadsPaskaita\\src\\main\\java\\org\\example\\text.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            flag.set(true);
            reentrantReadWriteLock.writeLock().lock();
            for(int i = 0; i < 5; i++){
                bufferedWriter.write("rasau");
                System.out.println(Thread.currentThread().getName() + ": rasau");
                Thread.sleep(500);

            }
            reentrantReadWriteLock.writeLock().unlock();
            flag.set(false);




        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

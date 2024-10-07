package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static org.example.Main.*;

public class Reader implements Runnable{

    private AtomicBoolean flag;

    public Reader(AtomicBoolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        FileReader fileReader = null;


        try {

            fileReader = new FileReader("C:\\Users\\jurat\\IdeaProjects\\ThreadsPaskaita\\src\\main\\java\\org\\example\\text.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            reentrantReadWriteLock.readLock().lock();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
//                if(!reentrantReadWriteLock.isWriteLocked())

                    System.out.println(Thread.currentThread().getName() + ": " + line);
                    Thread.sleep(500);

            }
            reentrantReadWriteLock.readLock().unlock();


            //System.out.println(bufferedReader.readLine());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

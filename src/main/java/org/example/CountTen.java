package org.example;

public class CountTen implements Runnable{
    @Override
    public void run() {

        for(int i = 1; i <=10; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

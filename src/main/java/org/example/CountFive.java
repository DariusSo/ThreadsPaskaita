package org.example;

public class CountFive implements Runnable{

    private int miliseconds;

    @Override
    public void run() {
        int i = 1;
        while(i != 6){
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.currentThread().sleep(miliseconds);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }

    public CountFive(int miliseconds) {
        this.miliseconds = miliseconds;
    }
}

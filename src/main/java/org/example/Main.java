package org.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static AtomicBoolean winner = new AtomicBoolean(false);
    private static AtomicBoolean flag = new AtomicBoolean(false);

    public static final ReentrantLock justLock = new ReentrantLock();

    public static final Condition areYouReadyToRead = justLock.newCondition();

    public static CountDownLatch isEveryoneFinished = new CountDownLatch(3);

    public static AtomicInteger wordCount = new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {

//        Thread thread1 = new Thread(new CapitalRandomLetter(), "Thread");
//        Thread thread2 = new Thread(new LowercaseRandomLetter(), "Thread1");
//        Thread thread3 = new Thread(new NegativeRandomNumber(), "Thread2");
//        Thread thread4 = new Thread(new PositiveRandomNumber(), "Thread3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//
//        Thread.sleep(2000);
//
//        ////////////////////////////////________PIRMA UZDUOTIS__________\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//
//        Thread thread5 = new Thread(new CountTen(), "Count ten");
//        Thread thread6 = new Thread(new CountTen(), "Count ten another one");
//        thread5.start();
//        thread6.start();
//
//        Thread.sleep(10000);
//
//        ////////////////////////////////________ANTRA UZDUOTIS__________\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//
//        int i = 0;
//        while(i != 4){
//            Thread threadWhile = new Thread(new CountTen(), "Count ten" + i);
//            threadWhile.start();
//            i++;
//        }
//
//        Thread.sleep(10000);
//
//        ////////////////////////////////________TRECIA UZDUOTIS__________\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//
//        Random random = new Random();
//        int j = 0;
//        while(j != 4){
//
//            Thread threadWhile = new Thread(new CountFive(random.nextInt(500, 2000)), "Count five" + j);
//            threadWhile.start();
//            j++;
//        }
        ////////////////////////////////________THREAD RACE__________\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//        Thread threadR1 = new Thread(new ThreadRace(winner));
//        Thread threadR2 = new Thread(new ThreadRace(winner));
//        Thread threadR3 = new Thread(new ThreadRace(winner));
//        Thread threadR4 = new Thread(new ThreadRace(winner));
//
//        threadR1.start();
//        threadR2.start();
//        threadR3.start();
//        threadR4.start();
        ////////////////////////////////________WRITER/READER__________\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//        Thread threadRead1 = new Thread(new Reader(flag), "Reader 1");
//        threadRead1.start();
//        Thread threadRead2 = new Thread(new Reader(flag), "Reader 2");
//        threadRead2.start();
//        Thread.sleep(2000);
//
//        Thread threadWrite1 = new Thread(new Writer(flag), "Writer 1");
//        threadWrite1.start();
//
//        Thread threadWrite2 = new Thread(new Writer(flag), "Writer 2");
//        threadWrite2.start();

        ////////////////////////////////________WORD SEARCH__________\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        Thread threadWords1 = new Thread(new WordReader("teisingasZodis", "C:\\Users\\Darius\\IdeaProjects\\ThreadsPaskaita\\src\\main\\java\\org\\example\\words.txt"));
        threadWords1.start();
        Thread threadWords2 = new Thread(new WordReader("teisingasZodis", "C:\\Users\\Darius\\IdeaProjects\\ThreadsPaskaita\\src\\main\\java\\org\\example\\words2.txt"));
        threadWords2.start();
        Thread threadWords3 = new Thread(new WordReader("teisingasZodis", "C:\\Users\\Darius\\IdeaProjects\\ThreadsPaskaita\\src\\main\\java\\org\\example\\words3.txt"));
        threadWords3.start();


        Thread threatWordsCount = new Thread(new MainThreadWords(), "Main");
        threatWordsCount.start();

    }
}
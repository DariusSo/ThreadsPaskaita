package org.example;

import java.util.Random;

public class Main {
    static boolean flag = false;
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
        int k = 0;

        while(k != 4){
            try{
                Thread threadWhile = new Thread(new ThreadRace(), "Thread" + k);
                threadWhile.start();
                k++;
            }catch (Exception e){
                break;
            }

        }

//        Thread threadRace1 = new Thread(new ThreadRace(), "Thread" + 1);
//        Thread threadRace2 = new Thread(new ThreadRace(), "Thread" + 2);
//        Thread threadRace3 = new Thread(new ThreadRace(), "Thread" + 3);
//        Thread threadRace4 = new Thread(new ThreadRace(), "Thread" + 4);
//
//
//        threadRace1.start();
//        threadRace2.start();
//        threadRace3.start();
//        threadRace4.start();


    }
}
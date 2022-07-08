package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample implements Runnable {

    private String localName;

    public RunnableExample() {
    }

    public RunnableExample(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
    }

    public String getLocalName() {return localName;}
    public void setLocalName(String localName) {this.localName = localName;}

    public static void main(String[] args) {
        //ThreadClass threadClass = new ThreadClass("First");
        //threadClass.start(); //method ThreadClass.run()
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new RunnableExample("1"));

        //Thread thread1 = new Thread(new RunnableExample("1"));
        Thread thread2 = new Thread(new RunnableExample("2"));
        Thread thread3 = new Thread(new RunnableExample("3"));
        Thread thread4 = new Thread(new RunnableExample("4"));
        Thread thread5 = new Thread(new RunnableExample("5"));
        Thread thread6 = new Thread(new RunnableExample("6"));
        Thread thread7 = new Thread(new RunnableExample("7"));
//        thread1.setPriority(10);
//        thread2.setPriority(9);
//        thread3.setPriority(8);
//        thread4.setPriority(7);
//        thread5.setPriority(6);
//        thread6.setPriority(5);
//        thread7.setPriority(4);
        //thread1.start(); //method RunnableClass.run()
        thread2.start(); //method RunnableClass.run()
        thread3.start(); //method RunnableClass.run()
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
    }
}
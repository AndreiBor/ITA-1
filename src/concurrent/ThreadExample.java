package concurrent;

public class ThreadExample extends Thread {

    public ThreadExample() {
    }

    public ThreadExample(String name) {
        super(name);
    }

    public ThreadExample(Runnable target) {
        super(target);
        System.out.println(target + " will running");
    }

    @Override
    public void run() {
        System.out.println("ThreadClass run() method " + "Thread name is: " + this.getName());
    }

    public static void main(String[] args) {
        ThreadExample threadClass1 = new ThreadExample("1");
        threadClass1.start(); //method ThreadClass.run()
        ThreadExample threadClass2 = new ThreadExample("2");
        threadClass2.start(); //method ThreadClass.run()
        ThreadExample threadClass3 = new ThreadExample("3");
        threadClass3.start(); //method ThreadClass.run()
    }
}
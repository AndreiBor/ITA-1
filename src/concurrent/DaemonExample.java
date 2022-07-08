package concurrent;


public class DaemonExample extends Thread {

    public DaemonExample() {
    }

    public DaemonExample(String name) {
        super(name);
        int i = 0;
        while (true) {
            System.out.println(i++);
        }
    }

    public DaemonExample(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        System.out.println("ThreadClass run() method " + "Thread name is: " + this.getName());
    }

    public static void main(String[] args) {
        DaemonExample threadClass1 = new DaemonExample("1");
        threadClass1.setDaemon(true);
        threadClass1.start(); //method ThreadClass.run()
        return;

    }
}
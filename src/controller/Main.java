package controller;

public class Main {
    public static void main(String[] args) {
//        TestThread x1 = new TestThread( "a");
//        x1.start();
//        TestThread x2 = new TestThread( "b");
//        x2.start();

        DemoThread t = new DemoThread();
        Thread dt1 = new Thread(t);
        Thread dt2 = new Thread(t);
        dt1.start();
        dt2.start();
    }
}

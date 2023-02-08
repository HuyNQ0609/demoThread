package controller;

public class Main {
    public static void main(String[] args) {
        TestThread x1 = new TestThread( "a");
        x1.start();
        TestThread x2 = new TestThread( "b");
        x2.start();
    }
}

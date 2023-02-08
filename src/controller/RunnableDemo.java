package controller;
/** Vòng đời của Thread */
class TestThread extends Thread {
    private String threadName;

    public TestThread(String threadName) {
        super();
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getThreadName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } /* Sleeping 1s roi running */
    }
}
/*Các luồng thread chạy song song dẫn đến việc các giá trị in ra màn hình sẽ không theo thứ tự*/

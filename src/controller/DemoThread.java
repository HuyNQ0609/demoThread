package controller;

/** Đồng bộ hóa Thread */
public class DemoThread implements Runnable {

    public int total;

    public DemoThread() {
        this.total = 1000;
    }

    /* Sau khi debug hoặc chạy, nhận thấy 2 luồng không đồng bộ. Để đồng bộ hóa
        ta thêm từ synchronized vào trước tên hàm.
       Nếu thread dt1 truy xuất qua hàm rút tiền trước thì nó sẽ chiếm giữ hàm và khóa lại
            thread dt2 muốn chạy thì phải chờ thread dt1 chạy xong mới đến nó */
    public synchronized void withdrawMoney() throws InterruptedException {
        if(total > 0) {
            Thread.sleep(1000);
            total -= 1000;
            System.out.println(total);
        } else {
            System.out.println("No money!");
        }
    }
    @Override
    public void run() {
        try {
            withdrawMoney();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

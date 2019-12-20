package project;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        Coutumer coutumer = new Coutumer(acc);
        Thread a1 = new Thread(coutumer);
        Thread a2 = new Thread(coutumer);
        a2.setName("ÒÒ");
        a1.setName("¼×");
        a2.start();
        a1.start();

    }
}
class Account {
    private double balance;

    public void cun(double money)  {
         synchronized (this){
        this.balance += money;
        System.out.println(Thread.currentThread().getName() + ":´æÇ®³É¹¦£¬Óà¶îÎª:" + balance);
         }
    }
}
class Coutumer implements Runnable {
    private Account account;

    public Coutumer(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            account.cun(1);
        }
    }
}




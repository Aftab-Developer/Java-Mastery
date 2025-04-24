package in.Aftab.multithreading.Locks.Lock;

public class TestBankAccount  {
    BankAccount bankAccount = new BankAccount();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            bankAccount.withDraw(50);
        }
    };

    public static void main(String[] args) {
        TestBankAccount testBankAccount = new TestBankAccount();
        Thread t1 = new Thread(testBankAccount.runnable , "thread 01") ;
        Thread t2 = new Thread(testBankAccount.runnable , "thread 02") ;
        t1.start();
        t2.start();
    }
}

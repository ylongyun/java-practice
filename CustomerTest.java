public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");

        Account acct = new Account(1000,2000,0.0123);

        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println(cust.getFirstName()+"\n"+
                cust.getAccount().getAnnualInterestRate()+"\n"
                +cust.getAccount().getBalance()+"\n"+cust.getAccount().getId());
    }
}

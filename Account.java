public class Account {
    private int id;//�˺�
    private double balance;//���
    private double annualInterestRate;//������
    public Account(int id,double balance,double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("���ѳɹ�ȡ��"+amount+"Ԫ��");
        }else{
            System.out.println("���㣬�޷���ȡ��");
        }
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("�ɹ�����"+amount+"Ԫ��");
        }
    }
}

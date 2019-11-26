public class Account1 {
    private int Id;
    private String paw;
    private double Balance;
    private static double Risk;
    private static double minMoney;
    private static int init = 4180931;
    public Account1(){
        this.Id = init++;
    }

    public Account1(String paw,double Balance){
        this();
        this.Balance = Balance;
        this.paw = paw;
    }
    public void setId(int id) {
        Id = id;
    }

    public void setPaw(String paw) {
        this.paw = paw;
    }

    public static void setRisk(double risk) {
        Risk = risk;
    }

    public static void setMinMoney(double minMoney) {
        Account1.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "Id=" + Id +
                ", paw='" + paw + '\'' +
                ", Balance=" + Balance +
                '}';
    }

    public String getPaw() {
        return paw;
    }

    public double getBalance() {
        return Balance;
    }
}

public class OrderTest1 {
    public static void main(String[] args) {
        Order1 o1 = new Order1(66,"º©º©");
        Order1 o2 = new Order1(66,"º©º©");
        System.out.println(o1.equals(o2));
    }
}

class Order1{

    private int orderId;
    private String orderName;

    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj instanceof Order1){
            Order1 order1 = (Order1)obj;
            if(this.orderId == order1.orderId &&
                    this.orderName.equals(order1.orderName)){
                return true;
            }
        }
        return false;
    }

    public Order1(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
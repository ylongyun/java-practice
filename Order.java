public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderprotected ;
    public int orderPublic;
    private void methodPrivateO(){
        orderPrivate = 1;
        orderDefault = 2;
        orderprotected = 3;
        orderPublic = 4;
    }

    void methodDefaultot(){
        orderPrivate = 1;
        orderDefault = 2;
        orderprotected = 3;
        orderPublic = 4;
    }
    protected void methodProtected(){
        orderPrivate = 1;
        orderDefault = 2;
        orderprotected = 3;
        orderPublic = 4;
    }
    public void methodPublico(){
        orderPrivate = 1;
        orderDefault = 2;
        orderprotected = 3;
        orderPublic = 4;
    }

}

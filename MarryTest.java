public class MarryTest {
    public static void main(String[] args) {
        Boy yly = new Boy("������",19);
        Girl zzy = new Girl("����",19);
//        yly.marry(zzy);
//        yly.shout();
        zzy.marry(yly);
        zzy.shout();
    }
}

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        TriAngleTest ts = new TriAngleTest();
        t1.setBase(1.5);
        t1.setHeight(2.8);
        System.out.println(t1.getBase()+"\t"+t1.getHeight());
        TriAngle t2 = new TriAngle(3.0,4.0);
        System.out.println(t2.getBase()+"\t"+t2.getHeight());
        System.out.print(ts.s(t1.getBase(),t1.getHeight())+"\n");
        System.out.println(ts.s(t2.getBase(),t2.getHeight()));

    }
    public double s(double b,double t){
        double s;
        s = b * t * 0.5;
        return s;
    }
}

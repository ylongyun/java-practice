public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Circle c2 = new Cylinder();
        System.out.println(c1.findArea()+"\n"+c1.Volume());
        System.out.println(c2.findArea());
        c2.setRadius(2);
        System.out.println(c2.getRadius());
    }
}

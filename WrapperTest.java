public class WrapperTest {
    public static void main(String[] args) {
        int num1 = 10;
        Integer in1 = num1;
        Integer in2 = Integer.valueOf("158");
        System.out.println(in1.toString(in2));
        Float f1 = 12.5f;
        float f3 = f1.floatValue();
        System.out.println(f3);
//        Number ff = Float.valueOf("12.5");

//        System.out.println(f2.toString());
//        Boolean b1 = Boolean.valueOf("ture123");
//        Boolean b2 = Boolean.valueOf("ss");
//        System.out.println(b1);
    }
}

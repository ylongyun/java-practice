//import static org.graalvm.compiler.hotspot.nodes.type.MethodPointerStamp.method;

public class WrapperTest {
    public static void main(String[] args) {
        Double d1 = Double.valueOf("125.36");
        String s1 = String.valueOf((d1));
        System.out.println(d1.toString()+s1);
        String s2 = "123";
        int i1 = Integer.parseInt(s2);
        System.out.println(i1);






//        int num1 = 10;
//        Integer in1 = num1;
//        Integer in2 = Integer.valueOf("158");
//        System.out.println(in1.toString(in2));
//        Float f1 = 12.5f;
//        float f3 = f1.floatValue();
//        System.out.println(f3);
//        int a = 10;
//        method(a);
//        Number ff = Float.valueOf("12.5");

//        System.out.println(f2.toString());
//        Boolean b1 = Boolean.valueOf("ture123");
//        Boolean b2 = Boolean.valueOf("ss");
//        System.out.println(b1);
    }
}
